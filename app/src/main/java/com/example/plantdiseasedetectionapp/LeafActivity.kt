package com.example.plantdiseasedetectionapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.TextView
import com.example.plantdiseasedetectionapp.databinding.ActivityLeafBinding
import kotlinx.android.synthetic.main.activity_camera.*
import kotlinx.android.synthetic.main.activity_leaf.*
import kotlinx.android.synthetic.main.activity_name.*

class LeafActivity : AppCompatActivity() {



    private  var count: Int = 0
    private lateinit var binding: ActivityLeafBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeafBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val intent = getIntent()
        val message = intent.getStringExtra("Name")
        binding.name1.text = "Hello, $message"
        binding.corn.setOnClickListener {
            count = 1
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Corn", "corn")
            intent.putExtra("Count",count)
            startActivity(intent)
        }
        binding.potato.setOnClickListener {
            count = 2
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Potato", "potato")
            intent.putExtra("Count",count)
            startActivity(intent)
        }
        binding.grape.setOnClickListener {
            count = 3
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Grape", "grape")
            intent.putExtra("Count",count)
            startActivity(intent)
        }
        binding.banana.setOnClickListener {
            count = 4
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Tomato", "tomato")
            intent.putExtra("Count",count)
            startActivity(intent)
        }
        binding.bell.setOnClickListener {
            count = 5
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Bell", "bell")
            intent.putExtra("Count",count)
            startActivity(intent)
        }

        binding.apple.setOnClickListener {
            count = 6
            val intent = Intent(this, CameraActivity::class.java)
//            intent.putExtra("Apple", "apple")
            intent.putExtra("Count",count)
            startActivity(intent)
        }
//       storage.setOnClickListener {
//    val intent=Intent(Intent.ACTION_PICK)
//    intent.type="image/*"
//    startActivityForResult(intent,0)
//}
//
//    }
//    var selected: Uri?=null
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(requestCode==0&&resultCode== Activity.RESULT_OK&&data!=null){
//            selected=data.data
//            val bitmap= MediaStore.Images.Media.getBitmap(contentResolver,selected)
//            cicle_image.setImageBitmap(bitmap)
//            select.alpha=0F
//        }
//    }

    }
}