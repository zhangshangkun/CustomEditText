package com.zsk.customedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zsk.library_edittext.CustomEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        edit_1.setOnEditCompleteListener(object : CustomEditText.OnEditCompleteListener{
            override fun onEditComplete(text: String) {
                Toast.makeText(this@MainActivity, "edit_1 text: $text", Toast.LENGTH_SHORT).show()
            }
        })

        edit_2.setOnEditCompleteListener(object : CustomEditText.OnEditCompleteListener{
            override fun onEditComplete(text: String) {
                Toast.makeText(this@MainActivity, "edit_2 text: $text", Toast.LENGTH_SHORT).show()
            }
        })
    }
}