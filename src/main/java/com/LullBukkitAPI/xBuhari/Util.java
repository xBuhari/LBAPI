package com.LullBukkitAPI.xBuhari;

import com.LullBukkitAPI.xBuhari.Server.TPS;
import org.bukkit.plugin.java.JavaPlugin;

public class Util {
    protected static void setup(JavaPlugin plugin) {
        plugin.getServer().getScheduler().scheduleSyncRepeatingTask(plugin, new TPS(), 100L, 1L);
    }
}
