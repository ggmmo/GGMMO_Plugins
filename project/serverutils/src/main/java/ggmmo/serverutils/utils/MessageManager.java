package ggmmo.serverutils.utils;

import ggmmo.serverutils.ServerUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MessageManager {
    private static ServerUtils plugin = ServerUtils.getPlugin();
    private static final String msgPrefix = "[" + plugin.getName() + "] ";

    public static void consoleInfo(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + msgPrefix + message);
    }

    public static void consoleGood(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + msgPrefix + message);
    }

    public static void consoleBad(String message) {
        plugin.getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + msgPrefix + message);
    }

    public static void playerInfo(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.YELLOW + msgPrefix + message);
    }

    public static void playerGood(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.DARK_GREEN + msgPrefix + message);
    }

    public static void playerBad(@NotNull Player player, String message) {
        player.sendMessage(ChatColor.DARK_RED + msgPrefix + message);
    }
}
