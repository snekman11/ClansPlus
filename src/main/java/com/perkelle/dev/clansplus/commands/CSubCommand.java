package com.perkelle.dev.clansplus.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public abstract class CSubCommand {

    public abstract void execute(CommandSender sender, String[] args);

    public abstract String getName();

    public abstract String getPermission();

    public abstract String getUsage();

    public abstract String[] getAliases();
}
