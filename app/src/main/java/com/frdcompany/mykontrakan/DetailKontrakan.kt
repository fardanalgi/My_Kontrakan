package com.frdcompany.mykontrakan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.frdcompany.mykontrakan.home.Item
import com.google.firebase.database.DatabaseReference
import kotlinx.android.synthetic.main.activity_detail_kontrakan.*

import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import com.frdcompany.mykontrakan.fasilitas.Fasilitas
import com.frdcompany.mykontrakan.fasilitas.FasilitasAdapter


class DetailKontrakan : AppCompatActivity() {

    lateinit var mDatabase: DatabaseReference
    private val TAG = "MyActivity"

    private var mList = ArrayList<Fasilitas>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kontrakan)

        val actionBar : ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayShowHomeEnabled(true)

        val data = intent.getParcelableExtra<Item>("data")

        rv_fasilitas.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_fasilitas.adapter = FasilitasAdapter(mList){
        }

        mList.add(Fasilitas(R.drawable.kamar1))
        mList.add(Fasilitas(R.drawable.kamar2))
        mList.add(Fasilitas(R.drawable.kamar3))
        mList.add(Fasilitas(R.drawable.toilet2))
        mList.add(Fasilitas(R.drawable.toilet))
        mList.add(Fasilitas(R.drawable.garasi))




        tv_title.text = data.title
        tv_lokasi.text = data.lokasi
        tv_kamar.text = data.kamar
        tv_toilet.text = data.toilet
        tv_Parkir.text = data.parkir
        tv_luas.text = data.luas
        tv_deskripsi.text = data.deskripsi
        tv_pemilik.text = data.pemilik
        tv_harga.text = data.harga
        tv_nama.text = data.nama
        tv_komentar.text = data.komentar
        tv_nama2.text = data.namaa
        tv_komentar2.text = data.komentarr
        tv_nama3.text = data.namaaa
        tv_komentar3.text = data.komentarrr


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
