package com.frdcompany.mykontrakan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.frdcompany.mykontrakan.home.Item
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_detail_kontrakan.*

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.ActionBar


class DetailKontrakan : AppCompatActivity() {

    lateinit var mDatabase: DatabaseReference
    private val TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kontrakan)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val data = intent.getParcelableExtra<Item>("data")




        tv_title.text = data.title
        tv_lokasi.text = data.lokasi
        tv_kamar.text = data.kamar
        tv_toilet.text = data.toilet
        tv_Parkir.text = data.parkir
        tv_luas.text = data.luas
        tv_deskripsi.text = data.deskripsi
        tv_pemilik.text = data.pemilik
        tv_harga.text = data.harga


        Glide.with(this)
            .load(data.gambar)
            .into(img_gambar)

        btn_pesan.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" +data.phone)

            startActivity(intent)

        }
btn_maps.setOnClickListener {
    val implicit = Intent(Intent.ACTION_VIEW, Uri.parse("" +data.maps))
    startActivity(implicit)
}
//        Glide.with(this)
//            .load(data.foto)
//            .into(img_pemilik)
    }
}
