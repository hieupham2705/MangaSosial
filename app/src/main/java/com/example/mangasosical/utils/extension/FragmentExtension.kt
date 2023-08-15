package com.example.mangasosical.utils.extension

import android.widget.Toast
import androidx.fragment.app.Fragment


fun Fragment.showToast(mess: String) {
    Toast.makeText(context,mess,Toast.LENGTH_LONG).show()
}
