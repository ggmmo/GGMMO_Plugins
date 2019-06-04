package ggmmo.serverutilities.utils.packets;


import net.minecraft.server.v1_12_R1.Packet;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.libs.jline.internal.Nullable;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.List;

// If this file is giving errors:
// 1. Download and run build tools from https://www.spigotmc.org/wiki/buildtools/
// 2. Add the following to your pom.xml dependencies:
/*
<dependency>
    <groupId>org.bukkit</groupId>
    <artifactId>CraftBukkit</artifactId>
    <version>1.12.2-R0.1-SNAPSHOT</version>
</dependency>
 */
// 3. Run auto imports
// Note: The @Nullable annotation import is org.bukkit.craftbukkit.libs.jline.internal.Nullable;

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
