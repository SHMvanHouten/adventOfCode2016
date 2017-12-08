package com.github.shmvanhouten.adventofcode.day24airductmaze

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

class ShortestRouteFinderTest {

    @Test
    fun `it should find the shortest route from 0 to 1 to be 2 steps`() {
        val routeFinder = ShortestRouteFinder()
        val rawInput = """###########
#0.1......#
#.#######.#
#.........#
###########"""
        assertThat(routeFinder.findShortestRoute(rawInput), equalTo(2))
    }

    @Test
    fun `it should find the shortest route from 0 to 1 to be 5 steps`() {
        val routeFinder = ShortestRouteFinder()
        val rawInput = """###########
#0........#
#.#######.#
#...1.....#
###########"""
        assertThat(routeFinder.findShortestRoute(rawInput), equalTo(5))
    }


    @Test
    fun `it should find the shortest route from 0 to 1 to 2 to be 6 steps`() {
        val routeFinder = ShortestRouteFinder()
        val rawInput = """###########
#0........#
#.#######.#
#...12....#
###########"""
        assertThat(routeFinder.findShortestRoute(rawInput), equalTo(6))
    }




}