package com.example.digilavita

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.digilavita.fragments.DailyFragment
import com.example.digilavita.fragments.HomeFragment
import com.example.digilavita.fragments.OrdersFragment
import com.example.digilavita.fragments.ProfileFragment
import kotlinx.android.synthetic.main.main_menu.*

class MainMenu: AppCompatActivity() {




	override fun onCreate(savedInstanceState: Bundle?){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_menu)

		val homeFragment = HomeFragment()
		val dailyFragment = DailyFragment()
		val ordersFragment = OrdersFragment()
		val profileFragment = ProfileFragment()

		makeCurrentFragment(homeFragment)

		Navigation.setOnNavigationItemSelectedListener{
			when (it.itemId){

				R.id.nav_home -> makeCurrentFragment(homeFragment)
				R.id.nav_todaysspecial -> makeCurrentFragment(dailyFragment)
				R.id.nav_orders -> makeCurrentFragment(ordersFragment)
				R.id.nav_profile -> makeCurrentFragment(profileFragment)

			}
			true
		}
	}

	private fun makeCurrentFragment(fragment: Fragment) =
		supportFragmentManager.beginTransaction().apply {
			replace(R.id.F_container, fragment)
			commit()
		}

}
