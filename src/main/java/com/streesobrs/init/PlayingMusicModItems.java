package com.streesobrs.init;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.streesobrs.PlayingMusicMod;
import com.streesobrs.item.NeverGonnaGiveYouUpItem;

public class PlayingMusicModItems {
    public static Item NEVER_GONNA_GIVE_YOU_UP;

    public static void load() {
        NEVER_GONNA_GIVE_YOU_UP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "never_gonna_give_you_up"), new NeverGonnaGiveYouUpItem());
    }
}
