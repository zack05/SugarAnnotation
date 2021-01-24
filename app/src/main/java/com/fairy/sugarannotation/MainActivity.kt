package com.fairy.sugarannotation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fairy.sugar_annotation.SugarViewHolder

@SugarViewHolder(layoutRes = R.layout.activity_main)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}