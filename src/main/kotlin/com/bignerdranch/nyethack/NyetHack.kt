package com.bignerdranch.nyethack
val player = Player()
fun main() {

    //changeNarratorMood()
    narrate("${player.name} is ${player.title}")
    player.changeName("Aurelia")
    narrate("${player.name}, ${player.title}, heads to the town square")
    menuFormat(menuItemPrices)
    visitTavern()
}

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
        // Выводит message желтым цветом
        "\u001b[33;1m$message\u001b[0m"
    }
    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
    "The hero must have a name."
    }
    return input*/
    println("Madrigal")
    return "Madrigal"
}
