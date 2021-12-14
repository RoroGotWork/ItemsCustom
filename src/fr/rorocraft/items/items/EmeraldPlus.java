package fr.rorocraft.items.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EmeraldPlus {


    public static ItemStack getEmeraldPlus(){
        ItemStack it = new ItemStack(Material.EMERALD);
        ItemMeta itMeta  = it.getItemMeta();
        itMeta.setDisplayName(ChatColor.GREEN + "Emeraude +");
        itMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        itMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        it.setItemMeta(itMeta);

        return it;
    }
}
