package com.ikozlu.anketapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikozlu.anketapp.R
import com.ikozlu.anketapp.common.viewBinding
import com.ikozlu.anketapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}