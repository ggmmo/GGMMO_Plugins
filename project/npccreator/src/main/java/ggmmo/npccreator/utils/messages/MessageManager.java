package ggmmo.npccreator.utils.messages;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class MessageManager {
    private JavaPlugin plugin;

    public MessageManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    private final String msgPrefix = "[" + plugin.getName() + "] ";

    public void consoleInfo(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + msgPrefix + message);
    }

    public void consoleGood(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + msgPrefix + message);
    }

    public void consoleBad(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + msgPrefix + message);
    }

    public void playerInfo(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.YELLOW + msgPrefix + message);
    }

    public void playerGood(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.DARK_GREEN + msgPrefix + message);
    }

    public void playerBad(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.DARK_RED + msgPrefix + message);
    }
}
