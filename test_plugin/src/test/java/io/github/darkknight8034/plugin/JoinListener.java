package io.github.darkknight8034.plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

import io.github.darkknight8034.plugin.Main;

public class JoinListener implements Listener
{

    public JoinListener(Plugin plugin)
    {}

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {

        Player player = event.getPlayer();
        player.sendMessage("Welcome, " + player + "!");
    }

}