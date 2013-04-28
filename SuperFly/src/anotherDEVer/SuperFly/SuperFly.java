package anotherDEVer.SuperFly;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public final class SuperFly extends JavaPlugin
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (cmd.getName().equalsIgnoreCase("superfly"))
		{
			if ((sender instanceof Player) == true)
			{
				Player player = (Player) sender;
				
				if (player.getFlySpeed() > 0.1f)
				{
					player.setFlySpeed(0.1f);
				}
				
				else
				{
					player.setFlySpeed(1f);
				}
			}
			
			else
			{
				sender.sendMessage("This command can only be called by a player.");
			}
		}
		return false;
	}
}
