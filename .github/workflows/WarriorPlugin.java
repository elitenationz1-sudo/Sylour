package com.yourname.hytale;

import com.hytale.api.plugin.Plugin;

public class WarriorPlugin extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("WarriorPlugin enabled!");
        // Initialize player systems, register events
    }

    @Override
    public void onDisable() {
        System.out.println("WarriorPlugin disabled!");
    }
}
