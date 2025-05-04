package jiekie.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        e.setJoinMessage(getRightArrowPrefix() + player.getName());
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(getLeftArrowPrefix() + player.getName());
    }

    public static String getLeftArrowPrefix() {
        return "\uA005 ";
    }

    public static String getRightArrowPrefix() {
        return "\uA006 ";
    }
}
