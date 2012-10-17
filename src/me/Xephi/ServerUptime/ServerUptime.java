package me.Xephi.ServerUptime;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerUptime extends JavaPlugin
{

   public static Configuration config;
   public final Logger log = Logger.getLogger("Minecraft");
   public ServerUptimeCommands CommandExecutor = new ServerUptimeCommands(this);
    
   @Override
   public void onEnable() {
        if(!new File(getDataFolder()+File.separator+"config.yml").exists()){
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
            log.info(String.format("[ServerUptime] Copy default configuration..."));
            log.info(String.format("[ServerUptime] Default configuration copied and loaded"));
        }else{
        	getConfig().options().copyDefaults(true);
            log.info(String.format("[ServerUptime] Configuration loaded"));
        }
        getLogger().info("ServerUptime v1.1 enabled");
        getCommand("uptime").setExecutor(CommandExecutor);
    }

    @Override
    public void onDisable() {
        getLogger().info("ServerUptime v1.1 disabled");
    }


	public static String replaceWithChatColor(String colorFix) {

		colorFix = colorFix.replace("*dark_green*", ChatColor.DARK_GREEN.toString());
		colorFix = colorFix.replace("*dark_red*", ChatColor.DARK_RED.toString());
		colorFix = colorFix.replace("*dark_aqua*", ChatColor.DARK_AQUA.toString());
		colorFix = colorFix.replace("*dark_blue*", ChatColor.DARK_BLUE.toString());
		colorFix = colorFix.replace("*dark_gray*", ChatColor.DARK_GRAY.toString());
		colorFix = colorFix.replace("*dark_purple*", ChatColor.DARK_PURPLE.toString());

		colorFix = colorFix.replace("*red*", ChatColor.RED.toString());
		colorFix = colorFix.replace("*gold*", ChatColor.GOLD.toString());
		colorFix = colorFix.replace("*orange*", ChatColor.GOLD.toString());
		colorFix = colorFix.replace("*green*", ChatColor.GREEN.toString());
		colorFix = colorFix.replace("*aqua*", ChatColor.AQUA.toString());
		colorFix = colorFix.replace("*white*", ChatColor.WHITE.toString());
		colorFix = colorFix.replace("*blue*", ChatColor.BLUE.toString());
		colorFix = colorFix.replace("*black*", ChatColor.BLACK.toString());
		colorFix = colorFix.replace("*gray*", ChatColor.GRAY.toString());
		colorFix = colorFix.replace("*light_purple*", ChatColor.LIGHT_PURPLE.toString());
		colorFix = colorFix.replace("*yellow*", ChatColor.YELLOW.toString());
		colorFix = colorFix.replace("*magic*", ChatColor.MAGIC.toString());

		return colorFix;
	}
}