package com.LullBukkitAPI.xBuhari.Server;

import org.bukkit.plugin.java.JavaPlugin;

public class ServerAPI {

    private JavaPlugin plugin;

    public ServerAPI(JavaPlugin javaPlugin) {
        this.plugin = javaPlugin;
    }

    public double getServerTPS() {
        return TPS.getTPS();
    }
}
