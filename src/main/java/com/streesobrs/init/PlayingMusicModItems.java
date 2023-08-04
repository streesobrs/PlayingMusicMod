package com.streesobrs.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.streesobrs.PlayingMusicMod;

import com.streesobrs.item.MusicNeverGonnaGiveYouUpItem;
import com.streesobrs.item.MusicAMomentApartItem;
import com.streesobrs.item.MusicEverybodyFallsItem;

public class PlayingMusicModItems {
    //增加唱片
    //原神唱片
    public static Item MUSIC_NEVER_GONNA_GIVE_YOU_UP;

    //地平线唱片
    public static Item MUSIC_A_MOMENT_APART;

    //糖豆人唱片
    public static Item MUSIC_EVERYBODY_FALLS;


    public static void load() {

        //原神唱片
        MUSIC_NEVER_GONNA_GIVE_YOU_UP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_never_gonna_give_you_up"), new MusicNeverGonnaGiveYouUpItem());
        //地平线唱片
        MUSIC_A_MOMENT_APART = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_a_moment_apart"), new MusicAMomentApartItem());
        //糖豆人唱片
        MUSIC_EVERYBODY_FALLS = Registry.register(BuiltInRegistries.ITEM,new ResourceLocation(PlayingMusicMod.MODID,"music_everybody_falls"),new MusicEverybodyFallsItem());
    }
}
