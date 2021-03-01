package com.example.githubrepository.network

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

data class Licence (
    val key: String?,
    val name: String?,

    @Json(name = "spdx_id")
    val spdxID: String?,

    val url: Any? = null,

    @Json(name = "node_id")
    val nodeID: String?
)