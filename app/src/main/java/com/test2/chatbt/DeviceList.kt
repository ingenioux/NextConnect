package com.test2.chatbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.databinding.ActivityDeviceListBinding
import com.test2.chatbt.databinding.ActivityUserProfileBinding

class DeviceList : AppCompatActivity() {

    var Bluetooth = Firebase.firestore
    var SignupData = Firebase.firestore
    var TravelData = Firebase.firestore

    private lateinit var binding: ActivityDeviceListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeviceListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        KeyStore.data1="01:"+KeyStore.key.toString()







        val ref1 = Bluetooth.collection(KeyStore.data1.toString()).document("user1")
        ref1.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN1 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE1=BLE.toString()
                KeyStore.MODE1=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID1.setText(BLE)
                            binding.RCTime1.setText(Time)
                            binding.RCSeatNo1.setText(Jseatno)
                            binding.RCJFrom1.setText(Jfrom)
                            binding.RCJTo1.setText(Jto)
                            binding.RCBus1.setText(Jbusname)

                        } } } } }







        val ref2 = Bluetooth.collection(KeyStore.data1.toString()).document("user2")
        ref2.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN2 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE2=BLE.toString()
                KeyStore.MODE2=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID2.setText(BLE)
                            binding.RCTime2.setText(Time)
                            binding.RCSeatNo2.setText(Jseatno)
                            binding.RCJFrom2.setText(Jfrom)
                            binding.RCJTo2.setText(Jto)
                            binding.RCBus2.setText(Jbusname)

                        } } } } }








        val ref3 = Bluetooth.collection(KeyStore.data1.toString()).document("user3")
        ref3.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN3 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE3=BLE.toString()
                KeyStore.MODE3=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID3.setText(BLE)
                            binding.RCTime3.setText(Time)
                            binding.RCSeatNo3.setText(Jseatno)
                            binding.RCJFrom3.setText(Jfrom)
                            binding.RCJTo3.setText(Jto)
                            binding.RCBus3.setText(Jbusname)

                        } } } } }








        val ref4 = Bluetooth.collection(KeyStore.data1.toString()).document("user4")
        ref4.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN4 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE4=BLE.toString()
                KeyStore.MODE4=MODE.toString()





                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID4.setText(BLE)
                            binding.RCTime4.setText(Time)
                            binding.RCSeatNo4.setText(Jseatno)
                            binding.RCJFrom4.setText(Jfrom)
                            binding.RCJTo4.setText(Jto)
                            binding.RCBus4.setText(Jbusname)

                        } } } } }








        val ref5 = Bluetooth.collection(KeyStore.data1.toString()).document("user5")
        ref5.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN5 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE5=BLE.toString()
                KeyStore.MODE5=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID5.setText(BLE)
                            binding.RCTime5.setText(Time)
                            binding.RCSeatNo5.setText(Jseatno)
                            binding.RCJFrom5.setText(Jfrom)
                            binding.RCJTo5.setText(Jto)
                            binding.RCBus5.setText(Jbusname)

                        } } } } }








        val ref6 = Bluetooth.collection(KeyStore.data1.toString()).document("user6")
        ref6.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN6 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE6=BLE.toString()
                KeyStore.MODE6=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID6.setText(BLE)
                            binding.RCTime6.setText(Time)
                            binding.RCSeatNo6.setText(Jseatno)
                            binding.RCJFrom6.setText(Jfrom)
                            binding.RCJTo6.setText(Jto)
                            binding.RCBus6.setText(Jbusname)

                        } } } } }








        val ref7 = Bluetooth.collection(KeyStore.data1.toString()).document("user7")
        ref7.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN7 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE7=BLE.toString()
                KeyStore.MODE7=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID7.setText(BLE)
                            binding.RCTime7.setText(Time)
                            binding.RCSeatNo7.setText(Jseatno)
                            binding.RCJFrom7.setText(Jfrom)
                            binding.RCJTo7.setText(Jto)
                            binding.RCBus7.setText(Jbusname)

                        } } } } }








        val ref8 = Bluetooth.collection(KeyStore.data1.toString()).document("user8")
        ref8.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN8 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE8=BLE.toString()
                KeyStore.MODE8=MODE.toString()





                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID8.setText(BLE)
                            binding.RCTime8.setText(Time)
                            binding.RCSeatNo8.setText(Jseatno)
                            binding.RCJFrom8.setText(Jfrom)
                            binding.RCJTo8.setText(Jto)
                            binding.RCBus8.setText(Jbusname)

                        } } } } }








        val ref9 = Bluetooth.collection(KeyStore.data1.toString()).document("user9")
        ref9.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN9 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE9=BLE.toString()
                KeyStore.MODE9=MODE.toString()





                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID9.setText(BLE)
                            binding.RCTime9.setText(Time)
                            binding.RCSeatNo9.setText(Jseatno)
                            binding.RCJFrom9.setText(Jfrom)
                            binding.RCJTo9.setText(Jto)
                            binding.RCBus9.setText(Jbusname)

                        } } } } }








        val ref10 = Bluetooth.collection(KeyStore.data1.toString()).document("user10")
        ref10.get().addOnSuccessListener {
            if (it!=null) {
                val BLE = it.data?.get("Bluetooth_Address")?.toString()
                KeyStore.BLEN10 = it.data?.get("Bluetooth_Name")?.toString()
                val MODE = it.data?.get("Mode")?.toString()
                val Time = it.data?.get("Time")?.toString()
                KeyStore.BLE10=BLE.toString()
                KeyStore.MODE10=MODE.toString()




                val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {
                            val Jfrom = it.data?.get("Journey_From")?.toString()
                            val Jto = it.data?.get("Journey_To")?.toString()
                            val Jseatno = it.data?.get("Seat_No")?.toString()
                            val Jbusname = it.data?.get("Bus_Name")?.toString()


                            binding.RCID10.setText(BLE)
                            binding.RCTime10.setText(Time)
                            binding.RCSeatNo10.setText(Jseatno)
                            binding.RCJFrom10.setText(Jfrom)
                            binding.RCJTo10.setText(Jto)
                            binding.RCBus10.setText(Jbusname)

                        } } } } }






        val swth1 = findViewById<Switch>(R.id.StaffSwitcH) as Switch
        swth1.setOnClickListener{
            if (swth1.isChecked){


                val ref1 = Bluetooth.collection(KeyStore.data1.toString()).document("user1")
                ref1.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN1 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE1=BLE.toString()
                        KeyStore.MODE1=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID1.setText(BLE)
                                        binding.RCTime1.setText(Time)
                                        binding.RCSeatNo1.setText(Jseatno)
                                        binding.RCJFrom1.setText(Jfrom)
                                        binding.RCJTo1.setText(Jto)
                                        binding.RCBus1.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID1.setText(" ")
                            binding.RCTime1.setText(" ")
                            binding.RCSeatNo1.setText(" ")
                            binding.RCJFrom1.setText(" ")
                            binding.RCJTo1.setText(" ")
                            binding.RCBus1.setText(" ")

                        }}}







                val ref2 = Bluetooth.collection(KeyStore.data1.toString()).document("user2")
                ref2.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN2 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE2=BLE.toString()
                        KeyStore.MODE2=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID2.setText(BLE)
                                        binding.RCTime2.setText(Time)
                                        binding.RCSeatNo2.setText(Jseatno)
                                        binding.RCJFrom2.setText(Jfrom)
                                        binding.RCJTo2.setText(Jto)
                                        binding.RCBus2.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID2.setText(" ")
                            binding.RCTime2.setText(" ")
                            binding.RCSeatNo2.setText(" ")
                            binding.RCJFrom2.setText(" ")
                            binding.RCJTo2.setText(" ")
                            binding.RCBus2.setText(" ")

                        }}}








                val ref3 = Bluetooth.collection(KeyStore.data1.toString()).document("user3")
                ref3.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN3 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE3=BLE.toString()
                        KeyStore.MODE3=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID3.setText(BLE)
                                        binding.RCTime3.setText(Time)
                                        binding.RCSeatNo3.setText(Jseatno)
                                        binding.RCJFrom3.setText(Jfrom)
                                        binding.RCJTo3.setText(Jto)
                                        binding.RCBus3.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID3.setText(" ")
                            binding.RCTime3.setText(" ")
                            binding.RCSeatNo3.setText(" ")
                            binding.RCJFrom3.setText(" ")
                            binding.RCJTo3.setText(" ")
                            binding.RCBus3.setText(" ")

                        }}}








                val ref4 = Bluetooth.collection(KeyStore.data1.toString()).document("user4")
                ref4.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN4 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE4=BLE.toString()
                        KeyStore.MODE4=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID4.setText(BLE)
                                        binding.RCTime4.setText(Time)
                                        binding.RCSeatNo4.setText(Jseatno)
                                        binding.RCJFrom4.setText(Jfrom)
                                        binding.RCJTo4.setText(Jto)
                                        binding.RCBus4.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID4.setText(" ")
                            binding.RCTime4.setText(" ")
                            binding.RCSeatNo4.setText(" ")
                            binding.RCJFrom4.setText(" ")
                            binding.RCJTo4.setText(" ")
                            binding.RCBus4.setText(" ")

                        }}}








                val ref5 = Bluetooth.collection(KeyStore.data1.toString()).document("user5")
                ref5.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN5 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE5=BLE.toString()
                        KeyStore.MODE5=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID5.setText(BLE)
                                        binding.RCTime5.setText(Time)
                                        binding.RCSeatNo5.setText(Jseatno)
                                        binding.RCJFrom5.setText(Jfrom)
                                        binding.RCJTo5.setText(Jto)
                                        binding.RCBus5.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID5.setText(" ")
                            binding.RCTime5.setText(" ")
                            binding.RCSeatNo5.setText(" ")
                            binding.RCJFrom5.setText(" ")
                            binding.RCJTo5.setText(" ")
                            binding.RCBus5.setText(" ")

                        }}}








                val ref6 = Bluetooth.collection(KeyStore.data1.toString()).document("user6")
                ref6.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN6 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE6=BLE.toString()
                        KeyStore.MODE6=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID6.setText(BLE)
                                        binding.RCTime6.setText(Time)
                                        binding.RCSeatNo6.setText(Jseatno)
                                        binding.RCJFrom6.setText(Jfrom)
                                        binding.RCJTo6.setText(Jto)
                                        binding.RCBus6.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID6.setText(" ")
                            binding.RCTime6.setText(" ")
                            binding.RCSeatNo6.setText(" ")
                            binding.RCJFrom6.setText(" ")
                            binding.RCJTo6.setText(" ")
                            binding.RCBus6.setText(" ")

                        }}}








                val ref7 = Bluetooth.collection(KeyStore.data1.toString()).document("user7")
                ref7.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN7 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE7=BLE.toString()
                        KeyStore.MODE7=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID7.setText(BLE)
                                        binding.RCTime7.setText(Time)
                                        binding.RCSeatNo7.setText(Jseatno)
                                        binding.RCJFrom7.setText(Jfrom)
                                        binding.RCJTo7.setText(Jto)
                                        binding.RCBus7.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID7.setText(" ")
                            binding.RCTime7.setText(" ")
                            binding.RCSeatNo7.setText(" ")
                            binding.RCJFrom7.setText(" ")
                            binding.RCJTo7.setText(" ")
                            binding.RCBus7.setText(" ")

                        }}}








                val ref8 = Bluetooth.collection(KeyStore.data1.toString()).document("user8")
                ref8.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN8 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE8=BLE.toString()
                        KeyStore.MODE7=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID8.setText(BLE)
                                        binding.RCTime8.setText(Time)
                                        binding.RCSeatNo8.setText(Jseatno)
                                        binding.RCJFrom8.setText(Jfrom)
                                        binding.RCJTo8.setText(Jto)
                                        binding.RCBus8.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID8.setText(" ")
                            binding.RCTime8.setText(" ")
                            binding.RCSeatNo8.setText(" ")
                            binding.RCJFrom8.setText(" ")
                            binding.RCJTo8.setText(" ")
                            binding.RCBus8.setText(" ")

                        }}}








                val ref9 = Bluetooth.collection(KeyStore.data1.toString()).document("user9")
                ref9.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN9 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE9=BLE.toString()
                        KeyStore.MODE9=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID9.setText(BLE)
                                        binding.RCTime9.setText(Time)
                                        binding.RCSeatNo9.setText(Jseatno)
                                        binding.RCJFrom9.setText(Jfrom)
                                        binding.RCJTo9.setText(Jto)
                                        binding.RCBus9.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID9.setText(" ")
                            binding.RCTime9.setText(" ")
                            binding.RCSeatNo9.setText(" ")
                            binding.RCJFrom9.setText(" ")
                            binding.RCJTo9.setText(" ")
                            binding.RCBus9.setText(" ")

                        }}}








                val ref10 = Bluetooth.collection(KeyStore.data1.toString()).document("user10")
                ref10.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN10 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE10=BLE.toString()
                        KeyStore.MODE10=MODE.toString()
                        if (MODE=="ONE") {




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID10.setText(BLE)
                                        binding.RCTime10.setText(Time)
                                        binding.RCSeatNo10.setText(Jseatno)
                                        binding.RCJFrom10.setText(Jfrom)
                                        binding.RCJTo10.setText(Jto)
                                        binding.RCBus10.setText(Jbusname)

                                    } } } }
                        else{
                            binding.RCID10.setText(" ")
                            binding.RCTime10.setText(" ")
                            binding.RCSeatNo10.setText(" ")
                            binding.RCJFrom10.setText(" ")
                            binding.RCJTo10.setText(" ")
                            binding.RCBus10.setText(" ")

                        }}}



































































            }















            else{

                val ref1 = Bluetooth.collection(KeyStore.data1.toString()).document("user1")
                ref1.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN1 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE1=BLE.toString()
                        KeyStore.MODE1=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID1.setText(BLE)
                                        binding.RCTime1.setText(Time)
                                        binding.RCSeatNo1.setText(Jseatno)
                                        binding.RCJFrom1.setText(Jfrom)
                                        binding.RCJTo1.setText(Jto)
                                        binding.RCBus1.setText(Jbusname)

                                    } } } } }







                val ref2 = Bluetooth.collection(KeyStore.data1.toString()).document("user2")
                ref2.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN2 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE2=BLE.toString()
                        KeyStore.MODE2=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID2.setText(BLE)
                                        binding.RCTime2.setText(Time)
                                        binding.RCSeatNo2.setText(Jseatno)
                                        binding.RCJFrom2.setText(Jfrom)
                                        binding.RCJTo2.setText(Jto)
                                        binding.RCBus2.setText(Jbusname)

                                    } } } } }








                val ref3 = Bluetooth.collection(KeyStore.data1.toString()).document("user3")
                ref3.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN3 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE3=BLE.toString()
                        KeyStore.MODE3=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID3.setText(BLE)
                                        binding.RCTime3.setText(Time)
                                        binding.RCSeatNo3.setText(Jseatno)
                                        binding.RCJFrom3.setText(Jfrom)
                                        binding.RCJTo3.setText(Jto)
                                        binding.RCBus3.setText(Jbusname)

                                    } } } } }








                val ref4 = Bluetooth.collection(KeyStore.data1.toString()).document("user4")
                ref4.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN4 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE4=BLE.toString()
                        KeyStore.MODE4=MODE.toString()





                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID4.setText(BLE)
                                        binding.RCTime4.setText(Time)
                                        binding.RCSeatNo4.setText(Jseatno)
                                        binding.RCJFrom4.setText(Jfrom)
                                        binding.RCJTo4.setText(Jto)
                                        binding.RCBus4.setText(Jbusname)

                                    } } } } }








                val ref5 = Bluetooth.collection(KeyStore.data1.toString()).document("user5")
                ref5.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN5 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE5=BLE.toString()
                        KeyStore.MODE5=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID5.setText(BLE)
                                        binding.RCTime5.setText(Time)
                                        binding.RCSeatNo5.setText(Jseatno)
                                        binding.RCJFrom5.setText(Jfrom)
                                        binding.RCJTo5.setText(Jto)
                                        binding.RCBus5.setText(Jbusname)

                                    } } } } }








                val ref6 = Bluetooth.collection(KeyStore.data1.toString()).document("user6")
                ref6.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN6 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE6=BLE.toString()
                        KeyStore.MODE6=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID6.setText(BLE)
                                        binding.RCTime6.setText(Time)
                                        binding.RCSeatNo6.setText(Jseatno)
                                        binding.RCJFrom6.setText(Jfrom)
                                        binding.RCJTo6.setText(Jto)
                                        binding.RCBus6.setText(Jbusname)

                                    } } } } }








                val ref7 = Bluetooth.collection(KeyStore.data1.toString()).document("user7")
                ref7.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN7 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE7=BLE.toString()
                        KeyStore.MODE7=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID7.setText(BLE)
                                        binding.RCTime7.setText(Time)
                                        binding.RCSeatNo7.setText(Jseatno)
                                        binding.RCJFrom7.setText(Jfrom)
                                        binding.RCJTo7.setText(Jto)
                                        binding.RCBus7.setText(Jbusname)

                                    } } } } }








                val ref8 = Bluetooth.collection(KeyStore.data1.toString()).document("user8")
                ref8.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN8 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE8=BLE.toString()
                        KeyStore.MODE8=MODE.toString()





                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID8.setText(BLE)
                                        binding.RCTime8.setText(Time)
                                        binding.RCSeatNo8.setText(Jseatno)
                                        binding.RCJFrom8.setText(Jfrom)
                                        binding.RCJTo8.setText(Jto)
                                        binding.RCBus8.setText(Jbusname)

                                    } } } } }








                val ref9 = Bluetooth.collection(KeyStore.data1.toString()).document("user9")
                ref9.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN9 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE9=BLE.toString()
                        KeyStore.MODE9=MODE.toString()





                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID9.setText(BLE)
                                        binding.RCTime9.setText(Time)
                                        binding.RCSeatNo9.setText(Jseatno)
                                        binding.RCJFrom9.setText(Jfrom)
                                        binding.RCJTo9.setText(Jto)
                                        binding.RCBus9.setText(Jbusname)

                                    } } } } }








                val ref10 = Bluetooth.collection(KeyStore.data1.toString()).document("user10")
                ref10.get().addOnSuccessListener {
                    if (it!=null) {
                        val BLE = it.data?.get("Bluetooth_Address")?.toString()
                        KeyStore.BLEN10 = it.data?.get("Bluetooth_Name")?.toString()
                        val MODE = it.data?.get("Mode")?.toString()
                        val Time = it.data?.get("Time")?.toString()
                        KeyStore.BLE10=BLE.toString()
                        KeyStore.MODE10=MODE.toString()




                            val refC1 = BLE?.let { it1 -> TravelData.collection("00:Travel").document(it1) }
                            if (refC1 != null) {
                                refC1.get().addOnSuccessListener {
                                    if (it != null) {
                                        val Jfrom = it.data?.get("Journey_From")?.toString()
                                        val Jto = it.data?.get("Journey_To")?.toString()
                                        val Jseatno = it.data?.get("Seat_No")?.toString()
                                        val Jbusname = it.data?.get("Bus_Name")?.toString()


                                        binding.RCID10.setText(BLE)
                                        binding.RCTime10.setText(Time)
                                        binding.RCSeatNo10.setText(Jseatno)
                                        binding.RCJFrom10.setText(Jfrom)
                                        binding.RCJTo10.setText(Jto)
                                        binding.RCBus10.setText(Jbusname)

                                    } } } } }



            }
        }
























        binding.RCBackButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@DeviceList,UserProfile::class.java)
            startActivity(intent)
            finish()

        })



        binding.ll1.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE1.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE1.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN1.toString()
                            KeyStore.BLE=KeyStore.BLE1.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE1.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE1.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE1.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })





        binding.ll2.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE2.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE2.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN2.toString()
                            KeyStore.BLE=KeyStore.BLE2.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE2.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE2.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE2.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll3.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE3.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE3.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN3.toString()
                            KeyStore.BLE=KeyStore.BLE3.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE3.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE3.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE1.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll4.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE4.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE4.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN4.toString()
                            KeyStore.BLE=KeyStore.BLE4.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE4.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE4.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE1.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll5.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE5.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE5.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN5.toString()
                            KeyStore.BLE=KeyStore.BLE5.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE5.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE5.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE5.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll6.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE6.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE6.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN6.toString()
                            KeyStore.BLE=KeyStore.BLE6.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE6.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE6.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE6.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll7.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE7.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE7.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN7.toString()
                            KeyStore.BLE=KeyStore.BLE7.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE7.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE7.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE7.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll8.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE8.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE8.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN8.toString()
                            KeyStore.BLE=KeyStore.BLE8.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE8.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE8.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE8.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll9.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE9.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE9.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN9.toString()
                            KeyStore.BLE=KeyStore.BLE9.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE9.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE9.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE9.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })







        binding.ll10.setOnClickListener(View.OnClickListener {
            if (KeyStore.MODE10.toString()=="ZERO")
            {
                val refC1 = KeyStore.BLE10.toString()?.let { it -> TravelData.collection("00:Travel").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.UIJFrom = it.data?.get("Journey_From")?.toString()
                            KeyStore.UIJto = it.data?.get("Journey_To")?.toString()
                            KeyStore.UISeatNo = it.data?.get("Seat_No")?.toString()
                            KeyStore.UIDName=KeyStore.BLEN10.toString()
                            KeyStore.BLE=KeyStore.BLE10.toString()
                            val intent = Intent(this@DeviceList,User_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}

            else if (KeyStore.MODE10.toString()=="ONE")
            {
                val refC1 = KeyStore.BLE10.toString()?.let { it -> SignupData.collection("00:STAFF_Profile").document(it) }
                if (refC1 != null) {
                    refC1.get().addOnSuccessListener {
                        if (it != null) {

                            KeyStore.SIName = it.data?.get("Name")?.toString()
                            KeyStore.SIPhnNo = it.data?.get("Phone_Number")?.toString()
                            KeyStore.SIVName = it.data?.get("Vehicle_Name")?.toString()
                            KeyStore.SIWas = it.data?.get("Works_as")?.toString()
                            KeyStore.BLE=KeyStore.BLE10.toString()

                            val intent = Intent(this@DeviceList,Staff_Info::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }}}
            else{
                Toast.makeText(this, "No user Found", Toast.LENGTH_SHORT).show()
            }



        })






        binding.switch3.setOnClickListener(View.OnClickListener {


                    Toast.makeText(this, "Data Not Found", Toast.LENGTH_SHORT).show()


        })

    }
}