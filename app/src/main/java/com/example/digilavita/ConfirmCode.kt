package com.example.digilavita

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.confirm_code.*



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
