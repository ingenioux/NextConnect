package com.test2.chatbt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityTravelModeBinding
import com.test2.chatbt.presentation.MainActivity

class Travel_Mode : AppCompatActivity() {

    private lateinit var PTJFROM: EditText
    private lateinit var PTJTO: EditText
    private lateinit var PTSEATNO: EditText
    private lateinit var PTBUSNAME: EditText

    private var TravelData = Firebase.firestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityTravelModeBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_travel_mode)

        PTJFROM =findViewById<EditText>(R.id.TMJFROM)
        PTJTO =findViewById<EditText>(R.id.TMJTO)
        PTSEATNO =findViewById<EditText>(R.id.TMSeatNo)
        PTBUSNAME =findViewById<EditText>(R.id.TMBusName)



        val signupButton5 = findViewById<Button>(R.id.TMsave)
        signupButton5.setOnClickListener {
            val s3from = PTJFROM.text.toString().trim().toUpperCase()
            val s3to = PTJTO.text.toString().trim().toUpperCase()
            val s3seatno = PTSEATNO.text.toString().trim().toUpperCase()
            val s3busname = PTBUSNAME.text.toString().trim().toUpperCase()

            val TMswth = findViewById<Switch>(R.id.TMswitch1) as Switch
            TMswth.setOnClickListener {
                if (TMswth.isChecked) {
                    KeyStore.Pmode = "ONE"
                } else {
                    KeyStore.Pmode = "ZERO"
                }
            }


            if (KeyStore.Pmode.toString() == "ZERO") {

                if (s3from == "") {
                    Toast.makeText(this, "Journey From : invalid Format", Toast.LENGTH_SHORT).show()

                } else if (s3to == "") {
                    Toast.makeText(this, "Journey To : invalid Format", Toast.LENGTH_SHORT).show()

                } else if (s3seatno == "") {
                    Toast.makeText(this, "Seat No : invalid Format", Toast.LENGTH_SHORT).show()

                } else if (s3busname == "") {
                    Toast.makeText(this, "Bus Name : invalid Format", Toast.LENGTH_SHORT).show()

                } else {
                    KeyStore.SeatNo=s3seatno
                    val userMap = hashMapOf(
                        "Bluetooth_Address" to KeyStore.address,
                        "Journey_From" to s3from,
                        "Journey_To" to s3to,
                        "Seat_No" to s3seatno,
                        "Bus_Name" to s3busname,
                    )

                    TravelData.collection("00:Travel").document(KeyStore.address.toString())
                        .set(userMap)

                        .addOnSuccessListener {
                            Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this@Travel_Mode, Upload_Image::class.java)
                            startActivity(intent)
                            finish()

                        }
                        .addOnFailureListener {
                            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                        }

                }
            }
            else {
                val userMap = hashMapOf(
                    "Bluetooth_Address" to "Not to Show",
                    "Journey_From" to "Not to Show",
                    "Journey_To" to "Not to Show",
                    "Seat_No" to "Not to Show",
                    "Bus_Name" to "Not to Show",
                )

                TravelData.collection("00:Travel").document(KeyStore.address.toString())
                    .set(userMap)

                    .addOnSuccessListener {
                        Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@Travel_Mode, Upload_Image::class.java)
                        startActivity(intent)
                        finish()

                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                    }

        }}






        val signupButton6 = findViewById<Button>(R.id.TMBack)
        signupButton6.setOnClickListener {
            val intent = Intent(this@Travel_Mode,UserProfile::class.java)
            startActivity(intent)
            finish()

        }



    }
}