package Principal;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import ArchivosDeConfiguraci�n.Configuraci�n;
import Men�s.Men�Armario;
import Men�s.Men�Botas;
import Men�s.Men�Cascos;
import Men�s.Men�Pantalones;
import Men�s.Men�Petos;


public class Main extends JavaPlugin
  implements Listener
{
  
  public static Main Principal;
  
  public static Logger Logger = Bukkit.getLogger();
  
  public static List<String> PluginAutor;
  public static File ArchivoDeConfiguraci�n;
  public static String PluginVersi�n;
  public static String PluginNombre;
  
  
public void onEnable() {


    
	    Principal = this;
	    ArchivoDeConfiguraci�n = getFile();
	    PluginVersi�n = getDescription().getVersion();
	    PluginNombre = getDescription().getName();
	    PluginAutor = getDescription().getAuthors();

	    
	    PluginManager Eventos = getServer().getPluginManager();

	    Eventos.registerEvents(new Men�Pantalones(), Principal);
	    Eventos.registerEvents(new Men�Botas(), Principal);
	    Eventos.registerEvents(new Men�Petos(), Principal);
	    Eventos.registerEvents(new Men�Armario(), Principal);
	    Eventos.registerEvents(new Men�Cascos(), Principal);
	    
	    Configuraci�n.createConfig();
	    Configuraci�n.readConfig();

	    Bukkit.getServer().getConsoleSender().sendMessage(Configuraci�n.PREFIJO_CONSOLA + "�bPlugin �cArmario �bactivado. Version: �c�l" + PluginVersi�n);
	    }


public void onDisable()
{
	Bukkit.getServer().getConsoleSender().sendMessage(Configuraci�n.PREFIJO_CONSOLA + "�bPlugin �cArmario �bdesactivado. Version: �c�l" + PluginVersi�n);



  }
}