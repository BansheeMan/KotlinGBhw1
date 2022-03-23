package com.example.kotlingb_2303

import android.util.Log

fun print(item: String){
    Log.d("MyLog", item)
}
//-----------------------------------------

fun print(item: Int){
    Log.d("MyLog", "$item")
}
//-----------------------------------------

fun print(arr: IntArray){
    var str = "arr: "
    arr.forEach { a ->
        str = "$str $a"
    }
    Log.d("MyLog", "$str")
}
//-----------------------------------------

fun print(arr: Array<Int>){
    var str = "arr: "
    arr.forEach { a ->
        str = "$str $a"
    }
    Log.d("MyLog", "$str")
}
//-----------------------------------------
fun print(item: Boolean){
    Log.d("MyLog", item.toString())
}
//-----------------------------------------
fun print(myMap: Map<String, Int>){
    var str = "MAP: "
    for((key,  value) in myMap){
        str += "$key => $value | "

    }
    Log.d("MyLog", str)
}
//-----------------------------------------
