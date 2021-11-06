package io.github.darkknight8034.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

import io.github.darkknight8034.plugin.Listener;

public class Main extends JavaPlugin
{

  @Override
  public void onEnable()
  {
  
    getLogger().info("Plugin has been enabled!");
    PluginManager pluginManager = getServer().getPluginManager();
    Listener listener = new Listener(this);
    pluginManager.registerEvents(listener, this);

  }

  @Override
  public void onDisable()
  {

    getLogger().info("Plugin has been disabled!");

  }

}
