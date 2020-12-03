package me.glaremasters.guilds.guild

data class GuildScore(var wins: Int = 0,var loses: Int = 0 ) {

    fun addWin() {
        wins += 1
    }

    fun addLoss() {
        loses += 1
    }

    fun reset() {
        wins = 0
        loses = 0
    }
}
