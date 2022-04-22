package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailHelemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_helem)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val helem = intent.getParcelableExtra<Helem>(MainActivity.INTENT_PARCELABLE)

        val imgHelem = findViewById<ImageView>(R.id.img_item_photo)
        val nameHelem = findViewById<TextView>(R.id.tv_item_name)
        val descHelem = findViewById<TextView>(R.id.tv_item_description)

        imgHelem.setImageResource(helem?.imgHelem!!)
        nameHelem.text = helem.nameHelem
        descHelem.text = helem.descHelem
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}