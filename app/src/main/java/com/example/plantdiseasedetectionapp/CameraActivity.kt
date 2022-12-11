package com.example.plantdiseasedetectionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plantdiseasedetectionapp.LeafActivity.Companion.count
import kotlinx.android.synthetic.main.activity_camera.*

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        val intent=getIntent()

        if(count==1){
            val message=intent.getStringExtra("Corn")
            scan.text="Scan the leaf of $message"
        }
        if(count==2){
            val message=intent.getStringExtra("Potato")
            scan.text="Scan the leaf of $message"
        }
        if(count==3){
            val message=intent.getStringExtra("Grape")
            scan.text="Scan the leaf of $message"
        }
        if(count==4){
            val message=intent.getStringExtra("Tomato")
            scan.text="Scan the leaf of $message"
        }
        if(count==5){
            val message=intent.getStringExtra("Bell")
            scan.text="Scan the leaf of $message"
        }
        if(count==6){
            val message=intent.getStringExtra("Apple")
            scan.text="Scan the leaf of $message"
        }

    }
}