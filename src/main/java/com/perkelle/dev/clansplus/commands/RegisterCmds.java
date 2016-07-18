package com.perkelle.dev.clansplus.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.Plugin;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class RegisterCmds {

    private static List<CCommand> cmds = new ArrayList<CCommand>();

    public void addCmds() {

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

        for(CCommand cmd : cmds) {
            try {
                commandMap.register(cmd.getName(), cmd);
            } catch(NullPointerException e) {
                pl.getServer().getLogger().severe("Error #2 occurred - please report this to the author along with this:");
                e.printStackTrace();
            }
        }
    }
}
