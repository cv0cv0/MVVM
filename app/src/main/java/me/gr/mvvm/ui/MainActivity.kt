package me.gr.mvvm.ui

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import me.gr.mvvm.R
import me.gr.mvvm.databinding.ActivityMainBinding
import me.gr.mvvm.domain.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.model = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }
}
