package dev.nest.bor.listeners;

import com.songoda.skyblock.api.event.player.PlayerIslandEnterEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffectType;

public class IslandJoin implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onIslandJoin(final PlayerIslandEnterEvent event) {
        if (!event.getIsland().getOwnerUUID().equals(event.getPlayer().getUniqueId())) {
            if (event.getPlayer().hasPotionEffect(PotionEffectType.BAD_OMEN)) {
                event.getPlayer().removePotionEffect(PotionEffectType.BAD_OMEN);
            }
        }
    }
}
