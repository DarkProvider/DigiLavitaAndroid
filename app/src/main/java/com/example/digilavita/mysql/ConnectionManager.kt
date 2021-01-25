package com.example.digilavita.mysql
import java.sql.DriverManager
import java.sql.SQLException

object ConnectionManager {

	@JvmStatic
	fun connection(){

		try{

			val conn = DriverManager.getConnection(
				"jdbc/:mysql://sql.nickdejager.nl?serverTimezone=UTC",
				"pizza",
				"TeamTryhards"
			)
			println("Connection was successful!")

		} catch (error: SQLException){

			error.printStackTrace()
		}


	}

}
