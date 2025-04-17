package jiekie;

import jiekie.event.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinQuitMessagePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerEvent(), this);

        getLogger().info("입·퇴장 메시지 설정 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
