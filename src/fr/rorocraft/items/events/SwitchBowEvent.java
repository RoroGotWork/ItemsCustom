package fr.rorocraft.items.events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SwitchBowEvent implements Listener {


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event){
        Entity victim = event.getEntity();

        if(event.getDamager() instanceof Arrow){
            Arrow arrow = (Arrow) event.getDamager();

            if(arrow.getShooter() instanceof Player){
                Player player  = (Player) arrow.getShooter();

                if(player.getInventory().getItemInMainHand().hasItemMeta() &&
                   player.getInventory().getItemInMainHand().getType() == Material.BOW &&
                   player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName() &&
                   player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Switch bow"))  {


                    Location playerLoc = player.getLocation();

                    player.teleport(victim.getLocation());

                    victim.teleport(playerLoc);

                }

            }
        }
    }

}
