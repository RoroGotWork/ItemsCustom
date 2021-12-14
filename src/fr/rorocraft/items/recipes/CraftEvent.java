package fr.rorocraft.items.recipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

public class CraftEvent implements Listener {

    @EventHandler
    public void onMakeCraft(PrepareItemCraftEvent event){

        CraftingInventory inventory = event.getInventory();

        try {

            removeGoldCraft(event, inventory);
            addChainMailCraft(event, inventory);
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){ }

    }

    private  void addChainMailCraft(PrepareItemCraftEvent event, CraftingInventory inventory) {
        ItemStack[] items = inventory.getMatrix();

        if(items[0].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[2].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[3].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[4].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[5].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[6].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[7].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[8].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") ) {

            inventory.setResult(new ItemStack(Material.CHAINMAIL_CHESTPLATE));


        }else if(items[0].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[1].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[2].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[3].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[5].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[6].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[8].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +")){

            inventory.setResult(new ItemStack(Material.CHAINMAIL_LEGGINGS));


        } else if (items[0].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[1].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[2].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[3].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[5].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +")){


            inventory.setResult(new ItemStack(Material.CHAINMAIL_HELMET));


        } else if(items[3].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[5].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[6].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +") &&
                items[8].getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Emeraude +")){

            inventory.setResult(new ItemStack(Material.CHAINMAIL_BOOTS));
        }

    }

    private  void removeGoldCraft(PrepareItemCraftEvent event, CraftingInventory inventory) {
        ItemStack[] items = inventory.getMatrix();

        if(event.getRecipe().getResult().getType() ==  Material.GOLD_HELMET) {
            if(items[0].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_CHESTPLATE) {
            if(items[5].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_LEGGINGS) {
            if(items[0].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_BOOTS) {
            if(items[6].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_SWORD) {
            if(items[1].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_PICKAXE) {
            if(items[1].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_SPADE) {
            if(items[1].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        } else  if(event.getRecipe().getResult().getType() ==  Material.GOLD_HOE) {
            if(items[1].getType() == Material.GOLD_INGOT) {
                inventory.setResult(new ItemStack(Material.AIR));
            }
        }
    }
}
