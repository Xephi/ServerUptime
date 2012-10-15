package me.Xephi.ServerUptime;
 
import org.bukkit.plugin.java.JavaPlugin;
 
public class ServerUptime extends JavaPlugin
{

	public ServerUpTimeCommands CommandExecutor = new ServerUpTimeCommands(this);
    @Override
    public void onEnable() {
        getLogger().info("ServerUptime v1.0 enabled");
		getCommand("uptime").setExecutor(CommandExecutor);

    }
 
    @Override
    public void onDisable() {
        getLogger().info("ServerUptime v1.0 disabled");
    }
}