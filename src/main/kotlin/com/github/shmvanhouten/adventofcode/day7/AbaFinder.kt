package com.github.shmvanhouten.adventofcode.day7

class AbaFinder {
    fun getAllAbasFromString(sequence: String): List<String> {
        return sequence.flatMap { getAbasStartingWithChar(sequence, it) }
    }

    private fun getAbasStartingWithChar(sequence: String, char: Char): List<String> {
        val startAndEndRemoved = sequence.split(char)
                .filterIndexed { index, _ -> (index > 0 && index < sequence.split(char).size - 1) }
        val potentialAbas = startAndEndRemoved.filter { it.length == 1 && it[0] != char }
        return if ( !potentialAbas.isEmpty()) {
            potentialAbas.map { char + it + char }
        } else emptyList()
    }
}