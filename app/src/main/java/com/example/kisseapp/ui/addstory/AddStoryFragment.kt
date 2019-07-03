package com.example.kisseapp.ui.addstory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.kisseapp.R

class AddStoryFragment : Fragment() {

    companion object {
        fun newInstance() = AddStoryFragment()
    }

    private lateinit var viewModel: AddStoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.add_story_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddStoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
