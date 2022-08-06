package dev.Zeron.McForce

import dev.Zeron.McForce.Resource.Data.prefix
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("$prefix McForce가 활성화중입니다")
        logger.info("$prefix 버그/피드백 -> Zeron#6595")
    }
    override fun onDisable() {
        logger.info("$prefix McForce가 비활성화중입니다")
        logger.info("$prefix 버그/피드백 -> Zeron#6595")
    }
}