package com.example.githubrepository.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RepositoryDetailsModel(
    val user:String,
    val watchers: Long?,
    val forks: Long?,
    val link:String
        ):Parcelable
