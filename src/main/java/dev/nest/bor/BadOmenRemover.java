package dev.nest.bor;

import dev.nest.bor.listeners.IslandJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class BadOmenRemover extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().addDefault("enable", true);
        getConfig().options().copyDefaults(true);
        saveConfig();
        if (getConfig().getBoolean("enable")) {
            getServer().getPluginManager().registerEvents(new IslandJoin(), this);
        }
    }

    @Override
    public void onDisable() {}

}
