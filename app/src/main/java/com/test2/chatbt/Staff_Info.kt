package com.test2.chatbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.test2.chatbt.databinding.ActivityStaffInfoBinding
import com.test2.chatbt.databinding.ActivityUserInfoBinding
import com.test2.chatbt.presentation.MainActivity

class Staff_Info : AppCompatActivity() {
    private lateinit var binding: ActivityStaffInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStaffInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.SIname.setText("Name : " + KeyStore.SIName)
        binding.SIPhNo.setText("Phone Number : " + KeyStore.SIPhnNo)
        binding.SIVName.setText("Vehicle Name : " + KeyStore.SIVName)
        binding.SIWAS.setText("Works as : " + KeyStore.SIWas)


        binding.SIRefresh.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Staff_Info, Staff_Info::class.java)
            startActivity(intent)
            finish()

        })
        binding.SIText.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Staff_Info, MainActivity::class.java)
            startActivity(intent)
            finish()

        })
        binding.SIBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Staff_Info, DeviceList::class.java)
            startActivity(intent)
            finish()

        })





    }
}