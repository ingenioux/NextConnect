package com.test2.chatbt
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityWelcomeBinding


class Welcome : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    lateinit var Ausername : EditText
    lateinit var Apassword: EditText
    lateinit var loginButton: Button
    lateinit var signupRedirectText: TextView

    private var SignupData = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Ausername = findViewById<EditText>(R.id.lusername)
        Apassword = findViewById<EditText>(R.id.lusername)




        binding.signupRedirectText.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@Welcome,signup::class.java)
            startActivity(intent)
            finish()

        })




        binding.login.setOnClickListener(View.OnClickListener {
            val stUsername =Ausername.text.toString().trim()
            if (stUsername==""){
                Toast.makeText(this, "Enter Proper Values", Toast.LENGTH_SHORT).show()

            }
            else{

            val ref = SignupData.collection("00:Login").document(stUsername)
            ref.get().addOnSuccessListener {
                if (it!=null){
                    val Gusername = it.data?.get("Username")?.toString()
                    val Gpassword = it.data?.get("Password")?.toString()
                    KeyStore.address = it.data?.get("Bluetooth_Address")?.toString()
                    KeyStore.mode = it.data?.get("Mode")?.toString()
                    KeyStore.name = it.data?.get("Name")?.toString()

                    if (binding.lusername.text.toString() == Gusername && binding.lpassword.text.toString() == Gpassword){
                        KeyStore.key=Gusername

                        if (KeyStore.mode=="ONE"){
                            val intent = Intent(this@Welcome,StaffProfile::class.java)
                            startActivity(intent)
                            finish()

                        }
                        else if(KeyStore.mode=="ZERO"){
                            val intent = Intent(this@Welcome,UserProfile::class.java)
                            startActivity(intent)
                            finish()

                        }
                        else{
                            Toast.makeText(this, "Error Welcome Page", Toast.LENGTH_SHORT).show()


                        }



                    } else {
                        Toast.makeText(this, "login Failed", Toast.LENGTH_SHORT).show()
                    }



                }
            }



        }})
    }
}