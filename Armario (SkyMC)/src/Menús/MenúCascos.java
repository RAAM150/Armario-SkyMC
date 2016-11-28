package Menús;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class MenúCascos
  implements Listener
{
  public static Inventory Colores = Bukkit.createInventory(null, 45, "§6» §a§lSelecciona un color.");

  public static void open(Player player)
  {
	    ItemStack lh = new ItemStack(Material.LEATHER_HELMET, 1);

	    ItemStack whiteh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta whitehmeta = (LeatherArmorMeta)whiteh.getItemMeta();
	    whitehmeta.setColor(Color.WHITE);
	    whiteh.setItemMeta(whitehmeta);
	    
	    ItemStack orangeh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta orangehmeta = (LeatherArmorMeta)orangeh.getItemMeta();
	    orangehmeta.setColor(Color.ORANGE);
	    orangeh.setItemMeta(orangehmeta);
	    
	    ItemStack magentah = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta magentahmeta = (LeatherArmorMeta)magentah.getItemMeta();
	    magentahmeta.setColor(Color.fromBGR(216, 76, 178));
	    magentah.setItemMeta(magentahmeta);

	    ItemStack lightblueh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta lightbluehmeta = (LeatherArmorMeta)lightblueh.getItemMeta();
	    lightbluehmeta.setColor(Color.fromBGR(216, 153, 102));
	    lightblueh.setItemMeta(lightbluehmeta);

	    ItemStack yellowh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta yellowhmeta = (LeatherArmorMeta)yellowh.getItemMeta();
	    yellowhmeta.setColor(Color.YELLOW);
	    yellowh.setItemMeta(yellowhmeta);

	    ItemStack limeh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta limehmeta = (LeatherArmorMeta)limeh.getItemMeta();
	    limehmeta.setColor(Color.LIME);
	    limeh.setItemMeta(limehmeta);

	    ItemStack pinkh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta pinkhmeta = (LeatherArmorMeta)pinkh.getItemMeta();
	    pinkhmeta.setColor(Color.fromBGR(165, 127, 242));
	    pinkh.setItemMeta(pinkhmeta);

	    ItemStack grayh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta grayhmeta = (LeatherArmorMeta)grayh.getItemMeta();
	    grayhmeta.setColor(Color.GRAY);
	    grayh.setItemMeta(grayhmeta);

	    ItemStack silverh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta silverhmeta = (LeatherArmorMeta)silverh.getItemMeta();
	    silverhmeta.setColor(Color.SILVER);
	    silverh.setItemMeta(silverhmeta);

	    ItemStack cyanh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta cyanhmeta = (LeatherArmorMeta)cyanh.getItemMeta();
	    cyanhmeta.setColor(Color.fromBGR(153, 127, 76));
	    cyanh.setItemMeta(cyanhmeta);

	    ItemStack purpleh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta purplehmeta = (LeatherArmorMeta)purpleh.getItemMeta();
	    purplehmeta.setColor(Color.PURPLE);
	    purpleh.setItemMeta(purplehmeta);

	    ItemStack blueh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta bluehmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluehmeta.setColor(Color.BLUE);
	    blueh.setItemMeta(bluehmeta);

	    ItemStack bluedarkh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta bluedarkhmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluedarkhmeta.setColor(Color.fromBGR(200, 100, 60));
	    bluedarkh.setItemMeta(bluedarkhmeta);

	    ItemStack brownh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta brownhmeta = (LeatherArmorMeta)brownh.getItemMeta();
	    brownhmeta.setColor(Color.fromBGR(51, 76, 102));
	    brownh.setItemMeta(brownhmeta);

	    ItemStack greenh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta greenhmeta = (LeatherArmorMeta)greenh.getItemMeta();
	    greenhmeta.setColor(Color.GREEN);
	    greenh.setItemMeta(greenhmeta);

	    ItemStack redh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta redhmeta = (LeatherArmorMeta)redh.getItemMeta();
	    redhmeta.setColor(Color.RED);
	    redh.setItemMeta(redhmeta);

	    ItemStack blackh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta blackhmeta = (LeatherArmorMeta)blackh.getItemMeta();
	    blackhmeta.setColor(Color.BLACK);
	    blackh.setItemMeta(blackhmeta);
	    
	    ItemStack MenúAtras = new ItemStack(Material.ARROW);
	    ItemMeta MenúAtrasMeta = MenúAtras.getItemMeta();
	    MenúAtrasMeta.setDisplayName("§cCancelar.");
	    MenúAtras.setItemMeta(MenúAtrasMeta);
	    
	    
	    Colores.setItem(10, redh);
	    Colores.setItem(11, orangeh);
	    Colores.setItem(12, yellowh);
	    Colores.setItem(13, limeh);
	    Colores.setItem(14, greenh);
	    Colores.setItem(15, magentah);
	    Colores.setItem(16, purpleh);
	    
	    
	    Colores.setItem(19, cyanh);
	    Colores.setItem(20, lightblueh);
	    Colores.setItem(21, bluedarkh);
	    Colores.setItem(22, blueh);
	    Colores.setItem(23, whiteh);
	    Colores.setItem(24, silverh);
	    Colores.setItem(25, grayh);
	    
	    Colores.setItem(30, blackh);
	    Colores.setItem(31, lh);
	    Colores.setItem(32, brownh);
	    
	    Colores.setItem(40, MenúAtras);
	    
    player.openInventory(Colores);
  

      
  }
  
  @EventHandler
  public void onInventoryClick(InventoryClickEvent event) { Player player = (Player)event.getWhoClicked();
    ItemStack clicked = event.getCurrentItem();
    Inventory inventory = event.getInventory();
    if (inventory.getName().equals(Colores.getName())) {
      event.setCancelled(true);
      
	    ItemStack lh = new ItemStack(Material.LEATHER_HELMET, 1);

	    ItemStack whiteh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta whitehmeta = (LeatherArmorMeta)whiteh.getItemMeta();
	    whitehmeta.setColor(Color.WHITE);
	    whiteh.setItemMeta(whitehmeta);
	    
	    ItemStack orangeh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta orangehmeta = (LeatherArmorMeta)orangeh.getItemMeta();
	    orangehmeta.setColor(Color.ORANGE);
	    orangeh.setItemMeta(orangehmeta);
	    
	    ItemStack magentah = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta magentahmeta = (LeatherArmorMeta)magentah.getItemMeta();
	    magentahmeta.setColor(Color.fromBGR(216, 76, 178));
	    magentah.setItemMeta(magentahmeta);

	    ItemStack lightblueh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta lightbluehmeta = (LeatherArmorMeta)lightblueh.getItemMeta();
	    lightbluehmeta.setColor(Color.fromBGR(216, 153, 102));
	    lightblueh.setItemMeta(lightbluehmeta);

	    ItemStack yellowh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta yellowhmeta = (LeatherArmorMeta)yellowh.getItemMeta();
	    yellowhmeta.setColor(Color.YELLOW);
	    yellowh.setItemMeta(yellowhmeta);

	    ItemStack limeh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta limehmeta = (LeatherArmorMeta)limeh.getItemMeta();
	    limehmeta.setColor(Color.LIME);
	    limeh.setItemMeta(limehmeta);

	    ItemStack pinkh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta pinkhmeta = (LeatherArmorMeta)pinkh.getItemMeta();
	    pinkhmeta.setColor(Color.fromBGR(165, 127, 242));
	    pinkh.setItemMeta(pinkhmeta);

	    ItemStack grayh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta grayhmeta = (LeatherArmorMeta)grayh.getItemMeta();
	    grayhmeta.setColor(Color.GRAY);
	    grayh.setItemMeta(grayhmeta);

	    ItemStack silverh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta silverhmeta = (LeatherArmorMeta)silverh.getItemMeta();
	    silverhmeta.setColor(Color.SILVER);
	    silverh.setItemMeta(silverhmeta);

	    ItemStack cyanh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta cyanhmeta = (LeatherArmorMeta)cyanh.getItemMeta();
	    cyanhmeta.setColor(Color.fromBGR(153, 127, 76));
	    cyanh.setItemMeta(cyanhmeta);

	    ItemStack purpleh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta purplehmeta = (LeatherArmorMeta)purpleh.getItemMeta();
	    purplehmeta.setColor(Color.PURPLE);
	    purpleh.setItemMeta(purplehmeta);

	    ItemStack blueh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta bluehmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluehmeta.setColor(Color.BLUE);
	    blueh.setItemMeta(bluehmeta);

	    ItemStack bluedarkh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta bluedarkhmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluedarkhmeta.setColor(Color.fromBGR(200, 100, 60));
	    bluedarkh.setItemMeta(bluedarkhmeta);

	    ItemStack brownh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta brownhmeta = (LeatherArmorMeta)brownh.getItemMeta();
	    brownhmeta.setColor(Color.fromBGR(51, 76, 102));
	    brownh.setItemMeta(brownhmeta);

	    ItemStack greenh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta greenhmeta = (LeatherArmorMeta)greenh.getItemMeta();
	    greenhmeta.setColor(Color.GREEN);
	    greenh.setItemMeta(greenhmeta);

	    ItemStack redh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta redhmeta = (LeatherArmorMeta)redh.getItemMeta();
	    redhmeta.setColor(Color.RED);
	    redh.setItemMeta(redhmeta);

	    ItemStack blackh = new ItemStack(Material.LEATHER_HELMET, 1);
	    LeatherArmorMeta blackhmeta = (LeatherArmorMeta)blackh.getItemMeta();
	    blackhmeta.setColor(Color.BLACK);
	    blackh.setItemMeta(blackhmeta);
        
      if ((event.getSlot() == 10) && 
    	        (clicked.getType() == Material.LEATHER_HELMET)) {
        if (player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
          player.getInventory().setHelmet(redh);
          MenúArmario.open(player);
        }
        else if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage("§c¡Tú no tienes permisos!");
        }
      }
      
    if ((event.getSlot() == 11) && 
  	        (clicked.getType() == Material.LEATHER_HELMET)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
        player.getInventory().setHelmet(orangeh);
        MenúArmario.open(player);
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage("§c¡Tú no tienes permisos!");
      }
    }
    
  if ((event.getSlot() == 12) && 
	        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
      event.setCancelled(true);
      player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
      player.getInventory().setHelmet(yellowh);
      MenúArmario.open(player);
    }
    else if (!player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.sendMessage("§c¡Tú no tienes permisos!");
    }
  }
  
if ((event.getSlot() == 13) && 
	        (clicked.getType() == Material.LEATHER_HELMET)) {
  if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
    player.getInventory().setHelmet(limeh);
    MenúArmario.open(player);
  }
  else if (!player.hasPermission("skymc.armario.usar")) {
      event.setCancelled(true);
      player.sendMessage("§c¡Tú no tienes permisos!");
  }
}

if ((event.getSlot() == 14) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(greenh);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 15) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(magentah);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 16) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(purpleh);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 19) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(cyanh);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 20) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(lightblueh);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 21) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(bluedarkh);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 22) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(blueh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 23) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(whiteh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 24) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(silverh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 25) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(grayh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 30) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(blackh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 31) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(lh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 32) && 
        (clicked.getType() == Material.LEATHER_HELMET)) {
    if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setHelmet(brownh);
  MenúArmario.open(player);
}
else         if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

      if ((event.getSlot() == 40) && 
  	        (clicked.getType() == Material.ARROW)) {
          if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.NOTE_PLING, 1, 1);
        MenúArmario.open(player);
      }
      else         if (player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage("§c¡Tú no tienes permisos!");
      }
    }
      
      
    }
  }
}