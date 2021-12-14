package fr.rorocraft.items.commands;

import fr.rorocraft.items.items.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class IGiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(args.length == 0){
            return true;
        }

        if(sender instanceof Player){
            Player player = (Player) sender;

            switch (args[0]){

                case "grappin":


                    try {

                        int level = Integer.parseInt(args[1]);


                        player.getInventory().addItem(Grappin.getGrappinBylevel(level));

 
                    } catch (Exception exception){

                        player.sendMessage(ChatColor.RED + "Erreur dans la commande");
                    }
                    break;

                case "supercanne":
                    player.getInventory().addItem(SuperCanne.getSuperCanne());
                    break;

                case "gun":
                    player.getInventory().addItem(Gun.getGun());
                    player.getInventory().addItem(new ItemStack(Material.SNOW_BALL, 64));
                    break;

                case "switchbow":
                    player.getInventory().addItem(SwitchBow.getSwitchBow());
                    break;

                case "superaxe":
                    player.getInventory().addItem(SuperAxe.getSuperAxe());
                break;

                case "hammer":


                    try {

                        int level = Integer.parseInt(args[1]);


                        player.getInventory().addItem(Hammer.getHammerByLevel(level));


                    } catch (Exception exception){

                        player.sendMessage(ChatColor.RED + "Erreur dans la commande");
                    }
                    break;

                case "emeraldplus":
                    player.getInventory().addItem(EmeraldPlus.getEmeraldPlus());
                    break;

                case "helmetfarm":
                    player.getInventory().addItem(ArmorFarm.getHelmet());
                    break;

                case "chestplatefarm":
                    player.getInventory().addItem(ArmorFarm.getChestPlate());
                    break;

                case "leggingsfarm":
                    player.getInventory().addItem(ArmorFarm.getLeggings());
                    break;

                case "bootsfarm":
                    player.getInventory().addItem(ArmorFarm.getBoots());
                    break;

                case "armorfarm":
                    player.getInventory().addItem(ArmorFarm.getHelmet());
                    player.getInventory().addItem(ArmorFarm.getChestPlate());
                    player.getInventory().addItem(ArmorFarm.getLeggings());
                    player.getInventory().addItem(ArmorFarm.getBoots());
                    break;

            }


        } else {

            Player target = null;



            switch (args[0]){

                case "grappin":

                    if(args.length < 3){
                        System.out.println("Vous devez faire /igive grappin [niveau] [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[2]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    try {

                        int level = Integer.parseInt(args[1]);


                        target.getInventory().addItem(Grappin.getGrappinBylevel(level));


                    } catch (Exception exception){

                       System.out.println(ChatColor.RED + "Erreur dans la commande");
                    }

                    break;

                case "supercanne":


                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive supercanne  [joueur]");
                        return true;
                    }
                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(SuperCanne.getSuperCanne());

                    System.out.println("Le joueur a reçu  l'item");
                    break;

                case "gun":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive gun [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(Gun.getGun());
                    System.out.println("Le joueur a reçu  l'item");

                    break;


                case "switchbow":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive switchbow [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(SwitchBow.getSwitchBow());
                    System.out.println("Le joueur a reçu  l'item");

                    break;

                case "superaxe":
                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive superaxe [joueur]");
                        return true;
                    }


                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(SuperAxe.getSuperAxe());
                    System.out.println("Le joueur a reçu  l'item");

                    break;

                case "hammer":

                    if(args.length < 3){
                        System.out.println("Vous devez faire /igive hammer [niveau] [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[2]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    try {

                        int level = Integer.parseInt(args[1]);


                        target.getInventory().addItem(Hammer.getHammerByLevel(level));
                        System.out.println("Le joueur a reçu  l'item");


                    } catch (Exception exception){

                        System.out.println(ChatColor.RED + "Erreur dans la commande");
                    }

                    break;


                case "emeraldplus":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive emeraldplus [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(EmeraldPlus.getEmeraldPlus());
                    System.out.println("Le joueur a reçu  l'item");

                    break;

                case "bootsfarm":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive bootsfarm [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(ArmorFarm.getBoots());
                    System.out.println("Le joueur a reçu  l'item");


                    break;


                case "leggingsfarm":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive bootsfarm [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(ArmorFarm.getLeggings());
                    System.out.println("Le joueur a reçu  l'item");


                    break;

                case "chestplatefarm":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive bootsfarm [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(ArmorFarm.getChestPlate());
                    System.out.println("Le joueur a reçu  l'item");


                    break;

                case "helmetfarm":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive bootsfarm [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(ArmorFarm.getHelmet());
                    System.out.println("Le joueur a reçu  l'item");


                    break;

                case "armorfarm":

                    if(args.length < 2){
                        System.out.println("Vous devez faire /igive bootsfarm [joueur]");
                        return true;
                    }

                    target = Bukkit.getPlayer(args[1]);

                    if(target == null){
                        System.out.println("Le joueur n'existe pas");
                        return true;
                    }

                    target.getInventory().addItem(ArmorFarm.getHelmet());
                    target.getInventory().addItem(ArmorFarm.getChestPlate());
                    target.getInventory().addItem(ArmorFarm.getLeggings());
                    target.getInventory().addItem(ArmorFarm.getBoots());

                    System.out.println("Le joueur a reçu  les items");

                    break;

            }

        }
        return false;
    }
}
