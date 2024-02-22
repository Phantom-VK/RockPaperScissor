package com.example.rockpaperscissor

object RockPaperScissorsLogic {

    enum class Result {
        WIN, LOSS, DRAW
    }

    fun playGame(playerMove: String, computerMove: String): Result {
        return when {
            playerMove == computerMove -> Result.DRAW
            playerMove == "ROCK" && computerMove == "SCISSORS" ||
                    playerMove == "PAPER" && computerMove == "ROCK" ||
                    playerMove == "SCISSORS" && computerMove == "PAPER" -> Result.WIN
            else -> Result.LOSS
        }
    }

    fun getRandomMove(): String {
        return arrayListOf<String>("ROCK", "PAPER", "SCISSOR").random()
    }
}
