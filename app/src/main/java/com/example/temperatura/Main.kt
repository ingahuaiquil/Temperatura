package com.example.temperatura

fun main() {

    println("Ingrese el valor")
    val input = readLine()!!.toDouble()
    val fahrenheit = (input * (9.0/5.0))+32

    println("Fahrenheint: $fahrenheit")

    val kelvin = input + 273.15

    println("Kelvin: $kelvin")

    val fahrenheitToKelvin = 5.0/9.0 * (fahrenheit - 32) + 273.15
    println("Farenheit a Kelvin $fahrenheitToKelvin")

}

