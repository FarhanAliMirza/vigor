package com.example.weather

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction
import com.example.weather.view.*

class MainActivity : AppCompatActivity() {

    private val fragmentManager=supportFragmentManager
    private val homeFrag=HomeFragment()
    private val vaultFrag=VaultFragment()
    private val addFrag= AddFragment()
    private val storeFrag=StoreFragment()
    private val settingsFrag=SettingsFragment()
    private lateinit var manager:FragmentTransaction

    //call id

    private lateinit var btnH: ImageButton
    private lateinit var btnV: ImageButton
    private lateinit var btnA: ImageButton
    private lateinit var btnS: ImageButton
    private lateinit var btnST: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val toolbar: Toolbar = findViewById(R.id.toolbar)
        toolbar.setTitleTextColor(Color.argb(73,0,187,176))
        setSupportActionBar(toolbar)*/

        //set view by id
        btnH=findViewById(R.id.home)
        btnV=findViewById(R.id.vault)
        btnA=findViewById(R.id.addNew)
        btnS=findViewById(R.id.store)
        btnST=findViewById(R.id.settings)

        //set first fragment
        manager=fragmentManager.beginTransaction().replace(R.id.myview,homeFrag)
        manager.commit()
        btnH.setImageResource(R.drawable.ic_baseline_home_24)

    }

    fun addFragOnClick(view: View) {

        //set fragments
        manager=fragmentManager.beginTransaction()
        when(view){
            btnH->{
                manager.replace(R.id.myview,homeFrag).commit()
                btnH.setImageResource(R.drawable.ic_baseline_home_24)
                btnV.setImageResource(R.drawable.ic_outline_lock_24)
                btnA.setImageResource(R.drawable.ic_baseline_add_circle_outline_24)
                btnS.setImageResource(R.drawable.ic_outline_store_24)
                btnST.setImageResource(R.drawable.ic_outline_settings_24)
            }
            btnV->{
                manager.replace(R.id.myview,vaultFrag).commit()
                btnH.setImageResource(R.drawable.ic_outline_home_24)
                btnV.setImageResource(R.drawable.ic_baseline_lock_24)
                btnA.setImageResource(R.drawable.ic_baseline_add_circle_outline_24)
                btnS.setImageResource(R.drawable.ic_outline_store_24)
                btnST.setImageResource(R.drawable.ic_outline_settings_24)
            }
            btnA->{
                manager.replace(R.id.myview,addFrag).commit()
                btnH.setImageResource(R.drawable.ic_outline_home_24)
                btnV.setImageResource(R.drawable.ic_outline_lock_24)
                btnA.setImageResource(R.drawable.ic_baseline_add_circle_24)
                btnS.setImageResource(R.drawable.ic_outline_store_24)
                btnST.setImageResource(R.drawable.ic_outline_settings_24)
            }
            btnS->{
                manager.replace(R.id.myview,storeFrag).commit()
                btnH.setImageResource(R.drawable.ic_outline_home_24)
                btnV.setImageResource(R.drawable.ic_outline_lock_24)
                btnA.setImageResource(R.drawable.ic_baseline_add_circle_outline_24)
                btnS.setImageResource(R.drawable.ic_baseline_store_24)
                btnST.setImageResource(R.drawable.ic_outline_settings_24)
            }
            btnST->{
                manager.replace(R.id.myview,settingsFrag).commit()
                btnH.setImageResource(R.drawable.ic_outline_home_24)
                btnV.setImageResource(R.drawable.ic_outline_lock_24)
                btnA.setImageResource(R.drawable.ic_baseline_add_circle_outline_24)
                btnS.setImageResource(R.drawable.ic_outline_store_24)
                btnST.setImageResource(R.drawable.ic_baseline_settings_24)
            }
        }
    }
}