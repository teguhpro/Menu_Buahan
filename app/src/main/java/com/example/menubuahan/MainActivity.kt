package com.example.menubuahan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.menubuahan.fragment.BuahFragment
import com.example.menubuahan.fragment.HomeFragment
import com.example.menubuahan.fragment.SettingFragment
import com.example.menubuahan.fragment.SubcriptionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val buahFragment = BuahFragment()
        val subcriptionFragment = SubcriptionFragment()
        val settingFragment = SettingFragment()

        makeCurrentFragment (homeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_buah -> makeCurrentFragment(buahFragment)
                R.id.menu_subcription -> makeCurrentFragment(subcriptionFragment)
                R.id.menu_setting -> makeCurrentFragment(settingFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragmement: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_fragment, fragmement)
            commit()

        }

    }
}