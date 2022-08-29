package com.kamilh.moduleB

import com.kamilh.moduleA.HockeyPlayer

class PlayerQueries(private val playerQueriesQueries: PlayerQueriesQueries) {

    fun allPlayers(): List<HockeyPlayer> =
        playerQueriesQueries.selectAll().executeAsList()
}
