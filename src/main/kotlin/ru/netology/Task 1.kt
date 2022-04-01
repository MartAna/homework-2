package ru.netology

fun main() {

    val minCommission = 3_500
    val sizeCommission = 0.0075
    val amount = 1_500_000

    val commission = amount*sizeCommission
    val result = if (commission>minCommission) commission else minCommission

    println(result)

}