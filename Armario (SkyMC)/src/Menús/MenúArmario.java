package Menús;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import ArchivosDeConfiguración.Configuración;

public class MenúArmario
  implements Listener
{
  public static Inventory Armario = Bukkit.createInventory(null, 36, "§b§lMenú §8» §6Armario§8.");

  public static void open(Player player)
  {
	  
	    
	    ItemStack BorrarCasco = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    ItemMeta BorrarCascoMeta = BorrarCasco.getItemMeta();
	    BorrarCascoMeta.setDisplayName("§7► §cRemueve tu §eCasco§c.");
	    BorrarCasco.setItemMeta(BorrarCascoMeta);
	    
	    ItemStack BorrarPeto = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    ItemMeta BorrarPetoMeta = BorrarPeto.getItemMeta();
	    BorrarPetoMeta.setDisplayName("§7► §cRemueve tu §ePeto§c.");
	    BorrarPeto.setItemMeta(BorrarPetoMeta);
	    
	    ItemStack BorrarPantalón = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    ItemMeta BorrarPantalónMeta = BorrarPantalón.getItemMeta();
	    BorrarPantalónMeta.setDisplayName("§7► §cRemueve tu §ePantalón§c.");
	    BorrarPantalón.setItemMeta(BorrarPantalónMeta);
	    
	    ItemStack BorrarBotas = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    ItemMeta BorrarBotasMeta = BorrarBotas.getItemMeta();
	    BorrarBotasMeta.setDisplayName("§7► §cRemueve tus §eBotas§c.");
	    BorrarBotas.setItemMeta(BorrarBotasMeta);
	    
	    ItemStack EncantarCasco = new ItemStack(Material.ENCHANTMENT_TABLE);
	    ItemMeta EncantarCascoMeta = BorrarCasco.getItemMeta();
	    EncantarCascoMeta.setDisplayName("§7► §aEncanta tu §6Casco§a.");
	    EncantarCasco.setItemMeta(EncantarCascoMeta);
	    
	    ItemStack EncantarPeto = new ItemStack(Material.ENCHANTMENT_TABLE);
	    ItemMeta EncantarPetoMeta = EncantarPeto.getItemMeta();
	    EncantarPetoMeta.setDisplayName("§7► §aEncanta tu §6Peto§a.");
	    EncantarPeto.setItemMeta(EncantarPetoMeta);
	    
	    ItemStack EncantarPantalón = new ItemStack(Material.ENCHANTMENT_TABLE);
	    ItemMeta EncantarPantalónMeta = EncantarPantalón.getItemMeta();
	    EncantarPantalónMeta.setDisplayName("§7► §aEncanta tu §6Pantalón§a.");
	    EncantarPantalón.setItemMeta(EncantarPantalónMeta);
	    
	    ItemStack EncantarBotas = new ItemStack(Material.ENCHANTMENT_TABLE);
	    ItemMeta EncantarBotasMeta = EncantarBotas.getItemMeta();
	    EncantarBotasMeta.setDisplayName("§7► §aEncanta tus §6Botas§a.");
	    EncantarBotas.setItemMeta(EncantarBotasMeta);

	    ItemStack PetoCuero = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
	    ItemStack PetoMalla = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
	    ItemStack PetoHierro = new ItemStack(Material.IRON_CHESTPLATE, 1);
	    ItemStack PetoOro = new ItemStack(Material.GOLD_CHESTPLATE, 1);
	    ItemStack PetoDiamante = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);

	    ItemStack PantalónCuero = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    ItemStack PantalónMalla = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
	    ItemStack PantalónHierro = new ItemStack(Material.IRON_LEGGINGS, 1);
	    ItemStack PantalónOro = new ItemStack(Material.GOLD_LEGGINGS, 1);
	    ItemStack PantalónDiamante = new ItemStack(Material.DIAMOND_LEGGINGS, 1);

	    ItemStack BotasCuero = new ItemStack(Material.LEATHER_BOOTS, 1);
	    ItemStack BotasMalla = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
	    ItemStack BotasHierro = new ItemStack(Material.IRON_BOOTS, 1);
	    ItemStack BotasOro = new ItemStack(Material.GOLD_BOOTS, 1);
	    ItemStack BotasDiamante = new ItemStack(Material.DIAMOND_BOOTS, 1);
	    
	    ItemStack MenúAtras = new ItemStack(Material.ARROW);
	    ItemMeta MenúAtrasMeta = MenúAtras.getItemMeta();
	    MenúAtrasMeta.setDisplayName("§aCierra el menú.");
	    MenúAtras.setItemMeta(MenúAtrasMeta);
	    
	    ItemStack BorrarAll = new ItemStack(Material.REDSTONE_BLOCK);
	    ItemMeta BorrarAllMeta = BorrarAll.getItemMeta();
	    BorrarAllMeta.setDisplayName("§4§l» §c§lRemueve toda tu armadura.");
	    BorrarAll.setItemMeta(BorrarAllMeta);
	    
	    ItemStack MenúAdelante = new ItemStack(Material.ARROW);
	    ItemMeta MenúAdelanteMeta = MenúAdelante.getItemMeta();
	    MenúAdelanteMeta.setDisplayName("§cSiguiente Página.");
	    MenúAdelante.setItemMeta(MenúAdelanteMeta);
	    
	    
	    
	    
	    Armario.setItem(0, BorrarPeto);
	    Armario.setItem(2, PetoCuero);
	    Armario.setItem(3, PetoMalla);
	    Armario.setItem(4, PetoHierro);
	    Armario.setItem(5, PetoOro);
	    Armario.setItem(6, PetoDiamante);
	    Armario.setItem(8, EncantarPeto);
	    
	    
	    Armario.setItem(9, BorrarPantalón);
	    Armario.setItem(11, PantalónCuero);
	    Armario.setItem(12, PantalónMalla);
	    Armario.setItem(13, PantalónHierro);
	    Armario.setItem(14, PantalónOro);
	    Armario.setItem(15, PantalónDiamante);
	    Armario.setItem(17, EncantarPantalón);
	    
	    Armario.setItem(18, BorrarBotas);
	    Armario.setItem(20, BotasCuero);
	    Armario.setItem(21, BotasMalla);
	    Armario.setItem(22, BotasHierro);
	    Armario.setItem(23, BotasOro);
	    Armario.setItem(24, BotasDiamante);
	    Armario.setItem(26, EncantarBotas);

	    Armario.setItem(30, MenúAtras);
	    Armario.setItem(31, BorrarAll);
	    Armario.setItem(32, MenúAdelante);
	    
    player.openInventory(Armario);
  }
  
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) { Player player = (Player)event.getWhoClicked();
    ItemStack clicked = event.getCurrentItem();
    Inventory inventory = event.getInventory();
    if (inventory.getName().equals(Armario.getName())) {
      event.setCancelled(true);
      
 
      
      
      if ((event.getSlot() == 0) && 
  	        (clicked.getType() == Material.STAINED_GLASS_PANE)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.getInventory().setChestplate(null);
        player.playSound(player.getLocation(), Sound.ITEM_BREAK, 1, 1);
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }
      
      if ((event.getSlot() == 9) && 
  	        (clicked.getType() == Material.STAINED_GLASS_PANE)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.getInventory().setLeggings(null);
        player.playSound(player.getLocation(), Sound.ITEM_BREAK, 1, 1);
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }
      
      if ((event.getSlot() == 18) && 
  	        (clicked.getType() == Material.STAINED_GLASS_PANE)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.getInventory().setBoots(null);
        player.playSound(player.getLocation(), Sound.ITEM_BREAK, 1, 1);
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }
     

      
      if ((event.getSlot() == 8) && 
  	        (clicked.getType() == Material.ENCHANTMENT_TABLE)) {
      if (player.hasPermission("skymc.armario.encantar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.LEVEL_UP, 1, 1);
        player.getInventory().getChestplate().addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 10);
      }
      else if (!player.hasPermission("skymc.armario.encantar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }
      
      
      if ((event.getSlot() == 17) && 
  	        (clicked.getType() == Material.ENCHANTMENT_TABLE)) {
      if (player.hasPermission("skymc.armario.encantar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.LEVEL_UP, 1, 1);
        player.getInventory().getLeggings().addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 10);
      }
      else if (!player.hasPermission("skymc.armario.encantar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }
      
      if ((event.getSlot() == 26) && 
  	        (clicked.getType() == Material.ENCHANTMENT_TABLE)) {
      if (player.hasPermission("skymc.armario.encantar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.LEVEL_UP, 1, 1);
        player.getInventory().getBoots().addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 10);
      }
      else if (!player.hasPermission("skymc.armario.encantar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
    }

      

      
      if (clicked.getType() == Material.LEATHER_CHESTPLATE) {
        if (player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
          MenúPetos.open(player);
        }
        else if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");

        }
      }
      
      if (clicked.getType() == Material.LEATHER_LEGGINGS) {
          if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
            MenúPantalones.open(player);
          }
          else if (!player.hasPermission("skymc.armario.usar")) {
              event.setCancelled(true);
              player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");

          }
        }
      

      
      if (clicked.getType() == Material.LEATHER_BOOTS) {
          if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
            MenúBotas.open(player);
          }
          else if (!player.hasPermission("skymc.armario.usar")) {
              event.setCancelled(true);
              player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");

          }
        }
        
      

        if (clicked.getType() == Material.CHAINMAIL_CHESTPLATE) {
          if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
            player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
          }
          if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
          }
        }
        if (clicked.getType() == Material.CHAINMAIL_LEGGINGS) {
          if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
            player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
          }
          if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
          }
        }
        if (clicked.getType() == Material.CHAINMAIL_BOOTS) {
          if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
          }
          if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
          }

        }
      
      

          if (clicked.getType() == Material.IRON_CHESTPLATE) {
              if (player.hasPermission("skymc.armario.usar")) {
              event.setCancelled(true);
              player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
              player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
            }
            if (!player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
            }
          }
          if (clicked.getType() == Material.IRON_LEGGINGS) {
              if (player.hasPermission("skymc.armario.usar")) {
              event.setCancelled(true);
              player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
              player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
            }
            if (!player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
            }
          }
          if (clicked.getType() == Material.IRON_BOOTS) {
              if (player.hasPermission("skymc.armario.usar")) {
              event.setCancelled(true);
              player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
              player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
            }
            if (!player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
            }

          }
          
   
            if (clicked.getType() == Material.GOLD_CHESTPLATE) {
              if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }
            }
            if (clicked.getType() == Material.GOLD_LEGGINGS) {
              if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }
            }
            if (clicked.getType() == Material.GOLD_BOOTS) {
              if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }

            }
          

            if (clicked.getType() == Material.DIAMOND_CHESTPLATE) {
                if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }
            }
            if (clicked.getType() == Material.DIAMOND_LEGGINGS) {
                if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }
            }
            if (clicked.getType() == Material.DIAMOND_BOOTS) {
                if (player.hasPermission("skymc.armario.usar")) {
                event.setCancelled(true);
                player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
              }
              if (!player.hasPermission("skymc.armario.usar")) {
                  event.setCancelled(true);
                  player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
              }

            }
          
        
      if ((event.getSlot() == 30) && 
    	        (clicked.getType() == Material.ARROW)) {
        if (player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
          player.closeInventory();
        }
        else if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
        }
      }
      
      if ((event.getSlot() == 32) && 
  	        (clicked.getType() == Material.ARROW)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.sendMessage(Configuración.PREFIJO_GENERAL + "§cPróximamente...");
        player.playSound(player.getLocation(), Sound.NOTE_BASS, 1, 1);
        player.closeInventory();
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage(Configuración.PREFIJO_GENERAL + "§c¡Tú no tienes permisos!");
      }
      }

      if (clicked.getType() == Material.REDSTONE_BLOCK) {
        if (player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.getInventory().setChestplate(null);
            player.getInventory().setLeggings(null);
            player.getInventory().setBoots(null);
            player.playSound(player.getLocation(), Sound.NOTE_SNARE_DRUM, 1, 1);
            player.sendMessage(Configuración.PREFIJO_GENERAL + "§cHas removido toda tu armadura.");
            player.closeInventory();
          }

        if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage("§c¡Tú no tienes permisos!");
        }
      }
              

            
            
          }
        }
  }

