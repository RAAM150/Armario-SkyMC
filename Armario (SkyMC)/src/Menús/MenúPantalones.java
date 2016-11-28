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

public class MenúPantalones
  implements Listener
{
  public static Inventory Colores = Bukkit.createInventory(null, 45, "§6» §a§lSelecciona un color.");

  public static void open(Player player)
  {
	    ItemStack lh = new ItemStack(Material.LEATHER_LEGGINGS, 1);

	    ItemStack whiteh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta whitehmeta = (LeatherArmorMeta)whiteh.getItemMeta();
	    whitehmeta.setColor(Color.WHITE);
	    whiteh.setItemMeta(whitehmeta);
	    
	    ItemStack orangeh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta orangehmeta = (LeatherArmorMeta)orangeh.getItemMeta();
	    orangehmeta.setColor(Color.ORANGE);
	    orangeh.setItemMeta(orangehmeta);
	    
	    ItemStack magentah = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta magentahmeta = (LeatherArmorMeta)magentah.getItemMeta();
	    magentahmeta.setColor(Color.fromBGR(216, 76, 178));
	    magentah.setItemMeta(magentahmeta);

	    ItemStack lightblueh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta lightbluehmeta = (LeatherArmorMeta)lightblueh.getItemMeta();
	    lightbluehmeta.setColor(Color.fromBGR(216, 153, 102));
	    lightblueh.setItemMeta(lightbluehmeta);

	    ItemStack yellowh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta yellowhmeta = (LeatherArmorMeta)yellowh.getItemMeta();
	    yellowhmeta.setColor(Color.YELLOW);
	    yellowh.setItemMeta(yellowhmeta);

	    ItemStack limeh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta limehmeta = (LeatherArmorMeta)limeh.getItemMeta();
	    limehmeta.setColor(Color.LIME);
	    limeh.setItemMeta(limehmeta);

	    ItemStack pinkh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta pinkhmeta = (LeatherArmorMeta)pinkh.getItemMeta();
	    pinkhmeta.setColor(Color.fromBGR(165, 127, 242));
	    pinkh.setItemMeta(pinkhmeta);

	    ItemStack grayh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta grayhmeta = (LeatherArmorMeta)grayh.getItemMeta();
	    grayhmeta.setColor(Color.GRAY);
	    grayh.setItemMeta(grayhmeta);

	    ItemStack silverh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta silverhmeta = (LeatherArmorMeta)silverh.getItemMeta();
	    silverhmeta.setColor(Color.SILVER);
	    silverh.setItemMeta(silverhmeta);

	    ItemStack cyanh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta cyanhmeta = (LeatherArmorMeta)cyanh.getItemMeta();
	    cyanhmeta.setColor(Color.fromBGR(153, 127, 76));
	    cyanh.setItemMeta(cyanhmeta);

	    ItemStack purpleh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta purplehmeta = (LeatherArmorMeta)purpleh.getItemMeta();
	    purplehmeta.setColor(Color.PURPLE);
	    purpleh.setItemMeta(purplehmeta);

	    ItemStack blueh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta bluehmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluehmeta.setColor(Color.BLUE);
	    blueh.setItemMeta(bluehmeta);

	    ItemStack bluedarkh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta bluedarkhmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluedarkhmeta.setColor(Color.fromBGR(200, 100, 60));
	    bluedarkh.setItemMeta(bluedarkhmeta);

	    ItemStack brownh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta brownhmeta = (LeatherArmorMeta)brownh.getItemMeta();
	    brownhmeta.setColor(Color.fromBGR(51, 76, 102));
	    brownh.setItemMeta(brownhmeta);

	    ItemStack greenh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta greenhmeta = (LeatherArmorMeta)greenh.getItemMeta();
	    greenhmeta.setColor(Color.GREEN);
	    greenh.setItemMeta(greenhmeta);

	    ItemStack redh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta redhmeta = (LeatherArmorMeta)redh.getItemMeta();
	    redhmeta.setColor(Color.RED);
	    redh.setItemMeta(redhmeta);

	    ItemStack blackh = new ItemStack(Material.LEATHER_LEGGINGS, 1);
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
      
      ItemStack ll = new ItemStack(Material.LEATHER_LEGGINGS, 1);


      ItemStack whiteh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta whitehmeta = (LeatherArmorMeta)whiteh.getItemMeta();
      whitehmeta.setColor(Color.WHITE);
      whiteh.setItemMeta(whitehmeta);
      ItemStack whitecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta whitecpmeta = (LeatherArmorMeta)whitecp.getItemMeta();
      whitecpmeta.setColor(Color.TEAL);
      whitecp.setItemMeta(whitecpmeta);
      ItemStack whitel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta whitelmeta = (LeatherArmorMeta)whitel.getItemMeta();
      whitelmeta.setColor(Color.WHITE);
      whitel.setItemMeta(whitelmeta);
      ItemStack whiteb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta whitebmeta = (LeatherArmorMeta)whiteb.getItemMeta();
      whitebmeta.setColor(Color.WHITE);
      whiteb.setItemMeta(whitebmeta);

      ItemStack orangeh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta orangehmeta = (LeatherArmorMeta)orangeh.getItemMeta();
      orangehmeta.setColor(Color.ORANGE);
      orangeh.setItemMeta(orangehmeta);
      ItemStack orangecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta orangecpmeta = (LeatherArmorMeta)orangecp.getItemMeta();
      orangecpmeta.setColor(Color.ORANGE);
      orangecp.setItemMeta(orangecpmeta);
      ItemStack orangel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta orangelmeta = (LeatherArmorMeta)orangel.getItemMeta();
      orangelmeta.setColor(Color.ORANGE);
      orangel.setItemMeta(orangelmeta);
      ItemStack orangeb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta orangebmeta = (LeatherArmorMeta)orangeb.getItemMeta();
      orangebmeta.setColor(Color.ORANGE);
      orangeb.setItemMeta(orangebmeta);

      ItemStack magentah = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta magentahmeta = (LeatherArmorMeta)magentah.getItemMeta();
      magentahmeta.setColor(Color.fromBGR(216, 76, 178));
      magentah.setItemMeta(magentahmeta);
      ItemStack magentacp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta magentacpmeta = (LeatherArmorMeta)magentacp.getItemMeta();
      magentacpmeta.setColor(Color.fromBGR(216, 76, 178));
      magentacp.setItemMeta(magentacpmeta);
      ItemStack magental = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta magentalmeta = (LeatherArmorMeta)magental.getItemMeta();
      magentalmeta.setColor(Color.fromBGR(216, 76, 178));
      magental.setItemMeta(magentalmeta);
      ItemStack magentab = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta magentabmeta = (LeatherArmorMeta)magentab.getItemMeta();
      magentabmeta.setColor(Color.fromBGR(216, 76, 178));
      magentab.setItemMeta(magentabmeta);

      ItemStack lightblueh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta lightbluehmeta = (LeatherArmorMeta)lightblueh.getItemMeta();
      lightbluehmeta.setColor(Color.fromBGR(216, 153, 102));
      lightblueh.setItemMeta(lightbluehmeta);
      ItemStack lightbluecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta lightbluecpmeta = (LeatherArmorMeta)lightbluecp.getItemMeta();
      lightbluecpmeta.setColor(Color.fromBGR(216, 153, 102));
      lightbluecp.setItemMeta(lightbluecpmeta);
      ItemStack lightbluel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta lightbluelmeta = (LeatherArmorMeta)lightbluel.getItemMeta();
      lightbluelmeta.setColor(Color.fromBGR(216, 153, 102));
      lightbluel.setItemMeta(lightbluelmeta);
      ItemStack lightblueb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta lightbluebmeta = (LeatherArmorMeta)lightblueb.getItemMeta();
      lightbluebmeta.setColor(Color.fromBGR(216, 153, 102));
      lightblueb.setItemMeta(lightbluebmeta);

      ItemStack yellowh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta yellowhmeta = (LeatherArmorMeta)yellowh.getItemMeta();
      yellowhmeta.setColor(Color.YELLOW);
      yellowh.setItemMeta(yellowhmeta);
      ItemStack yellowcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta yellowcpmeta = (LeatherArmorMeta)yellowcp.getItemMeta();
      yellowcpmeta.setColor(Color.YELLOW);
      yellowcp.setItemMeta(yellowcpmeta);
      ItemStack yellowl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta yellowlmeta = (LeatherArmorMeta)yellowl.getItemMeta();
      yellowlmeta.setColor(Color.YELLOW);
      yellowl.setItemMeta(yellowlmeta);
      ItemStack yellowb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta yellowbmeta = (LeatherArmorMeta)yellowb.getItemMeta();
      yellowbmeta.setColor(Color.YELLOW);
      yellowb.setItemMeta(yellowbmeta);

      ItemStack limeh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta limehmeta = (LeatherArmorMeta)limeh.getItemMeta();
      limehmeta.setColor(Color.LIME);
      limeh.setItemMeta(limehmeta);
      ItemStack limecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta limecpmeta = (LeatherArmorMeta)limecp.getItemMeta();
      limecpmeta.setColor(Color.LIME);
      limecp.setItemMeta(limecpmeta);
      ItemStack limel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta limelmeta = (LeatherArmorMeta)limel.getItemMeta();
      limelmeta.setColor(Color.LIME);
      limel.setItemMeta(limelmeta);
      ItemStack limeb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta limebmeta = (LeatherArmorMeta)limeb.getItemMeta();
      limebmeta.setColor(Color.LIME);
      limeb.setItemMeta(limebmeta);

      ItemStack pinkh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta pinkhmeta = (LeatherArmorMeta)pinkh.getItemMeta();
      pinkhmeta.setColor(Color.fromBGR(165, 127, 242));
      pinkh.setItemMeta(pinkhmeta);
      ItemStack pinkcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta pinkcpmeta = (LeatherArmorMeta)pinkcp.getItemMeta();
      pinkcpmeta.setColor(Color.fromBGR(165, 127, 242));
      pinkcp.setItemMeta(pinkcpmeta);
      ItemStack pinkl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta pinklmeta = (LeatherArmorMeta)pinkl.getItemMeta();
      pinklmeta.setColor(Color.fromBGR(165, 127, 242));
      pinkl.setItemMeta(pinklmeta);
      ItemStack pinkb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta pinkbmeta = (LeatherArmorMeta)pinkb.getItemMeta();
      pinkbmeta.setColor(Color.fromBGR(165, 127, 242));
      pinkb.setItemMeta(pinkbmeta);

      ItemStack grayh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta grayhmeta = (LeatherArmorMeta)grayh.getItemMeta();
      grayhmeta.setColor(Color.GRAY);
      grayh.setItemMeta(grayhmeta);
      ItemStack graycp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta graycpmeta = (LeatherArmorMeta)graycp.getItemMeta();
      graycpmeta.setColor(Color.GRAY);
      graycp.setItemMeta(graycpmeta);
      ItemStack grayl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta graylmeta = (LeatherArmorMeta)grayl.getItemMeta();
      graylmeta.setColor(Color.GRAY);
      grayl.setItemMeta(graylmeta);
      ItemStack grayb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta graybmeta = (LeatherArmorMeta)grayb.getItemMeta();
      graybmeta.setColor(Color.GRAY);
      grayb.setItemMeta(graybmeta);

      ItemStack silverh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta silverhmeta = (LeatherArmorMeta)silverh.getItemMeta();
      silverhmeta.setColor(Color.SILVER);
      silverh.setItemMeta(silverhmeta);
      ItemStack silvercp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta silvercpmeta = (LeatherArmorMeta)silvercp.getItemMeta();
      silvercpmeta.setColor(Color.SILVER);
      silvercp.setItemMeta(silvercpmeta);
      ItemStack silverl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta silverlmeta = (LeatherArmorMeta)silverl.getItemMeta();
      silverlmeta.setColor(Color.SILVER);
      silverl.setItemMeta(silverlmeta);
      ItemStack silverb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta silverbmeta = (LeatherArmorMeta)silverb.getItemMeta();
      silverbmeta.setColor(Color.SILVER);
      silverb.setItemMeta(silverbmeta);

      ItemStack cyanh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta cyanhmeta = (LeatherArmorMeta)cyanh.getItemMeta();
      cyanhmeta.setColor(Color.fromBGR(153, 127, 76));
      cyanh.setItemMeta(cyanhmeta);
      ItemStack cyancp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta cyancpmeta = (LeatherArmorMeta)cyancp.getItemMeta();
      cyancpmeta.setColor(Color.fromBGR(153, 127, 76));
      cyancp.setItemMeta(cyancpmeta);
      ItemStack cyanl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta cyanlmeta = (LeatherArmorMeta)cyanl.getItemMeta();
      cyanlmeta.setColor(Color.fromBGR(153, 127, 76));
      cyanl.setItemMeta(cyanlmeta);
      ItemStack cyanb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta cyanbmeta = (LeatherArmorMeta)cyanb.getItemMeta();
      cyanbmeta.setColor(Color.fromBGR(153, 127, 76));
      cyanb.setItemMeta(cyanbmeta);

      ItemStack purpleh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta purplehmeta = (LeatherArmorMeta)purpleh.getItemMeta();
      purplehmeta.setColor(Color.PURPLE);
      purpleh.setItemMeta(purplehmeta);
      ItemStack purplecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta purplecpmeta = (LeatherArmorMeta)purplecp.getItemMeta();
      purplecpmeta.setColor(Color.PURPLE);
      purplecp.setItemMeta(purplecpmeta);
      ItemStack purplel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta purplelmeta = (LeatherArmorMeta)purplel.getItemMeta();
      purplelmeta.setColor(Color.PURPLE);
      purplel.setItemMeta(purplelmeta);
      ItemStack purpleb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta purplebmeta = (LeatherArmorMeta)purpleb.getItemMeta();
      purplebmeta.setColor(Color.PURPLE);
      purpleb.setItemMeta(purplebmeta);

      ItemStack blueh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta bluehmeta = (LeatherArmorMeta)blueh.getItemMeta();
      bluehmeta.setColor(Color.fromBGR(178, 76, 51));
      blueh.setItemMeta(bluehmeta);
      ItemStack bluecp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta bluecpmeta = (LeatherArmorMeta)bluecp.getItemMeta();
      bluecpmeta.setColor(Color.fromBGR(178, 76, 51));
      bluecp.setItemMeta(bluecpmeta);
      ItemStack bluel = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta bluelmeta = (LeatherArmorMeta)bluel.getItemMeta();
      bluelmeta.setColor(Color.BLUE);
      bluel.setItemMeta(bluelmeta);
      ItemStack blueb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta bluebmeta = (LeatherArmorMeta)blueb.getItemMeta();
      bluebmeta.setColor(Color.fromBGR(178, 76, 51));
      blueb.setItemMeta(bluebmeta);

      ItemStack brownh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta brownhmeta = (LeatherArmorMeta)brownh.getItemMeta();
      brownhmeta.setColor(Color.fromBGR(51, 76, 102));
      brownh.setItemMeta(brownhmeta);
      ItemStack browncp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta browncpmeta = (LeatherArmorMeta)browncp.getItemMeta();
      browncpmeta.setColor(Color.fromBGR(51, 76, 102));
      browncp.setItemMeta(browncpmeta);
      ItemStack brownl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta brownlmeta = (LeatherArmorMeta)brownl.getItemMeta();
      brownlmeta.setColor(Color.fromBGR(51, 76, 102));
      brownl.setItemMeta(brownlmeta);
      ItemStack brownb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta brownbmeta = (LeatherArmorMeta)brownb.getItemMeta();
      brownbmeta.setColor(Color.fromBGR(51, 76, 102));
      brownb.setItemMeta(brownbmeta);

      ItemStack greenh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta greenhmeta = (LeatherArmorMeta)greenh.getItemMeta();
      greenhmeta.setColor(Color.GREEN);
      greenh.setItemMeta(greenhmeta);
      ItemStack greencp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta greencpmeta = (LeatherArmorMeta)greencp.getItemMeta();
      greencpmeta.setColor(Color.GREEN);
      greencp.setItemMeta(greencpmeta);
      ItemStack greenl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta greenlmeta = (LeatherArmorMeta)greenl.getItemMeta();
      greenlmeta.setColor(Color.GREEN);
      greenl.setItemMeta(greenlmeta);
      ItemStack greenb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta greenbmeta = (LeatherArmorMeta)greenb.getItemMeta();
      greenbmeta.setColor(Color.GREEN);
      greenb.setItemMeta(greenbmeta);

      ItemStack redh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta redhmeta = (LeatherArmorMeta)redh.getItemMeta();
      redhmeta.setColor(Color.RED);
      redh.setItemMeta(redhmeta);
      ItemStack redcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta redcpmeta = (LeatherArmorMeta)redcp.getItemMeta();
      redcpmeta.setColor(Color.RED);
      redcp.setItemMeta(redcpmeta);
      ItemStack redl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta redlmeta = (LeatherArmorMeta)redl.getItemMeta();
      redlmeta.setColor(Color.RED);
      redl.setItemMeta(redlmeta);
      ItemStack redb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta redbmeta = (LeatherArmorMeta)redb.getItemMeta();
      redbmeta.setColor(Color.RED);
      redb.setItemMeta(redbmeta);

      ItemStack blackh = new ItemStack(Material.LEATHER_HELMET, 1);
      LeatherArmorMeta blackhmeta = (LeatherArmorMeta)blackh.getItemMeta();
      blackhmeta.setColor(Color.BLACK);
      blackh.setItemMeta(blackhmeta);
      ItemStack blackcp = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
      LeatherArmorMeta blackcpmeta = (LeatherArmorMeta)blackcp.getItemMeta();
      blackcpmeta.setColor(Color.BLACK);
      blackcp.setItemMeta(blackcpmeta);
      ItemStack blackl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
      LeatherArmorMeta blacklmeta = (LeatherArmorMeta)blackl.getItemMeta();
      blacklmeta.setColor(Color.BLACK);
      blackl.setItemMeta(blacklmeta);
      ItemStack blackb = new ItemStack(Material.LEATHER_BOOTS, 1);
      LeatherArmorMeta blackbmeta = (LeatherArmorMeta)blackb.getItemMeta();
      blackbmeta.setColor(Color.BLACK);
      blackb.setItemMeta(blackbmeta);
     

	    ItemStack bluedarkl = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	    LeatherArmorMeta bluedarklmeta = (LeatherArmorMeta)blueh.getItemMeta();
	    bluedarklmeta.setColor(Color.fromBGR(200, 100, 60));
	    bluedarkl.setItemMeta(bluedarklmeta);
        
      if ((event.getSlot() == 10) && 
    	        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
        if (player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
          player.getInventory().setLeggings(redl);
          MenúArmario.open(player);
        }
        else if (!player.hasPermission("skymc.armario.usar")) {
            event.setCancelled(true);
            player.sendMessage("§c¡Tú no tienes permisos!");
        }
      }
      
    if ((event.getSlot() == 11) && 
  	        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
      if (player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
        player.getInventory().setLeggings(orangel);
        MenúArmario.open(player);
      }
      else if (!player.hasPermission("skymc.armario.usar")) {
          event.setCancelled(true);
          player.sendMessage("§c¡Tú no tienes permisos!");
      }
    }
    
  if ((event.getSlot() == 12) && 
	        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
    if (player.hasPermission("skymc.armario.usar")) {
      event.setCancelled(true);
      player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
      player.getInventory().setLeggings(yellowl);
      MenúArmario.open(player);
    }
    else if (!player.hasPermission("skymc.armario.usar")) {
        event.setCancelled(true);
        player.sendMessage("§c¡Tú no tienes permisos!");
    }
  }
  
if ((event.getSlot() == 13) && 
	        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
  if (player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
    player.getInventory().setLeggings(limel);
    MenúArmario.open(player);
  }
  else if (!player.hasPermission("skymc.armario.usar")) {
      event.setCancelled(true);
      player.sendMessage("§c¡Tú no tienes permisos!");
  }
}

if ((event.getSlot() == 14) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(greenl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 15) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(magental);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 16) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(purplel);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 19) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(cyanl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 20) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(lightbluel);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 21) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(bluedarkl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 22) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(bluel);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 23) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(whitel);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 24) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(silverl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 25) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(grayl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 30) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(blackl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 31) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(ll);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
    event.setCancelled(true);
    player.sendMessage("§c¡Tú no tienes permisos!");
}
}

if ((event.getSlot() == 32) && 
        (clicked.getType() == Material.LEATHER_LEGGINGS)) {
if (player.hasPermission("skymc.armario.usar")) {
  event.setCancelled(true);
  player.playSound(player.getLocation(), Sound.CHICKEN_EGG_POP, 1, 1);
  player.getInventory().setLeggings(brownl);
  MenúArmario.open(player);
}
else if (!player.hasPermission("skymc.armario.usar")) {
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
      else if (!player.hasPermission("skymc.menu.usar")) {
          event.setCancelled(true);
          player.sendMessage("§c¡Tú no tienes permisos!");
      }
    }
      
      
    }
  }
}