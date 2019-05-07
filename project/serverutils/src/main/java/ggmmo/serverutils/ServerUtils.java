package ggmmo.serverutils;

import ggmmo.serverutils.utils.MessageManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerUtils extends JavaPlugin {
    private static ServerUtils plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        MessageManager.consoleGood("Plugin enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static ServerUtils getPlugin() {
        return plugin;
    }
}
