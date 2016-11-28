package Principal;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ArchivosDeConfiguración.Configuración;
import Menús.MenúArmario;
import Menús.MenúBotas;
import Menús.MenúCascos;
import Menús.MenúPantalones;
import Menús.MenúPetos;


public class Main extends JavaPlugin
  implements Listener
{
  
  public static Main Principal;
  
  public static Logger Logger = Bukkit.getLogger();
  
  public static List<String> PluginAutor;
  public static File ArchivoDeConfiguración;
  public static String PluginVersión;
  public static String PluginNombre;
  
  
public void onEnable() {


    
	    Principal = this;
	    ArchivoDeConfiguración = getFile();
	    PluginVersión = getDescription().getVersion();
	    PluginNombre = getDescription().getName();
	    PluginAutor = getDescription().getAuthors();

	    
	    PluginManager Eventos = getServer().getPluginManager();

	    Eventos.registerEvents(new MenúPantalones(), Principal);
	    Eventos.registerEvents(new MenúBotas(), Principal);
	    Eventos.registerEvents(new MenúPetos(), Principal);
	    Eventos.registerEvents(new MenúArmario(), Principal);
	    Eventos.registerEvents(new MenúCascos(), Principal);
	    
	    Configuración.createConfig();
	    Configuración.readConfig();

	    Bukkit.getServer().getConsoleSender().sendMessage(Configuración.PREFIJO_CONSOLA + "§bPlugin §cArmario §bactivado. Version: §c§l" + PluginVersión);
	    }


public void onDisable()
{
	Bukkit.getServer().getConsoleSender().sendMessage(Configuración.PREFIJO_CONSOLA + "§bPlugin §cArmario §bdesactivado. Version: §c§l" + PluginVersión);



  }
}