package com.example.digilavita

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.confirm_code.*
import kotlinx.android.synthetic.main.forgot_pass.*
import kotlinx.android.synthetic.main.forgot_pass.sendCode

class ConfirmCode: AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.confirm_code)
		confirmFilling.setOnClickListener {

			//Confirm button calls for
			startActivity(Intent(this, NewPassword::class.java))

		}
	}
}
