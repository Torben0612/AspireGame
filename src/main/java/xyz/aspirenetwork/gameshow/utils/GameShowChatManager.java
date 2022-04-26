package xyz.aspirenetwork.gameshow.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GameShowChatManager implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        Bukkit.broadcastMessage(ChatColor.BLUE + player.getName() + " has joined the GameShow!");

    }

}
