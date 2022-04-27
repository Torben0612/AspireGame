package xyz.aspirenetwork.gameshow.questions.science;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class Science600 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player){

            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta meta = (BookMeta) book.getItemMeta();

            meta.setTitle(ChatColor.BLUE + "CATOGORY" + ChatColor.GOLD + " POINTS");
            meta.setAuthor(ChatColor.DARK_PURPLE + "Aspire Game Show");
            meta.addPage(
                    ChatColor.BLUE + "Catogory: CATOGORY" +
                            "\n" + ChatColor.GOLD + "Worth POINT" +
                            "\n" + ChatColor.BLUE + "QUESTION GOES HERE"
            );
            book.setItemMeta(meta);
            player.getInventory().addItem(book);
        }
        return false;
    }
}
