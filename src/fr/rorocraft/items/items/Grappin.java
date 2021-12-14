package fr.rorocraft.items.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Grappin {


    public static ItemStack getGrappinBylevel(int level){

        switch (level){

            case 1:
                ItemStack grappin1 = new ItemStack(Material.FISHING_ROD);
                ItemMeta grappin1Meta = grappin1.getItemMeta();
                grappin1Meta.setDisplayName(ChatColor.DARK_GREEN + "Grappin Lvl.1");
                grappin1Meta.setLore(Arrays.asList(ChatColor.GOLD + "<Item Collector>", ChatColor.GREEN + "Grappin de niveau 1"));
                grappin1Meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                grappin1Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                grappin1.setItemMeta(grappin1Meta);

                return grappin1;

            case 2:
                ItemStack grappin2 = new ItemStack(Material.FISHING_ROD);
                ItemMeta grappin2Meta = grappin2.getItemMeta();
                grappin2Meta.setDisplayName(ChatColor.DARK_PURPLE + "Grappin Lvl.2");
                grappin2Meta.setLore(Arrays.asList(ChatColor.GOLD + "<Item Collector>", ChatColor.LIGHT_PURPLE + "Grappin de niveau 2" ));
                grappin2Meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                grappin2Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                grappin2.setItemMeta(grappin2Meta);

                return grappin2;

            case 3:
                ItemStack grappin3 = new ItemStack(Material.FISHING_ROD);
                ItemMeta grappin3Meta = grappin3.getItemMeta();
                grappin3Meta.setDisplayName(ChatColor.DARK_AQUA + "Grappin Lvl.3");
                grappin3Meta.setLore(Arrays.asList(ChatColor.GOLD + "<Item Collector>", ChatColor.LIGHT_PURPLE + "Grappin de niveau 3" ));
                grappin3Meta.setUnbreakable(true);
                grappin3Meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                grappin3Meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                grappin3.setItemMeta(grappin3Meta);

                return grappin3;

            default:
                ItemStack grappin = new ItemStack(Material.FISHING_ROD);
                ItemMeta grappinMeta = grappin.getItemMeta();
                grappinMeta.setDisplayName(ChatColor.DARK_GREEN + "Grappin Lvl.1");
                grappinMeta.setLore(Arrays.asList(ChatColor.GOLD + "<Item Collector>", ChatColor.GREEN + "Grappin de niveau 1"));
                grappinMeta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
                grappinMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                grappin.setItemMeta(grappinMeta);

                return grappin;



        }


    }
}
