package fr.rorocraft.items.events;

import com.codingforcookies.armorequip.ArmorEquipEvent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ArmorFarmEvent implements Listener {

    @EventHandler
    public void  onEquipFarmArmor(ArmorEquipEvent event){
        Player player = event.getPlayer();
        ItemStack item = event.getNewArmorPiece();

        if(!item.hasItemMeta()) return;
        if(!item.getItemMeta().hasDisplayName()) return;

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_HELMET){

            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 60 * 60, 2));
        }

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_CHESTPLATE){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * 60 * 60 , 2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 60 * 60, 2));
        }
        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_LEGGINGS){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 60 * 60, 3));
        }

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_BOOTS){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 60 * 60, 1));
        }



    }

    @EventHandler
    public void onDesequipFarmArmor(ArmorEquipEvent event){

        Player player = event.getPlayer();
        ItemStack item = event.getOldArmorPiece();

        if(!item.hasItemMeta()) return;
        if(!item.getItemMeta().hasDisplayName()) return;

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_HELMET){

            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        }

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_CHESTPLATE){
            player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            player.removePotionEffect(PotionEffectType.SATURATION);
        }
        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_LEGGINGS){
            player.removePotionEffect(PotionEffectType.FAST_DIGGING);
        }

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_BOOTS){
            player.removePotionEffect(PotionEffectType.SPEED);
        }


    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getHelmet();


        if(!item.hasItemMeta()) return;
        if(!item.getItemMeta().hasDisplayName()) return;

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_HELMET){

            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * 60 * 60, 2));
        }

        item = player.getInventory().getChestplate();

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_CHESTPLATE){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * 60 * 60 , 2));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * 60 * 60, 2));
        }

        item = player.getInventory().getLeggings();
        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_LEGGINGS){
            player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * 60 * 60, 2));
        }

        item = player.getInventory().getBoots();

        if(item.getItemMeta().getDisplayName().equals("" + ChatColor.DARK_GREEN + ChatColor.BOLD +  "Armure de farm")
                && item.getType() == Material.LEATHER_BOOTS){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * 60 * 60, 1));
        }

    }
}
