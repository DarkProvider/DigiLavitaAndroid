package com.example.digilavita

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.new_password.*

class NewPassword: AppCompatActivity(){

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.new_password)
		saveChoice.setOnClickListener {

			startActivity(Intent(this, MainActivity::class.java))

		}
	}
}
