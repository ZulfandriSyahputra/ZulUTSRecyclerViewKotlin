package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val helemList = listOf<Helem>(
            Helem(
                R.drawable.helem1,
                "Helem INK ",
                "Helem INK Harga: Rp.800.000"
            ),
            Helem(
                R.drawable.helem2,
                "Helem KYT",
                "Helem KYT Harga: Rp.800.000"
            ),
            Helem(
                R.drawable.helem3,
                "Helem INK",
                "Helem INK Harga: Rp.800.000"
            ),
            Helem(
                R.drawable.helem4,
                "Helem KYT Leopard",
                "Helem KYT Leopard Harga: Rp.2.500.000"
            ),
            Helem(
                R.drawable.helem5,
                "Helem JPX",
                "Helem JPX Harga: Rp.500.000"
            ),
            Helem(
                R.drawable.helem6,
                "Helem GM",
                "Helem GM Harga: Rp.800.000"
            ),
            Helem(
                R.drawable.helem7,
                "Helem NHK",
                "Helem NHK Harga: Rp.1.500.000"
            ),
            Helem(
                R.drawable.helem8,
                "Helem Arrai",
                "Helem Arrai Harga: Rp.20.000.000"
            ),
            Helem(
                R.drawable.helem9,
                "Helem Arrai Monster",
                "Helem Arrai Monster Harga: Rp.21.000.000"
            ),
            Helem(
                R.drawable.helem10,
                "Helem Shark",
                "Helem Shark Harga: Rp.2.000.000"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_helem)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HelemAdapter(this, helemList){

            val intent = Intent (this, DetailHelemActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}