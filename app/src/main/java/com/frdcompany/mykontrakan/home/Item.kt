package com.frdcompany.mykontrakan.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (
    var lokasi: String? ="",
    var title: String? ="",
    var harga: String? ="",
    var pemilik: String? ="",
    var deskripsi: String? ="",
    var kamar: String? ="",
    var toilet: String? ="",
    var parkir: String? ="",
    var luas: String? ="",
    var foto: String? ="",
    var gambar: String? =""
): Parcelable