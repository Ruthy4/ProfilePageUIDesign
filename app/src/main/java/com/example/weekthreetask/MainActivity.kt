package com.example.weekthreetask

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var appSettings:SharedPreferences = getSharedPreferences("key", 0)
        var sharedPreferences:SharedPreferences.Editor =appSettings.edit()
        var switchMode:Boolean = appSettings.getBoolean("switchMode", false)

        //switch onClick listener
        switch_mode.setOnClickListener {

            //switch mode on switch check
            if (switch_mode.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPreferences.putBoolean("NightMode", false)
                sharedPreferences.apply()


            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                sharedPreferences.putBoolean("NightMode", false)
                sharedPreferences.apply()
            }
        }
    }
}
