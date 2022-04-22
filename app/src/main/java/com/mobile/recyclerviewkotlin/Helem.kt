package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Helem(
    val imgHelem: Int,
    val nameHelem: String,
    val descHelem:  String
) : Parcelable
