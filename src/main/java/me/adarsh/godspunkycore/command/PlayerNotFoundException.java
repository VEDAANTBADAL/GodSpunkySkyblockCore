package me.adarsh.godspunkycore.command;

import org.bukkit.ChatColor;

public class PlayerNotFoundException extends RuntimeException
{
    public PlayerNotFoundException()
    {
        super(ChatColor.GRAY + "Player not found!");
    }
}