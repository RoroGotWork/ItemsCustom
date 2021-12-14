package fr.rorocraft.items.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class GunEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Player p =e.getPlayer();

        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {

            if(p.getInventory().getItemInMainHand().getType() == Material.GOLD_HOE|| p.getInventory().getItemInOffHand().getType() == Material.GOLD_HOE){

                if(p.getInventory().contains(Material.SNOW_BALL, 1)) {

                    p.launchProjectile(Snowball.class);
                    p.getInventory().removeItem(new ItemStack(Material.SNOW_BALL, 1));
                }

            }
        }
    }


    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {

        if(e.getDamager() instanceof Snowball) {
            Snowball s = (Snowball) e.getDamager();

            if(s.getShooter() instanceof Player) {
                Player p = (Player) s.getShooter();

                if(p.getInventory().getItemInMainHand().getType() == Material.GOLD_HOE || p.getInventory().getItemInOffHand().getType() == Material.GOLD_HOE) {

                    e.setDamage(3.5);
                }
            }
        }



    }

}
