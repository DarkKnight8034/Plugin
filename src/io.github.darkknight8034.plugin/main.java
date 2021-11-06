package io.github.darkknight8034.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin
{

  @Override
  public void onEnable()
  {
  
    getLogger().info("Plugin has been enabled!");

  }

  @Override
  public void onDisable()
  {

    getLogger().info("Plugin has been disabled!");

  }

}
