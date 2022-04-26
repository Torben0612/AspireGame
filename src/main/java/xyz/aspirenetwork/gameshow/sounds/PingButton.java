package xyz.aspirenetwork.gameshow.sounds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class PingButton implements Listener {

    @EventHandler
    public void onSneak(PlayerToggleSneakEvent e){

        if (e.isSneaking()){
            e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.BLOCK_NOTE_BLOCK_BELL, 50, 0.66F);
            Bukkit.broadcastMessage(ChatColor.GREEN + "You Are listening to: Stal by C418!");

        }

    }

}
