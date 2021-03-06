package com.example.stepbystepapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.stepbystepapp.R
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * @author Marshall Ladd
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // 02 This line is what links the XML layout to the Kotlin Fragment
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    // 08 add final on click listener to move from welcome RecView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonAllEmployees.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_recyclerViewFragment)
        }
    }
}
