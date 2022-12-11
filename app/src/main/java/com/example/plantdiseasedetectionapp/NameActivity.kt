package com.example.plantdiseasedetectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        btn.setOnClickListener {
            clicked()
        }
    }
    private fun clicked(){
        var name=ed.text.toString()
        if(name.isEmpty()){
            Toast.makeText(this,"Name can not be null!!",Toast.LENGTH_SHORT).show()
        }
        else{
            val intent=Intent(this,LeafActivity::class.java)
                intent.putExtra("Name",name)
                startActivity(intent)


        }
    }
}