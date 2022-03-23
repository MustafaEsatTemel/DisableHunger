package tr.mustafaesattemel.disablehunger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadConfig implements CommandExecutor {
    private Main main;
    public ReloadConfig(Main main){
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if(sender instanceof Player){
        Player player = (Player) sender;
        if(sender.hasPermission("disablehunger.op")){

            main.reloadConfig();
            player.sendMessage("Config Reloaded!");
        }else{
            player.sendMessage("You dont have permission for that!");
        }

    }


        return false;
    }
}
