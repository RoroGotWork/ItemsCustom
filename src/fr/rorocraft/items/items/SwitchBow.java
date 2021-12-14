package fr.rorocraft.items.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SwitchBow {

    public  static ItemStack getSwitchBow(){

        ItemStack it = new ItemStack(Material.BOW);
        ItemMeta itemMeta = it.getItemMeta();
        itemMeta.setDisplayName(ChatColor.RED + "Switch bow");
        itemMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it.setItemMeta(itemMeta);

        return it;
    }
}
