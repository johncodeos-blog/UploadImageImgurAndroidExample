package com.example.uploadimageimgurexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val imgurUrl = intent.getStringExtra("details_link")
        imgur_url_textview.text = imgurUrl

    }
}
