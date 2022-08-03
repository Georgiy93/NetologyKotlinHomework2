package ru.netology.homework21

fun main() {
    val minTax = 3500
    // введем комиссию 0.75%
    val tax = 0.0075
    var amount = 14500100

    var resultTax = if (amount * tax < minTax) minTax else amount * tax
    println("Коммисия составила: $resultTax коп. ")
}