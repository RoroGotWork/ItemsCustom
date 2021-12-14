package fr.rorocraft.items.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SuperAxe {


    public static ItemStack getSuperAxe(){

        ItemStack it = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta itemMeta = it.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_GREEN + "Super Axe");
        itemMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemMeta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        it.setItemMeta(itemMeta);

        return it;
    }
}
