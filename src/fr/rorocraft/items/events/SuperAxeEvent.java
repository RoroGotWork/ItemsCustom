package fr.rorocraft.items.events;


import fr.rorocraft.items.utils.ItemsUtils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;


public class SuperAxeEvent implements Listener {


    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        Location blockLoc = block.getLocation();
        Player player = event.getPlayer();

        if(!(player.getInventory().getItemInMainHand().hasItemMeta() &&
            player.getInventory().getItemInMainHand().getItemMeta().hasDisplayName()
            && player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_GREEN + "Super Axe")))   {
            return;
        }

        for(int y = 0; y < 10 ; y ++){
            blockLoc.add(0, 1, 0);


            if(ItemsUtils.getBreakableBlockBySuperAxe().contains(blockLoc.getBlock().getType())){
                Material blockM = blockLoc.getBlock().getType();
                blockLoc.getBlock().setType(Material.AIR);
                blockLoc.getWorld().dropItem(blockLoc, new ItemStack(blockM));

            }

        }

    }
}
