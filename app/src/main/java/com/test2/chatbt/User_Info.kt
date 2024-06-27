package com.test2.chatbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.test2.chatbt.databinding.ActivityUserInfoBinding
import com.test2.chatbt.presentation.MainActivity

class User_Info : AppCompatActivity() {
    private lateinit var binding: ActivityUserInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.UIDname.setText("Device Name : " + KeyStore.UIDName)
        binding.UIJFROM.setText("Journey From : " + KeyStore.UIJFrom)
        binding.UIJTO.setText("Journey To : " + KeyStore.UIJto)
        binding.UISNO.setText("Seat Number : " + KeyStore.UISeatNo)


        binding.UIRefresh.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@User_Info, User_Info::class.java)
            startActivity(intent)
            finish()

        })
        binding.UIText.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Click on "+KeyStore.UIDName.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(this@User_Info, MainActivity::class.java)
            startActivity(intent)
            finish()

        })
        binding.UIBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@User_Info, DeviceList::class.java)
            startActivity(intent)
            finish()

        })










    }
}