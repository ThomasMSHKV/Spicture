package com.eugens.example.museum.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.eugens.example.museum.R
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navigationFragment = NavigationFragment()
        val nameEdittext = nameEditText.text
        val lastNameEdittext = lastNameEditText.text


        buttonRegister.setOnClickListener {
            navigationFragment.arguments=Bundle().also {
                it.putInt("key",1)
                Toast.makeText(activity, "Hello $nameEdittext $lastNameEdittext, you got a ticket", Toast.LENGTH_LONG).show()
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,navigationFragment)
                ?.commit()
        }
    }
}

