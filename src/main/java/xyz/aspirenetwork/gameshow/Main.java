package xyz.aspirenetwork.gameshow;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.aspirenetwork.gameshow.sounds.PingButton;
import xyz.aspirenetwork.gameshow.sounds.BackgroundMusic;
import xyz.aspirenetwork.gameshow.utils.GameShowChatManager;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PingButton(), this);
        Bukkit.getPluginManager().registerEvents(new GameShowChatManager(), this);
        Bukkit.getPluginManager().registerEvents(new GameShowChatManager(), this);
        getCommand("start-background-music").setExecutor(new BackgroundMusic());
    }
}
