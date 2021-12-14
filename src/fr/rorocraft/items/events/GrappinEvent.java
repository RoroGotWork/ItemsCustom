package fr.rorocraft.items.events;

import fr.rorocraft.items.ItemsCustom;
import fr.rorocraft.items.items.Grappin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class GrappinEvent implements Listener {


    private ItemsCustom main;


    public GrappinEvent(ItemsCustom main){
        this.main  = main;
    }

    @EventHandler
    public void onFish(PlayerFishEvent e) {
        Player  p  = e.getPlayer();

        ItemStack it = p.getInventory().getItemInMainHand();

        if(it.getItemMeta().getDisplayName().equals(Grappin.getGrappinBylevel(1).getItemMeta().getDisplayName())) {




            if( e.getState() == PlayerFishEvent.State.IN_GROUND) {
                if(main.getPlayersGrappleLevel1().contains(p)) {
                    p.sendMessage(ChatColor.RED + "Tu ne peux pas encore utiliser ce grappin");
                    return;
                }

                Location pLoc = p.getLocation();

                Location hLoc = e.getHook().getLocation();



                Location change = hLoc.subtract(pLoc);

                p.setVelocity(change.toVector().multiply(0.21));



                main.getPlayersGrappleLevel1().add(p);

                new BukkitRunnable() {

                    @Override
                    public void run() {
                        if(main.getPlayersGrappleLevel1().contains(p)) {
                            main.getPlayersGrappleLevel1().remove(p);
                        }

                    }
                }.runTaskLater(main, 20 * 10);



            }
        }  else  if(it.getItemMeta().getDisplayName().equals(Grappin.getGrappinBylevel(2).getItemMeta().getDisplayName())) {

            if( e.getState() == PlayerFishEvent.State.IN_GROUND || e.getState() == PlayerFishEvent.State.CAUGHT_ENTITY  ) {


                if(main.getPlayersGrappleLevel2().contains(p)) {
                    p.sendMessage(ChatColor.RED + "Tu ne peux pas encore utiliser ce grappin");
                    return;
                }

                Location pLoc = p.getLocation();

                Location hLoc = e.getHook().getLocation();

                Location change = hLoc.subtract(pLoc);

                p.setVelocity(change.toVector().multiply(0.25));


                main.getPlayersGrappleLevel2().add(p);


                new BukkitRunnable() {

                    @Override
                    public void run() {
                        if(main.getPlayersGrappleLevel2().contains(p)) {
                            main.getPlayersGrappleLevel2().remove(p);
                        }

                    }
                }.runTaskLater(main, 20 * 6);

            }
        }else if(it.getItemMeta().getDisplayName().equals(Grappin.getGrappinBylevel(3).getItemMeta().getDisplayName())) {

            if( e.getState() == PlayerFishEvent.State.IN_GROUND || e.getState() == PlayerFishEvent.State.CAUGHT_ENTITY  ) {

                if(main.getPlayersGrappleLevel3().contains(p)) {
                    main.getPlayersGrappleLevel3().remove(p);
                }

                Location pLoc = p.getLocation();

                Location hLoc = e.getHook().getLocation();

                Location change = hLoc.subtract(pLoc);

                p.setVelocity(change.toVector().multiply(0.25));


                main.getPlayersGrappleLevel3().add(p);


                new BukkitRunnable() {

                    @Override
                    public void run() {
                        if(main.getPlayersGrappleLevel3().contains(p)) {
                            main.getPlayersGrappleLevel3().remove(p);
                        }

                    }
                }.runTaskLater(main, 20 * 4);

            }
        }






    }






    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if(!(e.getEntity() instanceof Player)) {
            return;
        }
        Player p = (Player) e.getEntity();

        if(e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            if(main.getPlayersGrappleLevel3().contains(p)) {
                e.setCancelled(true);
                main.getPlayersGrappleLevel3().remove(p);
            }
        }

    }
}
