package com.example.digilavita.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.digilavita.R
import com.example.digilavita.disheslists.*
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




//		burgers.setOnClickListener{
//			activity?.let {
//				val intent = Intent(it, DishesBurgers::class.java)
//				it.startActivity(intent)
//			}
//		}
//


//		pizzas.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesPizzas::class.java))
//		}
//
//		zeevruchten.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesSeafood::class.java))
//		}
//
//		vlees.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesMeat::class.java))
//		}
//
//		soepen.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesSoups::class.java))
//		}
//
//		drinken.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DrinksDrinks::class.java))
//		}
//
//		broodjes.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesSandwiches::class.java))
//		}
//
//		salades.setOnClickListener{
//			//Login button calls for
//			startActivity(Intent(this, DishesSalads::class.java))
//		}



		arguments?.let {
			param1 = it.getString(ARG_PARAM1)
			param2 = it.getString(ARG_PARAM2)
		}
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_home, container, false)
	}




}
