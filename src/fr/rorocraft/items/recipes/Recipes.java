package fr.rorocraft.items.recipes;

import fr.rorocraft.items.ItemsCustom;
import fr.rorocraft.items.items.EmeraldPlus;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Iterator;

public class Recipes {

    public static   void setupRecipes(ItemsCustom  plugin){
        makeEmeraldPlus(plugin);
        makeNotchApple(plugin);
        removeRecipes(plugin);
    }

    private static void removeRecipes(ItemsCustom plugin) {
        Iterator<Recipe> iterator = plugin.getServer().recipeIterator();

        Recipe recipe;
        while (iterator.hasNext()){
            recipe = iterator.next();



        }

    }

    private static void makeEmeraldPlus(ItemsCustom plugin){
        NamespacedKey emeraldKey = new NamespacedKey(plugin, "emerald_plus");
        ShapedRecipe emeraldPlus = new ShapedRecipe(emeraldKey ,EmeraldPlus.getEmeraldPlus());

        emeraldPlus.shape("BBB", "BEB", "BBB");

        emeraldPlus.setIngredient('B', Material.EMERALD_BLOCK);
        emeraldPlus.setIngredient('E', Material.EMERALD);

        plugin.getServer().addRecipe(emeraldPlus);



    }

    private static void makeNotchApple(ItemsCustom plugin){
        NamespacedKey notchKey = new NamespacedKey(plugin, "notch_apple");
        ShapedRecipe notchApple = new ShapedRecipe(notchKey, new ItemStack(Material.GOLDEN_APPLE,1, (byte) 1));

        notchApple.shape("BBB", "BAB", "BBB");

        notchApple.setIngredient('B', Material.GOLD_BLOCK);
        notchApple.setIngredient('A', Material.GOLDEN_APPLE);

        plugin.getServer().addRecipe(notchApple);
    }


}
