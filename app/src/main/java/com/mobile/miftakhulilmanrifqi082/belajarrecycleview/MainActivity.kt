package com.mobile.miftakhulilmanrifqi082.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobile.miftakhulilmanrifqi082.belajarrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val list = ArrayList<Users>()

    val listUsers = arrayOf(
        "Miftakhul Ilman Rifqi",
        "Rizal Fahmi",
        "Cantika",
        "Richard",
        "Delta",
        "Putri Cantik",
        "Malik",
        "Mia",
        "Delis ",
        "Dito",
        "Rahmawati"
    )

    val listKota = arrayOf(
        "Air Upas",
        "Yogyakarta",
        "Pontianak",
        "Yogyakarta",
        "Klaten",
        "Yogyakarta",
        "Banjarmasin",
        "Yogyakarta",
        "Ketapang",
        "Raman",
        "Singkup"
    )

    val listGender = arrayOf(
        "Pria",
        "Pria",
        "Perempuan",
        "Pria",
        "Perempuan",
        "Perempuan",
        "Pria",
        "Perempuan",
        "Perempuan",
        "Pria",
        "Perempuan"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mRecyclerView.setHasFixedSize(false)
        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size){

            list.add(Users(listUsers.get(i), listKota.get(i), listGender.get(i)))
            if (listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                binding.mRecyclerView.adapter = adapter
            }
        }
    }
}
