package fr.rorocraft.items;

import fr.rorocraft.items.commands.IGiveCommand;
import fr.rorocraft.items.events.*;
import fr.rorocraft.items.recipes.CraftEvent;
import fr.rorocraft.items.recipes.Recipes;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class ItemsCustom extends JavaPlugin {

    private List<Player> playersGrappleLevel1 = new ArrayList<>();

    private List<Player> playersGrappleLevel2 = new ArrayList<>();

    private List<Player> playersGrappleLevel3 = new ArrayList<>();


    @Override
    public void onEnable() {
        System.out.println("[ItemsCustom] Le plugin est pret");


        this.getServer().getPluginManager().registerEvents(new GrappinEvent(this), this);
        this.getServer().getPluginManager().registerEvents(new GunEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SuperCanneEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SwitchBowEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SuperAxeEvent(), this);
        this.getServer().getPluginManager().registerEvents(new ArmorFarmEvent(), this);

        this.getServer().getPluginManager().registerEvents(new CraftEvent(), this);

        this.getCommand("igive").setExecutor(new IGiveCommand());

        Recipes.setupRecipes(this);

        super.onEnable();
    }



    public List<Player> getPlayersGrappleLevel1() {
        return playersGrappleLevel1;
    }


    public List<Player> getPlayersGrappleLevel2() {
        return playersGrappleLevel2;
    }


    public List<Player> getPlayersGrappleLevel3() {
        return playersGrappleLevel3;
    }
}
