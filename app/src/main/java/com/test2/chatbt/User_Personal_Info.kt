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

class User_Personal_Info : AppCompatActivity() {

    private lateinit var PU1Name: EditText
    private lateinit var PU1Phn: EditText
    private lateinit var PU1Language: EditText
    private lateinit var PU1Address: EditText
    private lateinit var PU1Bloodgroup: EditText

    private var SignupData = Firebase.firestore




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_user_personal_info)

        PU1Name =findViewById<EditText>(R.id.PUName)
        PU1Phn =findViewById<EditText>(R.id.PUPhNumber)
        PU1Language =findViewById<EditText>(R.id.PULanguage)
        PU1Address =findViewById<EditText>(R.id.PUAddress)
        PU1Bloodgroup =findViewById<EditText>(R.id.PUbgroop)




        val signupButton1 = findViewById<Button>(R.id.PUsave)
        signupButton1.setOnClickListener {
            val s1Name = PU1Name.text.toString().trim().toUpperCase()
            val s1Phn = PU1Phn.text.toString().trim().toUpperCase()
            val s1Language = PU1Language.text.toString().trim().toUpperCase()
            val s1Address = PU1Address.text.toString().trim().toUpperCase()
            val s1Bloodgroup = PU1Bloodgroup.text.toString().trim().toUpperCase()




            val userMap = hashMapOf(
                "Bluetooth_Address" to KeyStore.address,
                "Name" to s1Name,
                "Phone_Number" to s1Phn,
                "Language" to s1Language,
                "Address" to s1Address,
                "Blood_Group" to s1Bloodgroup,
            )

            SignupData.collection("00:USER_Profile").document(KeyStore.address.toString()).set(userMap)
            SignupData.collection("00:UProfile").document(KeyStore.address.toString()).set(userMap)

                .addOnSuccessListener {
                    Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@User_Personal_Info,UserProfile::class.java)
                    startActivity(intent)
                    finish()

                }
                .addOnFailureListener {
                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@User_Personal_Info,UserProfile::class.java)
                    startActivity(intent)
                    finish()
                }


        }

        val signupButton4 = findViewById<Button>(R.id.PUBack)
        signupButton4.setOnClickListener {
            val intent = Intent(this@User_Personal_Info,UserProfile::class.java)
            startActivity(intent)
            finish()

        }



    }
}