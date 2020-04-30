package com.frdcompany.mykontrakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.frdcompany.mykontrakan.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentHome = HomeFragment()
        val fragmentProfile = ProfileFragment()

        setFragment(fragmentHome)

        ic_home.setOnClickListener {
            setFragment(fragmentHome)

            changeIcon(ic_home,R.drawable.ic_home_active)
            changeIcon(ic_profile,R.drawable.ic_profile)
        }

        ic_profile.setOnClickListener {
            setFragment(fragmentProfile)

            changeIcon(ic_home,R.drawable.ic_home)
            changeIcon(ic_profile,R.drawable.ic_profile_active)
        }
    }

    protected fun setFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layout_frame,fragment)
        fragmentTransaction.commit()
    }

    private fun changeIcon(imageView: ImageView, int: Int){
        imageView.setImageResource(int)
    }

}
