package com.perkelle.dev.clansplus;

import com.perkelle.dev.clansplus.commands.RegisterCmds;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    private RegisterCmds registerCmds;

    @Override
    public void onEnable() {
        registerCmds = new RegisterCmds();
        registerCmds.addCmds();
        registerCmds.addSubCmds();
        registerCmds.register(this);
    }
}
