package fr.rorocraft.items.items;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class SuperCanne {

    public static ItemStack getSuperCanne(){
        ItemStack supercanne = new ItemStack(Material.FISHING_ROD);
        ItemMeta canneMeta = supercanne.getItemMeta();
        canneMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Super canne");
        canneMeta.setLore(Arrays.asList(ChatColor.GOLD + "<Item Collector>", ChatColor.LIGHT_PURPLE + "Super canne à pêche"));
        canneMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
        canneMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        supercanne.setItemMeta(canneMeta);

        // Fin ...

        return supercanne;
    }
}
