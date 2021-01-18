package com.example.digilavita

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.forgot_pass.*

class ForgotPassword: AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.forgot_pass)
		sendCode.setOnClickListener {

			//Send code button calls for
			startActivity(Intent(this, ConfirmCode::class.java))

		}
	}
}
