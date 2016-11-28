package ArchivosDeConfiguración;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import Principal.Main;

public class Configuración
{
  static final String path = "plugins/SkyMC-Armario/Configuración.yml";
  static File file = new File("plugins/SkyMC-Armario/Configuración.yml");
  public static FileConfiguration config = YamlConfiguration.loadConfiguration(file);

  public static String PREFIJO_GENERAL;
  public static String PREFIJO_CONSOLA;
  public static String RAWMOTD;

  public static void createConfig()
  {
    config.addDefault("PREFIJO_GENERAL", "&b&lSky&a&lMC &8» &r");
    config.addDefault("PREFIJO_CONSOLA", "&b&lSky&a&lMC &8>> &r");



    config.options().copyDefaults(true);
    save();
  }

  public static void readConfig() {
	  PREFIJO_GENERAL = Colores(config.getString("PREFIJO_GENERAL"));
	  PREFIJO_CONSOLA = Colores(config.getString("PREFIJO_CONSOLA"));
 
  }

  public static void save()
  {
    try {
      config.save("plugins/WarCraft/Configuración.yml");
    } catch (IOException e) {
    	Bukkit.getServer().getConsoleSender().sendMessage(Configuración.PREFIJO_CONSOLA + "§4Error al crear el archivo §eConfiguracion.yml §7- §a§l" + Main.PluginNombre + "§4.");
    }
  }

  public static String Colores(String motd) {
    String output = ChatColor.translateAlternateColorCodes('&', motd);
    RAWMOTD = output;
    output = output.replaceFirst("%NuevaLinea%", "\n");
    output = output.replaceFirst("%>>%", "»");
    output = output.replaceFirst("%o%", "");
    return output;
  }
}