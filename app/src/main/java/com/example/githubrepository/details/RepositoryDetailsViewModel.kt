package com.example.githubrepository.details

import android.app.Application
import androidx.lifecycle.*
import com.example.githubrepository.network.RepositoryDetailsModel
import com.example.githubrepository.network.RepositoryModel

class RepositoryDetailsViewModel(repoProperty: RepositoryDetailsModel) : ViewModel() {

    private val _selectedProperty = MutableLiveData<RepositoryDetailsModel>()
    val selectedProperty: LiveData<RepositoryDetailsModel>
        get() = _selectedProperty

    init {
        _selectedProperty.value = repoProperty
    }


}