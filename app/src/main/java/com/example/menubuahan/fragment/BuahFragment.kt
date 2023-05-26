package com.example.menubuahan.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.menubuahan.Buah
import com.example.menubuahan.BuahAdapter
import com.example.menubuahan.R

class BuahFragment : Fragment() {
    private lateinit var adapter: BuahAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var buahArrayList: ArrayList<Buah>

    lateinit var image : Array<Int>
    lateinit var title : Array<String>
    lateinit var descriptions : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buah, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_buah)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = BuahAdapter(buahArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        buahArrayList = arrayListOf<Buah>()

        image = arrayOf(
            R.drawable.buah_naga,
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.mangga,
            R.drawable.kiwi,
            R.drawable.pir,
            R.drawable.pisang,

        )

        title = arrayOf(
            "Buah Naga",
            "Alpukat",
            "Apel,",
            "Ceri",
            "Durian",
            "Mangga",
            "Kiwi",
            "Pir",
            "Pisang"

        )

        descriptions = arrayOf(
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",
            "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum",

        )

        for (i in image.indices) {
            val buah = Buah(image[i], title[i], descriptions[i])
            buahArrayList.add(buah)
        }
    }

}