package com.example.plantdiseasedetectionapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_leaf.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }
    var selected: Uri?=null
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==0&&resultCode== Activity.RESULT_OK&&data!=null){
            selected=data.data
            val bitmap= MediaStore.Images.Media.getBitmap(contentResolver,selected)
            de.setImageBitmap(bitmap)
            select.alpha=0F
        }
    }
}