package me.glaremasters.guilds.guild

import org.bukkit.Bukkit
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.UUID

class GuildMember(val uuid: UUID, var role: GuildRole) {
    var joinDate: Long = 0
    var lastLogin: Long = 0

    fun isOnline() = asOfflinePlayer().isOnline

    fun asOfflinePlayer() = Bukkit.getOfflinePlayer(uuid)

    fun asPlayer() = Bukkit.getPlayer(uuid)

    fun name() = asOfflinePlayer().name

}
