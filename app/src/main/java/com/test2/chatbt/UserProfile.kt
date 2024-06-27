package com.test2.chatbt

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityUserProfileBinding
import com.test2.chatbt.presentation.MainActivity

class UserProfile : AppCompatActivity() {
    private var TravelData = Firebase.firestore


    private lateinit var binding: ActivityUserProfileBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.itextView.setText(KeyStore.name)
        binding.itextView2.setText("Unique ID: "+KeyStore.address.toString())








        binding.Upersonalinfo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@UserProfile,User_Personal_Info::class.java)
            startActivity(intent)
            finish()

        })

        binding.Ulogout.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@UserProfile,Welcome::class.java)
            startActivity(intent)
            finish()

        })

        binding.Uyncedpeople.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@UserProfile,DeviceList::class.java)
            startActivity(intent)
            finish()

        })
        binding.Uavailablepeople.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@UserProfile,MainActivity::class.java)
            startActivity(intent)
            finish()

        })

        binding.UupJdata.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@UserProfile,Travel_Mode::class.java)
            startActivity(intent)
            finish()

        })
        binding.button5.setOnClickListener(View.OnClickListener {



            val refC2 = KeyStore.address?.let { it2 ->
                TravelData.collection("00:Travel").document(it2)
            }
            if (refC2 != null) {
                refC2.get().addOnSuccessListener {
                    if (it != null) {
                        val JFROM = it.data?.get("Journey_From")?.toString()
                        val JTO = it.data?.get("Journey_To")?.toString()
                        val JSITNO = it.data?.get("Seat_No")?.toString()


                        val userMap = hashMapOf(
                            "Unique_Address" to KeyStore.address,
                            "Journey_From" to JFROM,
                            "Journey_To" to JTO,
                            "Seat_No" to JSITNO,
                        )

                        TravelData.collection("00:Notification").document("N1")
                            .set(userMap)

                            .addOnSuccessListener {
                                Toast.makeText(this, "Request sent..", Toast.LENGTH_SHORT).show()

                            }




                    }
                }
            }











        })





    }
}