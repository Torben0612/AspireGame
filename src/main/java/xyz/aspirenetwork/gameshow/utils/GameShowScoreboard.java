package xyz.aspirenetwork.gameshow.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class GameShowScoreboard implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

        Objective obj = board.registerNewObjective("testboard", "dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName(ChatColor.YELLOW.toString() + ChatColor.BOLD + "Aspire Game Show");

        Score space1 = obj.getScore(" ");
        space1.setScore(1);

        Score info1 = obj.getScore(ChatColor.WHITE.toString() + "Welcome to the Aspire");
        info1.setScore(2);

        Score info2 = obj.getScore(ChatColor.WHITE.toString() + "game show hosted by Torben");
        info2.setScore(3);

        Score space2 = obj.getScore("  ");
        space2.setScore(4);

        Score discord = obj.getScore(ChatColor.BLUE.toString() + "https://discord.gg/VNKTCQkTNV");

        Score website = obj.getScore(ChatColor.YELLOW.toString() + "www.theaspiresmp.tk");
        info2.setScore(6);
    }


}
