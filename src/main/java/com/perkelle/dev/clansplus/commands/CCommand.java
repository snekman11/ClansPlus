package com.perkelle.dev.clansplus.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public abstract class CCommand extends BukkitCommand {

    public CCommand(String name, String description, String usage, String permission, String[] aliases) {
        super(name);
        this.description = description;
        this.usageMessage = usage;
        this.setPermission(permission);
        this.setAliases(Arrays.asList(aliases));
    }

    public abstract boolean execute(CommandSender sender, String alias, String[] args);
}
