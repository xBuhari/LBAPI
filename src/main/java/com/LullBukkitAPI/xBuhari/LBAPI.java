package com.LullBukkitAPI.xBuhari;

import com.LullBukkitAPI.xBuhari.Server.ServerAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class LBAPI {

    private JavaPlugin plugin;

    private ServerAPI serverAPI;

    public LBAPI(JavaPlugin javaPlugin) {
        if (this.plugin != null) {
            return;
        }
        this.plugin = javaPlugin;
        Util.setup(this.plugin);
        this.setupAPIS();
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public ServerAPI getServerAPI() {
        return serverAPI;
    }

    private void setupAPIS() {
        this.serverAPI = new ServerAPI(plugin);
    }
}
