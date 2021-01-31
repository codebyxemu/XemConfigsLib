package me.xemu.xemconfigs;

import org.bukkit.plugin.java.JavaPlugin;

public final class XemConfigs extends JavaPlugin
{

    private static JavaPlugin pl;

    @Override public void onEnable()
    {
        getLogger().info("XemConfigsLib Enabled");

        getLogger().info("Hooked into " + getPlugin().getName() + ".");
    };

    @Override public void onDisable()
    {
        getLogger().info("XemConfigsLib Enabled");
    };

    public static void setPlugin(final JavaPlugin newPlugin)
    {
          pl = newPlugin;
    };

    public static JavaPlugin getPlugin()
    {
        return pl;
    };

};