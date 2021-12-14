package fr.rorocraft.items.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmorFarm {

    public static ItemStack getHelmet(){
        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = helmet.getItemMeta();
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        helmet.setItemMeta(meta);

        return helmet;
    }

    public static ItemStack getChestPlate(){
        ItemStack chestPlate = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta meta = chestPlate.getItemMeta();
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        chestPlate.setItemMeta(meta);

        return chestPlate;
    }


    public static ItemStack getLeggings(){
        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta meta = leggings.getItemMeta();
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        leggings.setItemMeta(meta);

        return leggings;

    }

    public static ItemStack getBoots(){
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = boots.getItemMeta();
        meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        meta.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm");
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        boots.setItemMeta(meta);

        return boots;
    }
}
