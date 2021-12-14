package fr.rorocraft.items.utils;

import org.bukkit.Material;

import java.util.Arrays;
import java.util.List;

public class ItemsUtils {


    public static List<Material> getBreakableBlockBySuperAxe(){
        Material[] list = new Material[]{
            Material.WOOD,
            Material.LOG,
            Material.LOG_2,
            Material.LEAVES,
            Material.LEAVES_2
        };

        return Arrays.asList(list);
    }
}
