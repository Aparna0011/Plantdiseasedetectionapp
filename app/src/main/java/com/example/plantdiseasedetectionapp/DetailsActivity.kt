package com.example.plantdiseasedetectionapp

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.net.toUri
import com.example.plantdiseasedetectionapp.databinding.ActivityDetailsBinding
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_leaf.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var result = intent.getStringExtra("ResultName")
        var confidence = intent.getFloatExtra("confidence",0.0F)
        var uri = intent.getStringExtra("uri")
        var bundle = intent.getBundleExtra("bundle")
        if (uri != null) {
            de.setImageURI(uri.toUri())
        }
        if(bundle!=null){
            val bitmap = bundle.get("data") as Bitmap
            de.setImageBitmap(bitmap)
        }
        binding.label.text = result
        binding.confidency.text = confidence.toString()
    }

}