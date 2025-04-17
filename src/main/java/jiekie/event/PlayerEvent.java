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
        e.setJoinMessage(getJoinMessagePrefix() + player.getName());
    }

    @EventHandler
    public void onPlayerJoin(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(getQuitMessagePrefix() + player.getName());
    }

    private String getJoinMessagePrefix() {
        return "[ " + ChatColor.GREEN + "➕" + ChatColor.WHITE + " ] ";
    }

    private String getQuitMessagePrefix() {
        return "[ " + ChatColor.RED + "➖" + ChatColor.WHITE + " ] ";
    }
}
