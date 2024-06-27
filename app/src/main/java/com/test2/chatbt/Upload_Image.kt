package com.test2.chatbt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.storage
import com.test2.chatbt.databinding.ActivityUploadImageBinding

class Upload_Image : AppCompatActivity() {
    private lateinit var image:ImageView
    private lateinit var btnBrowse1:Button
    private lateinit var btnUpload1:Button
    private lateinit var btnBrowse2:Button
    private lateinit var btnUpload2:Button
    private lateinit var btnBrowse3:Button
    private lateinit var btnUpload3:Button
    private var storageRef = Firebase.storage
    private lateinit var uri:Uri


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityUploadImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        storageRef = FirebaseStorage.getInstance()

        image=findViewById(R.id.UImage)
        btnBrowse1=findViewById(R.id.ChooseImg1)
        btnUpload1=findViewById(R.id.UploadImg1)
        btnBrowse2=findViewById(R.id.ChooseImg2)
        btnUpload2=findViewById(R.id.UploadImg2)
        btnBrowse3=findViewById(R.id.ChooseImg3)
        btnUpload3=findViewById(R.id.UploadImg3)

        val galleryImage=registerForActivityResult(
            ActivityResultContracts.GetContent(),
            ActivityResultCallback {
                image.setImageURI(it)
                if (it != null) {
                    uri = it
                }
            })
        btnBrowse1.setOnClickListener {
            galleryImage.launch("image/*")
        }

        btnUpload1.setOnClickListener {
            Toast.makeText(this, "Uploading, please wait..", Toast.LENGTH_SHORT).show()
            storageRef.getReference("Images").child(KeyStore.key.toString()+" :01")
                .putFile(uri)
                .addOnSuccessListener { task ->
                    task.metadata!!.reference!!.downloadUrl
                        .addOnSuccessListener {
                            var TravelData = Firebase.firestore
                            val userMap = hashMapOf(
                                "URL" to it.toString(),
                            )

                            TravelData.collection("00:TravelImage").document(KeyStore.address.toString()+" :01")
                                .set(userMap)
                                .addOnSuccessListener {
                                    Toast.makeText(this, "Image Uploaded Successful", Toast.LENGTH_SHORT).show()
                                }
                                .addOnFailureListener{
                                    Toast.makeText(this, "Image Upload Failed", Toast.LENGTH_SHORT).show()
                                }



                        } } }


        btnBrowse2.setOnClickListener {
            galleryImage.launch("image/*")
        }

        btnUpload2.setOnClickListener {
            Toast.makeText(this, "Uploading, please wait..", Toast.LENGTH_SHORT).show()
            storageRef.getReference("Images").child(KeyStore.key.toString()+" :02")
                .putFile(uri)
                .addOnSuccessListener { task ->
                    task.metadata!!.reference!!.downloadUrl
                        .addOnSuccessListener {
                            var TravelData = Firebase.firestore
                            val userMap = hashMapOf(
                                "URL" to it.toString(),
                            )

                            TravelData.collection("00:TravelImage").document(KeyStore.address.toString()+" :02")
                                .set(userMap)
                                .addOnSuccessListener {
                                    Toast.makeText(this, "Image Uploaded Successful", Toast.LENGTH_SHORT).show()
                                }
                                .addOnFailureListener{
                                    Toast.makeText(this, "Image Upload Failed", Toast.LENGTH_SHORT).show()
                                }



                        } } }

        btnBrowse3.setOnClickListener {
            galleryImage.launch("image/*")
        }

        btnUpload3.setOnClickListener {
            Toast.makeText(this, "Uploading, please wait..", Toast.LENGTH_SHORT).show()
            storageRef.getReference("Images").child(KeyStore.key.toString()+" :03")
                .putFile(uri)
                .addOnSuccessListener { task ->
                    task.metadata!!.reference!!.downloadUrl
                        .addOnSuccessListener {
                            var TravelData = Firebase.firestore
                            val userMap = hashMapOf(
                                "URL" to it.toString(),
                            )

                            TravelData.collection("00:TravelImage").document(KeyStore.address.toString()+" :03")
                                .set(userMap)
                                .addOnSuccessListener {
                                    Toast.makeText(this, "Image Uploaded Successful", Toast.LENGTH_SHORT).show()
                                }
                                .addOnFailureListener{
                                    Toast.makeText(this, "Image Upload Failed", Toast.LENGTH_SHORT).show()
                                }



                        } } }

        binding.UImgBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Upload_Image,Travel_Mode::class.java)
            startActivity(intent)
            finish()

        })



    }
}