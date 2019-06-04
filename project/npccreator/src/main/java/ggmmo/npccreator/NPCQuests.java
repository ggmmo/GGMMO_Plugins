package ggmmo.npccreator;

import ggmmo.npccreator.npc.NPCManager;
import ggmmo.npccreator.quests.QuestManager;
import ggmmo.npccreator.utils.messages.MessageManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NPCQuests extends JavaPlugin {
    private static NPCQuests plugin;

    // Instance the message manager
    public MessageManager messageManager;
    // Instance the quest manager
    public QuestManager questManager;

    // Store the manager instances for reference
    private NPCManager npcManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;

        // Initialise messaging services
        messageManager = new MessageManager(getPlugin());
        // Initialise the NPC Manager
        npcManager = new NPCManager();
        npcManager.onEnable();
        //Initialise the Quest Manager
        questManager = new QuestManager();
        questManager.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        npcManager.onDisable();
        questManager.onDisable();
    }

    public static NPCQuests getPlugin() {
        return plugin;
    }
}
