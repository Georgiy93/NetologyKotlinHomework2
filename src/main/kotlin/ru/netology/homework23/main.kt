package ru.netology.homework23

val scan = java.util.Scanner(System.`in`)

fun main() {
    var summa: Int = 10000
    var discount: Double = 0.0
    if (summa <= 1000) {
        discount = 0.0

    } else if (summa in 1001..10000) {
        discount = 100.0

    } else if (summa > 10000) {
        discount = summa * 0.05
    }
    var total: Double = summa - discount
    println("Если ли клиент является постоянным покупателем, то введите true, иначе false")
    var regularCustomer: Boolean = scan.nextBoolean()
    if (regularCustomer) {
        total -= total * 0.01
    }
    scan.close()
    println("Итоговая сумма покупки: $total руб.")
}
