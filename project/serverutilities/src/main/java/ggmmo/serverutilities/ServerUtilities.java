package ggmmo.serverutilities;

import ggmmo.serverutilities.utils.messages.MessageManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ServerUtilities extends JavaPlugin {
    private static ServerUtilities plugin;
    private MessageManager messageManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        messageManager = new MessageManager(plugin);

        messageManager.consoleInfo("Enabled plugin");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        messageManager.consoleInfo("Disabled plugin");
    }

    public static ServerUtilities getPlugin() {
        return plugin;
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
