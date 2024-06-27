package com.test2.chatbt

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivitySignupBinding

class Staff_Personal_Info : AppCompatActivity() {

    private lateinit var PS1Name: EditText
    private lateinit var PS1Phn: EditText
    private lateinit var PS1Language: EditText
    private lateinit var PS1Vname: EditText
    private lateinit var PS1Vno: EditText
    private lateinit var PS1work: EditText

    private var SignupData = Firebase.firestore

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_staff_personal_info)


        PS1Name =findViewById<EditText>(R.id.PSName)
        PS1Phn =findViewById<EditText>(R.id.PSPhNumber)
        PS1Language =findViewById<EditText>(R.id.PSLanguage)
        PS1Vname =findViewById<EditText>(R.id.PSVname)
        PS1Vno =findViewById<EditText>(R.id.PSVno)
        PS1work =findViewById<EditText>(R.id.PSwork)


        val signupButton3 = findViewById<Button>(R.id.PSsave)
        signupButton3.setOnClickListener {
            val s2Name = PS1Name.text.toString().trim().toUpperCase()
            val s2Phn = PS1Phn.text.toString().trim().toUpperCase()
            val s2Language = PS1Language.text.toString().trim().toUpperCase()
            val s2Vname = PS1Vname.text.toString().trim().toUpperCase()
            val s2Vno = PS1Vno.text.toString().trim().toUpperCase()
            val s2work = PS1work.text.toString().trim().toUpperCase()


            val userMap = hashMapOf(
                "Bluetooth_Address" to KeyStore.address,
                "Name" to s2Name,
                "Phone_Number" to s2Phn,
                "Language" to s2Language,
                "Vehicle_Name" to s2Vname,
                "Vehicle_Number" to s2Vno,
                "Works_as" to s2work,
            )

            SignupData.collection("00:STAFF_Profile").document(KeyStore.address.toString()).set(userMap)
            SignupData.collection("00:UProfile").document(KeyStore.address.toString()).set(userMap)

                .addOnSuccessListener {
                    Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@Staff_Personal_Info,StaffProfile::class.java)
                    startActivity(intent)
                    finish()

                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                }


        }


        val signupButton4 = findViewById<Button>(R.id.PSBack)
        signupButton4.setOnClickListener {
            val intent = Intent(this@Staff_Personal_Info,StaffProfile::class.java)
            startActivity(intent)
            finish()

        }
    }
}