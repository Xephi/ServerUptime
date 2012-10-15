package me.Xephi.ServerUptime;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ServerUpTimeCommands implements CommandExecutor {
    private final ServerUptime plugin;

    public ServerUpTimeCommands(ServerUptime plugin) {
        this.plugin = plugin;
    }
    private final long serverStart = System.currentTimeMillis();
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        final String commandName = cmd.getName().toLowerCase();
        final long diff = System.currentTimeMillis() - serverStart;
        final String msg = " " + (int)(diff / 86400000) + " days " + (int)(diff / 3600000 % 24) + " hours " + (int)(diff / 60000 % 60) + " mins " + (int)(diff / 1000 % 60) + " seconds";
        if (commandName.equals("uptime")) {
            plugin.getLogger().info("[CONSOLE]" + msg);
            sender.sendMessage(ChatColor.YELLOW + "[UpTime]" + msg);
		}
        return true;
    }
}
