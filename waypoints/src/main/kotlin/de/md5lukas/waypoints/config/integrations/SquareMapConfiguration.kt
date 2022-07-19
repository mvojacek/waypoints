package de.md5lukas.waypoints.config.integrations

import de.md5lukas.waypoints.util.getStringNotNull
import org.bukkit.configuration.ConfigurationSection

class SquareMapConfiguration {

    var icon: String = ""
        private set

    var iconSize: Int = 3
        private set

    fun loadFromConfiguration(cfg: ConfigurationSection) {
        icon = cfg.getStringNotNull("icon")
        iconSize = cfg.getInt("iconSize")
    }
}