package dev.hideko.disconnectspamfix.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerKickEvent

class GetDisconnect: Listener {

    @EventHandler
    fun onGotKick(e: PlayerKickEvent) {
        if(e.reason == "disconnect.spam") {
            e.isCancelled = true
        }
    }

}