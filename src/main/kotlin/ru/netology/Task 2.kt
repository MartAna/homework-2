package ru.netology

fun main() {
    val likes =51
    val man = "человеку"
    val people = "людям"

    val result = when (likes % 10) {
        1 -> if (likes/10 == 1) people else man
        else -> people
    }

    println("Понравилось $likes $result")
}
