package com.test2.chatbt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityStaffProfileBinding
import com.test2.chatbt.databinding.ActivityUserProfileBinding


class StaffProfile : AppCompatActivity() {
    private var TravelData = Firebase.firestore
    private lateinit var binding: ActivityStaffProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStaffProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.itextView.setText(KeyStore.name)
        binding.itextView2.setText("Unique ID: "+KeyStore.address.toString())





        val refC2 = TravelData.collection("00:Notification").document("N1")
        if (refC2 != null) {
            refC2.get().addOnSuccessListener {
                if (it != null) {
                    val JBLE = it.data?.get("Unique_Address")?.toString()
                    val JFROM = it.data?.get("Journey_From")?.toString()
                    val JTO = it.data?.get("Journey_To")?.toString()
                    val JSITNO = it.data?.get("Seat_No")?.toString()
                    if (JFROM!=null){
                        if (KeyStore.Nno==0) {
                        binding.ibutton4.setText("Notification (1) ")


                        if (KeyStore.Nlist==1){
                            Toast.makeText(this, "New Notification", Toast.LENGTH_SHORT).show()
                            KeyStore.Nlist=KeyStore.Nlist+1
                        }
                            KeyStore.NID = JBLE.toString()
                            KeyStore.NFROM = JFROM.toString()
                            KeyStore.NTO = JTO.toString()
                            KeyStore.NSNO = JSITNO.toString()

                    }}



                }
            }
        }



        binding.SPersonalInfo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@StaffProfile,Staff_Personal_Info::class.java)
            startActivity(intent)
            finish()

        })
        binding.Slogout.setOnClickListener(View.OnClickListener {
            KeyStore.Nlist=KeyStore.Nlist-1
            KeyStore.Nno=0
            val intent = Intent(this@StaffProfile,Welcome::class.java)
            startActivity(intent)
            finish()

        })
        binding.SPdata.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@StaffProfile,Check_Data::class.java)
            startActivity(intent)
            finish()

        })

        binding.ibutton4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@StaffProfile,Notification::class.java)
            startActivity(intent)
            finish()

        })
    }
}