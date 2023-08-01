package com.streesobrs.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.streesobrs.PlayingMusicMod;

import com.streesobrs.item.MusicNeverGonnaGiveYouUpItem;
import com.streesobrs.item.MusicAMomentApartItem;

public class PlayingMusicModItems {
    //增加唱片
    public static Item MUSIC_NEVER_GONNA_GIVE_YOU_UP;
    public static Item MUSIC_A_MOMENT_APART;

    public static void load() {

        MUSIC_NEVER_GONNA_GIVE_YOU_UP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_never_gonna_give_you_up"), new MusicNeverGonnaGiveYouUpItem());
        MUSIC_A_MOMENT_APART = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_a_moment_apart"), new MusicAMomentApartItem());
    }
}
