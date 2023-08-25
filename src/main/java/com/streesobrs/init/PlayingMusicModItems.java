package com.streesobrs.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.streesobrs.PlayingMusicMod;

import com.streesobrs.item.MusicNeverGonnaGiveYouUpItem;
import com.streesobrs.item.MusicDespacitoItem;
import com.streesobrs.item.MusicXiongYingItem;

import com.streesobrs.item.MusicBeneathTheLightOfJadeiteItem;
import com.streesobrs.item.MusicFleetingColorsInFlightItem;
import com.streesobrs.item.MusicTheExquisiteNightChimesItem;

import com.streesobrs.item.MusicAMomentApartItem;

import com.streesobrs.item.MusicEverybodyFallsItem;

public class PlayingMusicModItems {
    //增加唱片
    //其他唱片
    public static Item MUSIC_NEVER_GONNA_GIVE_YOU_UP;
    public static Item MUSIC_DESPACITO;
    public static Item MUSIC_XIONG_YING;
    //原神唱片
    public static Item BENEATH_THE_LIGHT_OF_JADEITE;
    public static Item FLEETING_COLORS_IN_FLIGHT;
    public static Item THE_EXQUISITE_NIGHT_CHIMES;
    //地平线唱片
    public static Item MUSIC_A_MOMENT_APART;

    //糖豆人唱片
    public static Item MUSIC_EVERYBODY_FALLS;


    public static void load() {

        //其他唱片
        MUSIC_NEVER_GONNA_GIVE_YOU_UP = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_never_gonna_give_you_up"), new MusicNeverGonnaGiveYouUpItem());
        MUSIC_DESPACITO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_despacito"), new MusicDespacitoItem());
        MUSIC_XIONG_YING = Registry.register(BuiltInRegistries.ITEM,new ResourceLocation(PlayingMusicMod.MODID,"music_xiong_ying"),new MusicXiongYingItem());
        //原神唱片
        BENEATH_THE_LIGHT_OF_JADEITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_beneath_the_light_of_jadeite"), new MusicBeneathTheLightOfJadeiteItem());
        FLEETING_COLORS_IN_FLIGHT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_fleeting_colors_in_flight"), new MusicFleetingColorsInFlightItem());
        THE_EXQUISITE_NIGHT_CHIMES = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_the_exquisite_night_chimes"), new MusicTheExquisiteNightChimesItem());

        //地平线唱片
        MUSIC_A_MOMENT_APART = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(PlayingMusicMod.MODID, "music_a_moment_apart"), new MusicAMomentApartItem());
        //糖豆人唱片
        MUSIC_EVERYBODY_FALLS = Registry.register(BuiltInRegistries.ITEM,new ResourceLocation(PlayingMusicMod.MODID,"music_everybody_falls"),new MusicEverybodyFallsItem());
    }
}
