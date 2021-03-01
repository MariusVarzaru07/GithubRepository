package com.example.githubrepository.details

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.githubrepository.network.RepositoryDetailsModel
import com.example.githubrepository.network.RepositoryModel

class RepositoryDetailsViewModelFactory(
    private val repoProperty: RepositoryDetailsModel
) : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RepositoryDetailsViewModel::class.java)) {
            return RepositoryDetailsViewModel(repoProperty) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
