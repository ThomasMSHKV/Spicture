package com.eugens.example.museum.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eugens.example.museum.R
import kotlinx.android.synthetic.main.fragment_navigation.*


class NavigationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val portretFragment = PortretFragment()
        val architecturalFragment = ArchitecturalFragment()
        val realismFragment = RealismFragment()
        val landsCapeFragment = LandsCapeFragment()
        val grotesqueFragment = GrotesqueFragment()

        portrait.setOnClickListener {
            portretFragment.arguments = Bundle().also {
                it.putInt("key",1)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,portretFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
        architectural.setOnClickListener {
            architecturalFragment.arguments = Bundle().also {
                it.putInt("ket",2)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,architecturalFragment)
                ?.addToBackStack(null)
                ?.commit()

        }
        realism.setOnClickListener {
            realismFragment.arguments = Bundle().also {
                it.putInt("key",3)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,realismFragment)
                ?.addToBackStack(null)
                ?.commit()
        }
        landsScape.setOnClickListener {
            landsCapeFragment.arguments = Bundle().also {
                it.putInt("key", 4)
            }
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragmentContainer,landsCapeFragment)
                    ?.addToBackStack(null)
                    ?.commit()
        }
        grotesque.setOnClickListener {
            grotesqueFragment.arguments = Bundle().also {
                it.putInt("key",5)
            }
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.fragmentContainer,grotesqueFragment)
                    ?.addToBackStack(null)
                    ?.commit()
        }

    }
}
