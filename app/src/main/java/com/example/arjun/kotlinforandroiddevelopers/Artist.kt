package com.example.arjun.kotlinforandroiddevelopers

data class Artist(var id:Long,var name:String?,var url:String,var mbid:String){


    fun print():String{
        return "artist print";
    }

}