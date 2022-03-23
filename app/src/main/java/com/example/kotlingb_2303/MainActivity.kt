package com.example.kotlingb_2303

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import com.example.kotlingb_2303.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.button1.setOnClickListener(click)

        print(myLanguages(map1))
        print(myLanguages(map2))
        print(myLanguages(map3))

        print(replaceAEIOUaeiou("Imagination rules the world"))

        val dog1 = Dog("Sally", 3)
        print(dog1.toString())
        val dog2 = Dog()
        print(dog2.toString())
        val dog3 = dog2.copy(age = 3)
        print(dog3.toString())


    }

    val click = View.OnClickListener {
        with(binding){
            textView2.text = textView1.text
            textView1.text = editText1.text
        }
    }

    private fun myLanguages(s: Map<String, Int>): Map<String, Int> {
        val newMap = mutableMapOf<String, Int>()
        s.forEach { (key,  value) ->
            if (value >= 60){ newMap += key to value }
        }
        return s
    }

    fun replaceAEIOUaeiou(s: String) = s.replace(Regex("[aeiouAEIOU]"), "!")

}

val map1 = mapOf(
    "Java" to 10,
    "Ruby" to 80,
    "Python" to 65)

val map2 = mapOf(
    "Hindi" to 60,
    "Dutch" to 93,
    "Greek" to 71)

val map3 = mapOf(
    "C++" to 50,
    "ASM" to 10,
    "Haskell" to 20)

val arr1 = intArrayOf(1,2,3,4,5)