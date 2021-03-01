package com.example.githubrepository.overview

import android.annotation.SuppressLint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubrepository.network.GithubApi
import com.example.githubrepository.network.RepositoryDetailsModel
import com.example.githubrepository.network.RepositoryModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.await

@SuppressLint("NullSafeMutableLiveData")
class OverviewViewModel : ViewModel() {

    // The internal MutableLiveData String that stores the status of the most recent request
    private val _response = MutableLiveData<String>()
    // The external immutable LiveData for the request status String
    val response: LiveData<String>
        get() = _response

    private val _properties = MutableLiveData<List<RepositoryModel>>()
    val properties: LiveData<List<RepositoryModel>>
        get() = _properties

    private val _navigateToSelectedRepository = MutableLiveData<RepositoryDetailsModel>()
    val navigateToSelectedRepository: LiveData<RepositoryDetailsModel>
        get() = _navigateToSelectedRepository

    private lateinit var newModel:RepositoryDetailsModel

    private var viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    init {
        getRepositoryProperties()
        _navigateToSelectedRepository.value = null
    }

    private fun getRepositoryProperties() {

   /*     GithubApi.retrofitService.getProperties("octokit").enqueue( object: Callback<List<RepositoryModel>> {
            override fun onFailure(call: Call<List<RepositoryModel>>, t: Throwable) {
                _response.value = "Failure: " + t.message
            }

            override fun onResponse(call: Call<List<RepositoryModel>>, response: Response<List<RepositoryModel>>) {
                var listResult = response.body()
                _properties.value = listResult!!
            }
        })*/

        coroutineScope.launch {

            var getPropertiesDeferred = GithubApi.retrofitService.getProperties("octokit")
            try {
                var listResult = getPropertiesDeferred.await()
                _properties.value = listResult!!
            } catch (e: Exception) {
                _response.value = "Failure: ${e.message}"
            }

        }

    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    fun displayPropertyDetails(repoProperty: RepositoryModel) {
        newModel = RepositoryDetailsModel(
            repoProperty.name!!,
            repoProperty.watchers,
            repoProperty.forks,
            repoProperty.htmlURL!!
        )
        _navigateToSelectedRepository.value = newModel
    }

    fun displayPropertyDetailsComplete() {
        _navigateToSelectedRepository.value = null
    }


}