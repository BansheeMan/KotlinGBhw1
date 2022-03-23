package com.example.kotlingb_2303

data class Dog(var name: String = "Pooch", var age: Int? = null){

    override fun toString(): String {
        return "Пес делает ВУФ-ВУФ!!! Кличка: $name Возраст: $age"
    }
}
