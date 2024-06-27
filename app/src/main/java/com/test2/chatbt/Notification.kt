package com.test2.chatbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.test2.chatbt.databinding.ActivityNotificationBinding

class Notification : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)


            binding.NID.setText("Unique ID : " + KeyStore.NID)
            binding.NFROM.setText("Journey From : " + KeyStore.NFROM)
            binding.NTO.setText("Journey To : " + KeyStore.NTO)
            binding.NSNO.setText("Seat No : " + KeyStore.NSNO)

        binding.Nback.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Notification,StaffProfile::class.java)
            startActivity(intent)

        })
        binding.NDelete.setOnClickListener(View.OnClickListener {
            binding.NID.setText("Unique ID : " )
            binding.NFROM.setText("Journey From : " )
            binding.NTO.setText("Journey To : " )
            binding.NSNO.setText("Seat No : " )
            KeyStore.NID=""
            KeyStore.NFROM=""
            KeyStore.NTO=""
            KeyStore.NSNO=""
            KeyStore.Nno=2

            Toast.makeText(this, "Data Deleted", Toast.LENGTH_SHORT).show()

            


        })


    }
}