package fr.rorocraft.items.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Hammer {

    public static ItemStack getHammerByLevel(int level){
        switch (level){

            case 1:
                ItemStack hammer = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta hammerM = hammer.getItemMeta();
                hammerM.setDisplayName("§6Hammer §e3x3");
                hammerM.addEnchant(Enchantment.DIG_SPEED, 4, true);
                hammer.setItemMeta(hammerM);

                return hammer;

            case 2:
                ItemStack hammer2 = new ItemStack(Material.DIAMOND_PICKAXE);
                ItemMeta hammerM2 = hammer2.getItemMeta();
                hammerM2.setDisplayName("§6Hammer §e5x5");
                hammerM2.addEnchant(Enchantment.DIG_SPEED, 4, true);
                hammer2.setItemMeta(hammerM2);

                return hammer2;

        }
        return null;
    }
}
