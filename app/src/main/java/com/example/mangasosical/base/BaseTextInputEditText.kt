package com.example.mangasosical.base

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import com.example.mangasosical.utils.extension.hideKeyboard
import com.google.android.material.textfield.TextInputEditText

class BaseTextInputEditText(context: Context, attrs: AttributeSet?) : TextInputEditText(context, attrs){
    override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(focused, direction, previouslyFocusedRect)
        if (!focused) this.hideKeyboard()
    }
}