package com.frdcompany.mykontrakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.frdcompany.mykontrakan.signin.SigninActivity
import com.frdcompany.mykontrakan.utils.Preferences

class SplashscreenActivity : AppCompatActivity() {

    lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        preferences = Preferences(this)

        var handler = Handler()
        handler.postDelayed({

//            if (preferences.getValues("onboarding").equals("1")){
//                finishAffinity()

                val intent = Intent(this@SplashscreenActivity, SigninActivity::class.java)
                startActivity(intent)
                finish()
//            }

        }, 1500)


    }
}
