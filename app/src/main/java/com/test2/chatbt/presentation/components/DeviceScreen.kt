package com.test2.chatbt.presentation.components

import android.health.connect.datatypes.Device
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.test2.chatbt.KeyStore
import com.test2.chatbt.R
import com.test2.chatbt.domain.chat.BluetoothDeviceDomain
import com.test2.chatbt.presentation.BluetoothUiState
import java.util.Calendar

@Composable


fun DeviceScreen(
    state: BluetoothUiState,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit,
    onBackPressed:() -> Unit,
    onStartServer: () -> Unit,
    onDeviceClicked: (BluetoothDeviceDomain) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.images),
                contentScale = ContentScale.FillBounds
            )
    ) {
        BluetoothDeviceList(
            pairedDevices = state.pairedDevices,
            scannedDevices = state.scannedDevices,
            onClick = onDeviceClicked,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = onStartScan) {
                Text(text = "Sync")
            }
            Button(onClick = onStopScan) {
                Text(text = "Stop")
            }
            Button(onClick = onStartServer) {
                Text(text = "Chat")
            }
            Button(onClick = onBackPressed) {
                Text(text = "Back")
            }
        }
    }
}

@Composable
fun BluetoothDeviceList(
    pairedDevices: List<BluetoothDeviceDomain>,
    scannedDevices: List<BluetoothDeviceDomain>,
    onClick: (BluetoothDeviceDomain) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        item {
            Text(
                text = "Connected Friends : ",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(pairedDevices) { device ->
            var Bluetooth = Firebase.firestore
            var SignupData = Firebase.firestore

            if (device.name!=null){

                val BLE = device.address
                val BLEN = device.name.toString().trim()
                val time = Calendar.getInstance().time.toString().trim()


                val data1="01:"+KeyStore.key
                val data2="02:"+KeyStore.key

                val ref = SignupData.collection("00:Profile").document(BLE)
                ref.get().addOnSuccessListener {
                    if (it!=null) {
                        KeyStore.Gname = it.data?.get("Mode")?.toString()

                        if (KeyStore.Gname != null) {



                            val ref = Bluetooth.collection(data2).document(BLEN)
                            ref.get().addOnSuccessListener {
                                if (it!=null) {
                                    KeyStore.uname = it.data?.get("Bluetooth_Name")?.toString()

                                    if (KeyStore.uname == null) {




                                        KeyStore.ulist = KeyStore.ulist + 1
                                        var glist = "user" + KeyStore.ulist.toString().trim()

                                        val userMap = hashMapOf(
                                            "Bluetooth_Address" to BLE,
                                            "Bluetooth_Name" to BLEN,
                                            "Time" to time,
                                            "Mode" to KeyStore.Gname.toString(),


                                            )
                                        Bluetooth.collection(data1).document(glist).set(userMap)
                                        Bluetooth.collection(data2).document(BLEN).set(userMap)
                                    }



                                    else{
                                        val userMap = hashMapOf(
                                            "Bluetooth_Address" to BLE,
                                            "Bluetooth_Name" to BLEN,
                                            "Time" to time,
                                            "Mode" to KeyStore.Gname.toString(),


                                            )
                                        Bluetooth.collection(data2).document(BLEN).set(userMap)
                                    }

                                }
                            }}}
                }




                Row {
                    val image = painterResource(id = R.drawable.user_icon)
                    Image(painter = image, contentDescription = null,modifier = Modifier
                        .width(70.dp)
                        .height(70.dp))
                    Column { // Wrap Text components inside a Column to stack them vertically
                        Text(
                            text = device.name ?: "(No name)",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onClick(device) }
                                .padding(10.dp)
                        )
                        Text(
                            text ="(No Bio Available)",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 16.dp) // Adjust padding as needed
                        )
                        Text(
                            text = " ",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 16.dp) // Adjust padding as needed
                        )
                    }
                }
            }
        }



        item {
            Text(
                text = "Available People :",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
        items(scannedDevices) { device ->
            var Bluetooth = Firebase.firestore
            var SignupData = Firebase.firestore

            if (device.name != null) {

                val BLE = device.address
                val BLEN = device.name.toString().trim()
                val time = Calendar.getInstance().time.toString().trim()


                val data1 = "01:" + KeyStore.key
                val data2 = "02:" + KeyStore.key

                val ref = SignupData.collection("00:Profile").document(BLE)
                ref.get().addOnSuccessListener {
                    if (it != null) {
                        KeyStore.Gname = it.data?.get("Mode")?.toString()

                        if (KeyStore.Gname != null) {


                            val ref = Bluetooth.collection(data2).document(BLEN)
                            ref.get().addOnSuccessListener {
                                if (it != null) {
                                    KeyStore.uname = it.data?.get("Bluetooth_Name")?.toString()

                                    if (KeyStore.uname == null) {


                                        KeyStore.ulist = KeyStore.ulist + 1
                                        var glist = "user" + KeyStore.ulist.toString().trim()

                                        val userMap = hashMapOf(
                                            "Bluetooth_Address" to BLE,
                                            "Bluetooth_Name" to BLEN,
                                            "Time" to time,
                                            "Mode" to KeyStore.Gname.toString(),


                                            )
                                        Bluetooth.collection(data1).document(glist).set(userMap)
                                        Bluetooth.collection(data2).document(BLEN).set(userMap)
                                    } else {
                                        val userMap = hashMapOf(
                                            "Bluetooth_Address" to BLE,
                                            "Bluetooth_Name" to BLEN,
                                            "Time" to time,
                                            "Mode" to KeyStore.Gname.toString(),


                                            )
                                        Bluetooth.collection(data2).document(BLEN).set(userMap)
                                    }

                                }
                            }
                        }
                    }
                }




                Row {
                    val image = painterResource(id = R.drawable.user_icon)
                    Image(
                        painter = image, contentDescription = null, modifier = Modifier
                            .width(70.dp)
                            .height(70.dp)
                    )
                    Column { // Wrap Text components inside a Column to stack them vertically
                        Text(
                            text = device.name ?: "(No name)",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { onClick(device) }
                                .padding(10.dp)
                        )
                        Text(
                            text = "(No Bio Available)",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 16.dp) // Adjust padding as needed
                        )
                        Text(
                            text = " ",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 16.dp) // Adjust padding as needed
                        )
                    }
                }
            }

        }}}
