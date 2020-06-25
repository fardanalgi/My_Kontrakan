package com.frdcompany.mykontrakan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.frdcompany.mykontrakan.home.HomeAdapter
import com.frdcompany.mykontrakan.home.Item
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    private var dataList = ArrayList<Item>()
    val displayList = ArrayList<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_popular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        getData()


        rv_popular.adapter = HomeAdapter(displayList) {
            val intent = Intent(this, DetailKontrakan::class.java)
                .putExtra("data", it)
            startActivity(intent)
        }

        dataList.add(
            Item(
                "Harapan Indah, Bekasi",
                "Rumah Minimalis 2 Lantai Hanya 45 Jt/thn Siap Huni!! Di Harapan Indah II",
                "Rp.45.000.000 / Tahun",
                "Farida Cpro",
                "akses mudah dijangkau, lingkungan nyaman bersih dan rapi, keamanan terjaga 24 jam.\n" +
                        "fasilitas umum yang lengkap :\n" +
                        "- Sekolah internasional\n" +
                        "- Rumah Sakit\n" +
                        "- Perkantoran\n" +
                        "- Hotel\n" +
                        "- Perbankan\n" +
                        "- Pusat aneka kuliner\n" +
                        "- Pusat belanja\n" +
                        "- Show room\n" +
                        "- dll",
                "3",
                "08128437688",
                "2",
                "1",
                "120",
                R.drawable.hi,
                "https://www.google.com/maps/place/Kota+Harapan+Indah+Marketing+Office/@-6.1820889,106.9708863,17z/data=!3m1!4b1!4m5!3m4!1s0x2e698bb97f42f7ff:0x78f0a07fb52f8524!8m2!3d-6.1820889!4d106.973075"
            )
        )
        dataList.add(
            Item(
                "Cluster Meadow Green, Lippo Cikarang Lippo Cikarang, Bekasi",
                "Rumah di Cluster Meadow Green, Lippo Cikarang",
                "Rp.70.000.000 / Tahun",
                "Verawaty",
                "Lippo Cikarang berada di kawasan Cikarang, Kabupaten Bekasi, Lippo Cikarang menawarkan hunian yang merupakan idaman Anda, yaitu hunian yang dekat dengan pusat kota Jakarta namun terbebas dari polusi dan kemacetan. Hunian ini terletak di kawasan kota mandiri yang memiliki fasilitas lengkap, berupa fasilitas pendidikan, hiburan, pusat kesehatan, transportasi, tempat ibadah, dan pusat olahraga.",
                "5",
                "082112150546",
                "4",
                "1",
                "163",
                R.drawable.lipo,
                "https://www.google.com/maps/place/Meadow+Green,+Lippo+Cikarang/@-6.3330007,107.1394417,17z/data=!3m1!4b1!4m12!1m6!3m5!1s0x2e699a51287b6845:0x884bcb70a8ff8264!2sMeadow+Green,+Lippo+Cikarang!8m2!3d-6.3330007!4d107.1416304!3m4!1s0x2e699a51287b6845:0x884bcb70a8ff8264!8m2!3d-6.3330007!4d107.1416304"
            )
        )
        dataList.add(
            Item(
                "Pengasinan, Bekasi Timur",
                "Kontrakan kosong di pengasinan",
                "Rp.700.000 / Bulan",
                "Ibu Agus",
                "Lokasi strategis luas 5x3 meter kubik",
                "1",
                "087848491989",
                "1",
                "1",
                "5x3",
                R.drawable.pengasinan,
                "https://www.google.com/maps/place/Pengasinan,+Rawa+Lumbu,+Bekasi+City,+West+Java/@-6.267301,107.004315,16z/data=!4m5!3m4!1s0x2e698e753b7be36d:0x7b1a63ce48479a52!8m2!3d-6.2699393!4d107.0096553"
            )
        )
        dataList.add(
            Item(
                "Bekasi",
                "Rumah Baru Segera City , Disewakan",
                "Rp.20.000.000 / Tahun",
                "Helen Patricia",
                "Disewakan Cepat Rumah Segara City Cluster Galea, Bekasi, Luas Bangunan 53 meter kubik",
                "3",
                "081296333110",
                "1",
                "1",
                "53",
                R.drawable.lippo_cikarang,
                "https://www.google.com/maps/place/Segara+City+Cluster+GALEA/@-6.121031,106.9739406,13z/data=!4m8!1m2!2m1!1s+Segara+City+Cluster+Galea,+Bekasi+-+Jawa+Barat!3m4!1s0x2e6a21ce90912cfd:0xac2a7bb2a25e04b2!8m2!3d-6.121031!4d107.0015352"
            )
        )
        dataList.add(
            Item(
                "Lippo Cikarang, Bekasi",
                "Rumah Disewakan di Cluster Taman Simpruk Lippo Cikarang",
                "Rp.45.000.000 / Tahun",
                "Verawaty",
                "Rumah ini berada di CLuster Taman Simpruk yang masih berada di Perumahan Lippo Cikarang, Bekasi",
                "2",
                "082112150546",
                "3",
                "1",
                "54",
                R.drawable.kayuringin,
                "https://www.google.com/maps/place/Lippo+Cikarang,+Bekasi,+West+Java/@-6.3419615,107.1342671,13.74z/data=!4m5!3m4!1s0x2e699bb083fdaa3d:0xb12c1051efa31f2d!8m2!3d-6.3397806!4d107.1366365"
            )
        )
        dataList.add(
            Item(
                "Kayuringin, Bekasi Selatan",
                "Rumah Kontrakan di Kota Bekasi",
                "Rp.13.000.000 / Tahun",
                "Dicky Septiandre",
                "kontrakan Kosong Di daerah bekasi (Belakang stadion bekasi)",
                "1",
                "087848491999",
                "1",
                "1",
                "27",
                R.drawable.bekasi,
                "https://www.google.com/maps/place/Patriot+Candrabaga+Stadium/@-6.2410178,106.9804656,15.07z/data=!4m13!1m7!3m6!1s0x2e698c38c055b0e7:0x2849e8337f5127f7!2sKayuringin+Jaya,+Bekasi+Selatan,+Bekasi+City,+West+Java!3b1!8m2!3d-6.2400747!4d106.9860384!3m4!1s0x2e698c3b9fd3a34b:0xf08ce85cd7be57a1!8m2!3d-6.2383487!4d106.9918746"
            )
        )


        displayList.addAll(dataList)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        val menuItem = menu!!.findItem(R.id.search)

        if (menuItem != null) {
            val searchView = menuItem.actionView as SearchView

            val editText = searchView.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
            editText.hint = "Cari berdasarkan harga..."

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {

                    if (newText!!.isNotEmpty()){

                        displayList.clear()
                        val search = newText.toLowerCase(Locale.getDefault())
                        dataList.forEach {
                            if (it.harga.toLowerCase(Locale.getDefault()).contains(search)){
                                displayList.add(it)
                            }
                        }

                        rv_popular.adapter!!.notifyDataSetChanged()
                    }

                    else{
                        displayList.clear()
                        displayList.addAll(dataList)
                        rv_popular.adapter!!.notifyDataSetChanged()
                    }

                    return true
                }

            })
        }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }


}
