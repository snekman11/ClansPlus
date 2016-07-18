package com.perkelle.dev.clansplus.commands;

import com.perkelle.dev.clansplus.commands.maincmds.Clan;
import com.perkelle.dev.clansplus.commands.playercmds.Create;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.Plugin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class RegisterCmds {

    private static List<CMainCommand> cmds = new ArrayList<CMainCommand>();
    private static List<CSubCommand> subCmds = new ArrayList<CSubCommand>();

    public void addCmds() {
        cmds.add(new Clan());
    }

    public void addSubCmds() {
        subCmds.add(new Create());
    }

    public void register(Plugin pl) {
        //Credit to https://www.spigotmc.org/members/occanowey.1910/ and https://www.spigotmc.org/members/itssteve.8181/
        CommandMap commandMap = null;
        try {
            final Field bukkitCommandMap = pl.getServer().getClass().getDeclaredField("commandMap");
            bukkitCommandMap.setAccessible(true);
            commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
        } catch(NoSuchFieldException e) {
            pl.getServer().getLogger().severe("Error #1 occurred - please report this to the author along with this:");
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            pl.getServer().getLogger().severe("Error #1 occurred - please report this to the author along with this:");
            e.printStackTrace();
        }

        for(CMainCommand cmd : cmds) {
            try {
                commandMap.register(cmd.getName(), cmd);
            } catch(NullPointerException e) {
                pl.getServer().getLogger().severe("Error #2 occurred - please report this to the author along with this:");
                e.printStackTrace();
            }
        }
    }

    public List<CSubCommand> getSubCmds() {
        return subCmds;
    }
}
