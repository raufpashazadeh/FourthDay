package com.example.login_test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fourthday.R
import com.example.fourthday.databinding.ActivityAuthenticationBinding

class AuthenticationActivity : AppCompatActivity() {
    private val binding:ActivityAuthenticationBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding=ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding.signUpButton.setOnClickListener {
            //onStartClick
        }
    }
}