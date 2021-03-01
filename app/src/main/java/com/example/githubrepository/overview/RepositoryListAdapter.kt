package com.example.githubrepository.overview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.githubrepository.databinding.RepositoryLayoutBinding
import com.example.githubrepository.network.RepositoryModel

class RepositoryListAdapter(val onClickListener: OnClickListener) : ListAdapter<RepositoryModel, RepositoryListAdapter.RepositoryViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<RepositoryModel>() {
        override fun areItemsTheSame(oldItem: RepositoryModel, newItem: RepositoryModel): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: RepositoryModel, newItem: RepositoryModel): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryListAdapter.RepositoryViewHolder {
        return RepositoryViewHolder(RepositoryLayoutBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: RepositoryListAdapter.RepositoryViewHolder, position: Int) {
        val repositoryProperty = getItem(position)
        holder.bind(repositoryProperty)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(repositoryProperty)
        }
    }

    class RepositoryViewHolder(private var binding: RepositoryLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(repositoryProperty: RepositoryModel) {
            binding.property = repositoryProperty
            binding.executePendingBindings()
        }
    }

    class OnClickListener(val clickListener: (repoProperty: RepositoryModel) -> Unit) {
        fun onClick(repoProperty:RepositoryModel) = clickListener(repoProperty)
    }

}