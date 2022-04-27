package xyz.aspirenetwork.gameshow.questions;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class Question1 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player){

            ItemStack q1 = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta meta = (BookMeta) q1.getItemMeta();

            meta.setTitle(ChatColor.WHITE + "QUESTION 1");
            meta.setAuthor(ChatColor.BLUE + "");
            meta.addPage(
                    ChatColor.BLUE + "Question 1:" +
                            "\n" + ChatColor.BLUE + "What content is australia"            
            );
            q1.setItemMeta(meta);
	        for(Player player : Bukkit.getOnlinePlayers){
                
                player.getInventory().addItem(q1);
            }
        }
        return false;
    }
}
