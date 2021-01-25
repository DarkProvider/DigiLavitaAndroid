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



	//When the app launches the onCreate method will be called to launch that specific window
	override fun onCreate(savedInstanceState: Bundle?){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_menu)

// 		This way of making fragments will refresh the fragment every time you click on it which is not a very optimized way of making them
//		//defining the bottom navigation part
//		val bottomNavigationView = findViewById<BottomNavigationView>(R.id.Navigation)
//		//defining the controller to be able to find that navigation bar
//
//		val navController = findNavController(R.id.fragmentHost)
//		//Calling out the navigation and its functions
//		bottomNavigationView.setupWithNavController(navController)

		//Another and way of doing it is to declare each one of the fragments used and the call them one by one (See below), after that we set the home one as the default one but with navigation
		//component, that is quite unnecessary and the component will deal with the transitions and controls. The navigation bar icons should have the same ID's of the fragments so they can be called with the navigation bar!

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
