package com.frdcompany.mykontrakan.home

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item (
    var lokasi: String ="",
    var title: String ="",
    var harga: String ="",
    var pemilik: String? ="",
    var deskripsi: String? ="",
    var kamar: String? ="",
    var phone: String? ="",
    var toilet: String? ="",
    var parkir: String? ="",
    var luas: String? ="",
    var gambar: Int,
    var maps: String? ="",
    var nama: String? ="",
    var komentar: String? ="",
    var namaa: String? ="",
    var komentarr: String? ="",
    var namaaa: String? ="",
    var komentarrr: String? =""
): Parcelable