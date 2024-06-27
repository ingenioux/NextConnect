package com.test2.chatbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityCheckDataBinding
import com.test2.chatbt.databinding.ActivityWelcomeBinding

class Check_Data : AppCompatActivity() {
    private lateinit var getimg: ImageView
    private lateinit var SJFROM: EditText
    private lateinit var SJTO: EditText
    private lateinit var SSEATNO: EditText
    private lateinit var SSearchData: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityCheckDataBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.Ssearch.setOnClickListener(View.OnClickListener {
            SSearchData = findViewById<EditText>(R.id.CseatNo)
            KeyStore.SearchData = SSearchData.text.toString().trim()
            getimg = findViewById(R.id.SImage)
            var TravelData = Firebase.firestore
            val Searchdata1 = KeyStore.SearchData.toString()+" :01"

            val refC1 =TravelData.collection("00:TravelImage").document(Searchdata1)

            if (refC1 != null) {
                refC1.get().addOnSuccessListener {
                    if (it != null) {
                        KeyStore.URL = it.data?.get("URL")?.toString()
                        if (KeyStore.URL==null) {

                            Toast.makeText(this, "Image Not Found", Toast.LENGTH_SHORT)
                                .show()
                        }
                        else{
                            Toast.makeText(this, "Loading, please wait..", Toast.LENGTH_SHORT)
                                .show()

                        }

                    }
                }
            }




            val refC2 = KeyStore.SearchData?.let { it2 ->
                TravelData.collection("00:Travel").document(it2)
            }
            if (refC2 != null) {
                refC2.get().addOnSuccessListener {
                    if (it != null) {
                        val JFROM = it.data?.get("Journey_From")?.toString()
                        val JTO = it.data?.get("Journey_To")?.toString()
                        val JSITNO = it.data?.get("Seat_No")?.toString()
                        binding.CJfrom.setText("Journey From : "+JFROM)
                        binding.CJTo.setText("Journey To : "+JTO)
                        binding.CseatNo.setText("Seat No : "+JSITNO)


                    }
                }
            }




            Glide.with(this).load(KeyStore.URL.toString()).into(getimg)
        })


        binding.IMG1.setOnClickListener {
            val Searchdata1 = KeyStore.SearchData.toString()+" :01"
            var TravelData = Firebase.firestore
            val refC1 =TravelData.collection("00:TravelImage").document(Searchdata1)

            if (refC1 != null) {
                refC1.get().addOnSuccessListener {
                    if (it != null) {
                        KeyStore.URL = it.data?.get("URL")?.toString()
                        if (KeyStore.URL==null) {

                            Toast.makeText(this, "Image Not Found", Toast.LENGTH_SHORT)
                                .show()
                        }
                        else{
                            Toast.makeText(this, "Loading, please wait..", Toast.LENGTH_SHORT)
                                .show()
                            Glide.with(this).load(KeyStore.URL.toString()).into(getimg)

                        }

                    }
                }
            }

        }


        binding.IMG2.setOnClickListener {
            val Searchdata1 = KeyStore.SearchData.toString()+" :02"
            var TravelData = Firebase.firestore
            val refC1 =TravelData.collection("00:TravelImage").document(Searchdata1)

            if (refC1 != null) {
                refC1.get().addOnSuccessListener {
                    if (it != null) {
                        KeyStore.URL = it.data?.get("URL")?.toString()
                        if (KeyStore.URL==null) {

                            Toast.makeText(this, "Image Not Found", Toast.LENGTH_SHORT)
                                .show()
                        }
                        else{
                            Toast.makeText(this, "Loading, please wait..", Toast.LENGTH_SHORT)
                                .show()
                            Glide.with(this).load(KeyStore.URL.toString()).into(getimg)

                        }

                    }
                }
            }

        }


        binding.IMG3.setOnClickListener {
            val Searchdata1 = KeyStore.SearchData.toString()+" :03"
            var TravelData = Firebase.firestore
            val refC1 =TravelData.collection("00:TravelImage").document(Searchdata1)

            if (refC1 != null) {
                refC1.get().addOnSuccessListener {
                    if (it != null) {
                        KeyStore.URL = it.data?.get("URL")?.toString()
                        if (KeyStore.URL==null) {

                            Toast.makeText(this, "Image Not Found", Toast.LENGTH_SHORT)
                                .show()
                        }
                        else{
                            Toast.makeText(this, "Loading, please wait..", Toast.LENGTH_SHORT)
                                .show()
                            Glide.with(this).load(KeyStore.URL.toString()).into(getimg)

                        }

                    }
                }
            }

        }





        binding.Sback.setOnClickListener {
            val intent = Intent(this@Check_Data,StaffProfile::class.java)
            startActivity(intent)
            finish()
        }


    }
    }
