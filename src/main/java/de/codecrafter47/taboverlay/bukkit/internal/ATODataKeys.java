package de.codecrafter47.taboverlay.bukkit.internal;

import de.codecrafter47.data.api.DataKey;
import de.codecrafter47.data.api.TypeToken;
import de.codecrafter47.data.minecraft.api.MinecraftData;
import de.codecrafter47.taboverlay.Icon;

public class ATODataKeys {
    public final static TypeToken<Icon> TYPE_TOKEN_ICON = TypeToken.create();

    public final static DataKey<Icon> ICON = new DataKey<>("ato:icon", MinecraftData.SCOPE_PLAYER, TYPE_TOKEN_ICON);
    public final static DataKey<Integer> PING = new DataKey<>("ato:ping", MinecraftData.SCOPE_PLAYER, TypeToken.INTEGER);
}
