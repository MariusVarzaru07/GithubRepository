package com.example.githubrepository

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepository.network.RepositoryModel
import com.example.githubrepository.overview.RepositoryListAdapter
import java.util.*
import kotlin.Comparator

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<RepositoryModel>?) {
    val repoList = data?.map { it }?.sortedByDescending { it.stargazersCount }
    val adapter = recyclerView.adapter as RepositoryListAdapter
    adapter.submitList(repoList)
}

@BindingAdapter("repositoryStars")
fun TextView.setStars(property: RepositoryModel) {
    property?.let {
        text = property.stargazersCount.toString()
    }
}

@BindingAdapter("repositoryFullName")
fun TextView.setName(property: RepositoryModel) {
    property?.let {
        text = property.fullName
    }
}

@BindingAdapter("repositoryDescription")
fun TextView.setDescription(property: RepositoryModel) {
    property?.let {
        text = property.description
    }
}