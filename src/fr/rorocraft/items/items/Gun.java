package fr.rorocraft.items.items;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Gun {

    public static ItemStack getGun(){

        ItemStack gun = new ItemStack(Material.GOLD_HOE);
        ItemMeta gunMeta = gun.getItemMeta();
        gunMeta.setDisplayName(ChatColor.RED + "Gun");
        gunMeta.setLore(Arrays.asList(ChatColor.GOLD +"<Item Colector>"));
        gunMeta.addEnchant(Enchantment.SILK_TOUCH, 1 , true);
        gunMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        gun.setItemMeta(gunMeta);
        return gun;
    }
}
