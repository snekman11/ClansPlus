package com.perkelle.dev.clansplus.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public abstract class CMainCommand extends BukkitCommand {

    public CMainCommand(String name, String description, String usage, String[] aliases) {
        super(name);
        this.description = description;
        this.usageMessage = usage;
        this.setAliases(Arrays.asList(aliases));
    }

    public abstract boolean execute(CommandSender sender, String alias, String[] args);
}
