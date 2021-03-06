package me.hulipvp.celestial.factions.type.system;

import lombok.Getter;
import lombok.Setter;
import me.hulipvp.celestial.factions.Faction;
import me.hulipvp.celestial.factions.type.FactionType;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SystemFaction extends Faction {

    @Getter @Setter private boolean deathban;
    @Getter @Setter private ChatColor color;

    public SystemFaction(final UUID uuid, final String name) {
        super(uuid, FactionType.SYSTEM, name);

        color = ChatColor.AQUA;
    }

    @Override
    public void show(final Player player) {

    }
}
