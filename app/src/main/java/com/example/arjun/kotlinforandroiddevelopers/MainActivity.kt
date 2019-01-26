package com.example.arjun.kotlinforandroiddevelopers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   // var wontcompile:Artist=null

    var artist:Artist?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        artist=Artist(2,null,"","")

        // wont compile artist could be null
       // artist.print();

        // checking not qual to null
        artist?.print();

        //Toast.makeText(this,""+artist?.print(),Toast.LENGTH_SHORT).show()

        // same as above
//        if(artist!=null){
//            Toast.makeText(this,""+artist!!.name,Toast.LENGTH_SHORT).show()
//        }

        // only sure when not null
        artist!!.print();

        val name=artist?.name?:"empty"

        Toast.makeText(this,name,Toast.LENGTH_SHORT).show()


    }

  
}
