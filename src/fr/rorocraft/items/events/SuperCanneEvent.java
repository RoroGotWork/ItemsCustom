package fr.rorocraft.items.events;

import fr.rorocraft.items.items.SuperCanne;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class SuperCanneEvent implements Listener{


    @EventHandler
    public void onFish(PlayerFishEvent e) {
        Player p = e.getPlayer();


        if(p.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(SuperCanne.getSuperCanne().getItemMeta().getDisplayName())) {

            if(e.getState() == PlayerFishEvent.State.CAUGHT_ENTITY) {
                Entity target = e.getCaught();

                Location pLoc = p.getLocation();

                Location hLoc = e.getHook().getLocation();

                Location change = hLoc.subtract(pLoc);

                if(target.getLocation().distance(pLoc) >  15) {
                    target.setVelocity(change.toVector().multiply(-0.05));
                } else {
                    target.setVelocity(change.toVector().multiply(-0.3));
                }

                p.sendMessage("" + target.getLocation().distance(pLoc));
            }
        }
    }
}
