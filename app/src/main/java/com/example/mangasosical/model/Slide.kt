package com.example.mangasosical.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Slide(
    val image: String? = null,
    val name: String? = null,
    val author: String? = null,
    val genres: String? = null,
    val chaper: Int? = null
) : Parcelable