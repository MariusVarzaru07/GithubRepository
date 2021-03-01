package com.example.githubrepository.details

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.example.githubrepository.databinding.RepositoryDetailsBinding

class RepositoryDetailsFragment : Fragment() {

    //private val args : Reposi by navArgs()

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {


        val binding = RepositoryDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this

        val repoProperty = RepositoryDetailsFragmentArgs.fromBundle(arguments!!).parcelableDetails

        val viewModelFactory = RepositoryDetailsViewModelFactory(repoProperty)
        binding.viewModel = ViewModelProviders.of(
            this, viewModelFactory).get(RepositoryDetailsViewModel::class.java)

        return binding.root
    }
}