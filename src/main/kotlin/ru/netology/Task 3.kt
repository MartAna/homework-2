package ru.netology

fun main() {
    val itemCount = 21
    val itemPrice = 10_000
    val firstDiscount = 100_100
    val sizeFirstDiscount = 10_000
    val secondDiscount = 1_000_100
    val sizeSecondDiscount = 0.05
    val loyalDiscount = 0.01
    val loyalBuyer = true

    val totalPrice = itemCount * itemPrice
    val result = if (totalPrice >= secondDiscount) totalPrice - totalPrice*sizeSecondDiscount else if (totalPrice >= firstDiscount) totalPrice-sizeFirstDiscount else totalPrice
    val loyalResult = if (loyalBuyer) result.toInt() - result.toInt()*loyalDiscount else result
    println(totalPrice)
    println(result)
    println("Итоговая цена " + loyalResult.toInt()/100 + " рублей " + loyalResult.toInt()%100 + " копеек")




}