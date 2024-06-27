package com.test2.chatbt.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.test2.chatbt.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address

    )
}
