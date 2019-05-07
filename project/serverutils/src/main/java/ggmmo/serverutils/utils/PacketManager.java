package ggmmo.serverutils.utils;

import ggmmo.serverutils.enums.PacketRecipient;
import net.minecraft.server.v1_12_R1.Packet;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.List;

public class PacketManager {
    public static void sendPacket(Packet<?> packet, Player player) {
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
    }

    public static void sendPacketToPlayers(Packet<?> packet, @Nullable List<Player> recipients, PacketRecipient recipientType) {
        for (Player p : (recipientType == PacketRecipient.ALL ? Bukkit.getOnlinePlayers() : recipients)) {
            sendPacket(packet, p);
        }
    }
}
