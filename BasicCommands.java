package me.kagan0ft.basiccommands;

import me.kagan0ft.basiccommands.commands.flyCommand;
import me.kagan0ft.basiccommands.commands.healCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BasicCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("heal").setExecutor(new healCommand());
        getCommand("fly").setExecutor(new flyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
