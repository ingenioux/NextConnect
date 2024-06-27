package com.test2.chatbt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import androidx.compose.ui.text.toUpperCase
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivitySignupBinding
import java.util.jar.Attributes.Name
import kotlin.math.sign

class signup : AppCompatActivity() {
    private lateinit var etBleAddress:EditText
    private lateinit var etName:EditText
    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var etPassword2:EditText
    private var SignupData = Firebase.firestore



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_signup)

        etBleAddress = findViewById<EditText>(R.id.sBleAddress)
        etName = findViewById<EditText>(R.id.sName)
        etUsername = findViewById<EditText>(R.id.sUsername)
        etPassword = findViewById<EditText>(R.id.sPassword)
        etPassword2 = findViewById<EditText>(R.id.sPassword2)
        val swth = findViewById<Switch>(R.id.switch1) as Switch
        swth.setOnClickListener{
            if (swth.isChecked){
                KeyStore.mode="ONE"
            }
            else{
                KeyStore.mode="ZERO"
            }
        }



        val signupButton = findViewById<Button>(R.id.signupButton)
        signupButton.setOnClickListener {

            val sBleAddress = etBleAddress.text.toString().trim().toUpperCase()
            val sName = etName.text.toString().trim().toUpperCase()
            val sUsername = etUsername.text.toString().trim()
            val sPassword = etPassword.text.toString().trim()
            val sRePassword = etPassword2.text.toString().trim()



            if (sBleAddress == "") {
                Toast.makeText(this, "BLE Address : invalid Format", Toast.LENGTH_SHORT).show()

            }
            else if (sName == "") {
                Toast.makeText(this, "Name : invalid Format", Toast.LENGTH_SHORT).show()

            } else if (sUsername == "") {
                Toast.makeText(this, "Username : invalid Format", Toast.LENGTH_SHORT).show()

            } else if (sPassword == "") {
                Toast.makeText(this, "Password : invalid Format", Toast.LENGTH_SHORT).show()

            }
            else if (sPassword != sRePassword) {
                Toast.makeText(this, "Both Password Not Same", Toast.LENGTH_SHORT).show()

            }
            else {
                val ref1 = SignupData.collection("00:Profile").document(sBleAddress)
                ref1.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLET = it.data?.get("Bluetooth_Address")?.toString()
                        if (BLET == null) {

                val userMap = hashMapOf(
                    "Bluetooth_Address" to sBleAddress,
                    "Name" to sName,
                    "Username" to sUsername,
                    "Password" to sPassword,
                    "Mode" to KeyStore.mode.toString(),
                )

                SignupData.collection("00:Login").document(sUsername).set(userMap)
                SignupData.collection("00:Profile").document(sBleAddress).set(userMap)





                    .addOnSuccessListener {
                        if (KeyStore.mode.toString() == "ZERO") {
                            val userMap = hashMapOf(
                                "Bluetooth_Address" to sBleAddress,
                                "Bus_Name" to "Not Available",
                                "Journey_From" to "Not Available",
                                "Journey_To" to "Not Available",
                                "Seat_No" to "Not Available",

                                )

                            SignupData.collection("00:Travel").document(sBleAddress).set(userMap)

                        } else if (KeyStore.mode.toString() == "ONE") {
                            val userMap = hashMapOf(
                                "Bluetooth_Address:" to sBleAddress,
                                "Bus_Name" to "Not Available",
                                "Journey_From" to "FULL JOURNEY",
                                "Journey_To" to "FULL JOURNEY",
                                "Seat_No" to "Helping Staff",

                                )

                            SignupData.collection("00:Travel").document(sBleAddress).set(userMap)

                        }


                        Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@signup, Welcome::class.java)
                        startActivity(intent)
                        finish()

                    }
                    .addOnFailureListener {
                        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                    }





            }
                        else{
                            Toast.makeText(this, "Already Registered", Toast.LENGTH_SHORT).show()
                        }}}}








            

        }
        val signupBack = findViewById<Button>(R.id.signupback)
        signupBack.setOnClickListener {
            val intent = Intent(this@signup,Welcome::class.java)
            startActivity(intent)
            finish()
        }

    }

}