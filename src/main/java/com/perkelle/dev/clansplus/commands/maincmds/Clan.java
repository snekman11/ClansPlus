package com.perkelle.dev.clansplus.commands.maincmds;

import com.perkelle.dev.clansplus.commands.CMainCommand;
import com.perkelle.dev.clansplus.commands.CSubCommand;
import com.perkelle.dev.clansplus.commands.RegisterCmds;
import org.bukkit.command.CommandSender;

import java.util.List;

public class Clan extends CMainCommand {

    private RegisterCmds registerCmds = new RegisterCmds();
    private List<CSubCommand> subCmds = registerCmds.getSubCmds();

    public Clan() {
        super("clan", "Main Clan Command", "/Clan [Args]", new String[] {"c"});
    }

    public boolean execute(CommandSender sender, String alias, String[] args) {
        for(CSubCommand subCmd : subCmds) {
            if(subCmd.getName().equalsIgnoreCase(args[0])) {
                String[] subArgs = new String[args.length-1];
                for(int i = 0; i < args.length-1; i++) {
                    subArgs[i] = args[i+1];
                }

                subCmd.execute(sender, subArgs);
            }
        }
        return false;
    }
}
