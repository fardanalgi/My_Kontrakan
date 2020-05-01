package com.frdcompany.mykontrakan.home


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.frdcompany.mykontrakan.DetailKontrakan
import com.frdcompany.mykontrakan.R
import com.frdcompany.mykontrakan.utils.Preferences
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var preferences: Preferences
    lateinit var mDatabase : DatabaseReference

    private var dataList = ArrayList<Item>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        preferences = Preferences(activity!!.applicationContext)
        mDatabase = FirebaseDatabase.getInstance().getReference("Kontrakan")

        rv_popular.layoutManager = LinearLayoutManager(context!!.applicationContext)
        getData()

    }

    private fun getData(){
        mDatabase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                dataList.clear()
                for (getdataSnapshot in dataSnapshot.getChildren()){

                    val item = getdataSnapshot.getValue(Item::class.java!!)
                    dataList.add(item!!)
                }

                if (dataList.isNotEmpty()){
                    rv_popular.adapter = HomeAdapter(dataList){
                        val intent = Intent(context,DetailKontrakan::class.java)
                            .putExtra("data",it)
                        startActivity(intent)
                    }

                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context,""+error.message, Toast.LENGTH_LONG).show()
            }

        })
    }
}
