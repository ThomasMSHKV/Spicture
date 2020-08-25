package com.eugens.example.museum.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eugens.example.museum.fragments.NavigationFragment
import com.eugens.example.museum.R
import com.eugens.example.museum.fragments.FirstFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, FirstFragment())
                .commit()

        }

    }

//git



