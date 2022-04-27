package xyz.aspirenetwork.gameshow.questions.history;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class History400 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (sender instanceof Player){

            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta meta = (BookMeta) book.getItemMeta();

            meta.setTitle(ChatColor.BLUE + "History" + ChatColor.GOLD + " 200");
            meta.setAuthor(ChatColor.DARK_PURPLE + "Aspire Game Show");
            meta.addPage(
                    ChatColor.BLUE + "Catogory: History" +
                            "\n" + ChatColor.GOLD + "Worth: 200"
            );
            meta.addPage("Who was the Second" +
                    "\n" + "President of the" +
                    "\n" + "United States of" +
                    "\n" + "America");
            meta.addPage(ChatColor.RED + "John Adams");
            book.setItemMeta(meta);
            player.getInventory().addItem(book);
        }
        return false;
    }
}
