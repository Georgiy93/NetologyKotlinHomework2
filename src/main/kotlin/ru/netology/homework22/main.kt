package ru.netology.homework22

fun main() {
    //TODO
    /*1 человеку
    2 людям
    3 людям
    4 людям
    5 людям
    6 людям
    7 людям
    8 людям
    9 людям
    10 людям
    11 людям, но 21 человеку */

    var likes: Int = 2146657
    if (likes == 0) {
        println(" Лайков нет")
    } else if (likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}