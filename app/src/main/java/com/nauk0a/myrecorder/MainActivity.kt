package com.nauk0a.myrecorder

import android.app.ActivityManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.nauk0a.myrecorder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        NavigationUI.setupWithNavController(
            binding.bottomNavigation,
            Navigation.findNavController(this, R.id.nav_host_fragment_container)
        )
    }

    fun isServiceRunning() : Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if ("com.nauk0a.myrecorder.record.RecordService" == service.service.className){
                return true
            }
        }
        return false
    }
}