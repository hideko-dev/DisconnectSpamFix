package dev.hideko.disconnectspamfix

import dev.hideko.disconnectspamfix.listener.GetDisconnect
import org.bukkit.plugin.java.JavaPlugin

class DisconnectSpamFix : JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(GetDisconnect(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

}
