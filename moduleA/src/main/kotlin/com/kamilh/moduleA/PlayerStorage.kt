package com.kamilh.moduleA

class PlayerStorage(private val playerQueries: PlayerQueries) {

    fun insert(hockeyPlayer: HockeyPlayer) {
        playerQueries.insert(full_name = hockeyPlayer.full_name, player_number = hockeyPlayer.player_number)
    }
}
