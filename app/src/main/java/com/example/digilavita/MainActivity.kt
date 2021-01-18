package com.example.digilavita

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		resetForgottenPass.setOnClickListener {

			//Forgot password calls for
			startActivity(Intent(this, ForgotPassword::class.java))
		}
		loginButton.setOnClickListener{
			//Login button calls for
			startActivity(Intent(this, MainMenu::class.java))
		}
	}
}

