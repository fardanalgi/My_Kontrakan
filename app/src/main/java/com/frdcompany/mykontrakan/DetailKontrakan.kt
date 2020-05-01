package com.frdcompany.mykontrakan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.frdcompany.mykontrakan.home.Item
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_detail_kontrakan.*

class DetailKontrakan : AppCompatActivity() {

    lateinit var mDatabase: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kontrakan)

        mDatabase = FirebaseDatabase.getInstance().getReference("Item")
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

//        Glide.with(this)
//            .load(data.foto)
//            .into(img_pemilik)
    }
}
