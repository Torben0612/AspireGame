package xyz.aspirenetwork.gameshow;

import com.google.gson.Gson;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.aspirenetwork.gameshow.PluginStorage.JSONData;
import xyz.aspirenetwork.gameshow.questions.Question1;
import xyz.aspirenetwork.gameshow.questions.history.History400;
import xyz.aspirenetwork.gameshow.sounds.PingButton;
import xyz.aspirenetwork.gameshow.sounds.BackgroundMusic;
import xyz.aspirenetwork.gameshow.utils.GameShowChatManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //json manager
        JSONData data = new JSONData("Test", "1", false);
        try {
            getDataFolder().mkdir();
            File jsonfile = new File(getDataFolder(), "data.json");
            if (!jsonfile.exists()) {
                jsonfile.createNewFile();
            }

            Gson gson = new Gson();
            Writer writer = new FileWriter(jsonfile, false);
            gson.toJson(data, writer);
            writer.flush();
            writer.close();

            System.out.println("Saved JSON File");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //register Events

        Bukkit.getPluginManager().registerEvents(new PingButton(), this);
        Bukkit.getPluginManager().registerEvents(new GameShowChatManager(), this);

        //register Commands
        getCommand("play-background-music").setExecutor(new BackgroundMusic());
        getCommand("history-400").setExecutor(new History400());
    }
}
