package com.streesobrs.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PlayingMusicModSounds {
    //其他音乐
    public static SoundEvent MUSIC_NEVER_GONNA_GIVE_YOU_UP = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_never_gonna_give_you_up"));
    public static SoundEvent MUSIC_DESPACITO = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music","music_despacito"));
    public static SoundEvent MUSIC_XIONG_YING = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music","music_xiong_ying"));

    //原神音乐
    public static SoundEvent BENEATH_THE_LIGHT_OF_JADEITE = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_beneath_the_light_of_jadeite"));
    public static SoundEvent FLEETING_COLORS_IN_FLIGHT = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_fleeting_colors_in_flight"));
    public static SoundEvent THE_EXQUISITE_NIGHT_CHIMES = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_the_exquisite_night_chimes"));

    //地平线音乐
    public static SoundEvent MUSIC_A_MOMENT_APART = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_a_moment_apart"));
    //糖豆人音乐
    public static SoundEvent MUSIC_EVERYBODY_FALLS = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_everybody_falls"));

    public static void load() {
        //其他
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_never_gonna_give_you_up"), MUSIC_NEVER_GONNA_GIVE_YOU_UP);
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_despacito"), MUSIC_DESPACITO);
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_xiong_ying"), MUSIC_XIONG_YING);
        //原神
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_beneath_the_light_of_jadeite"), BENEATH_THE_LIGHT_OF_JADEITE);
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_fleeting_colors_in_flight"), FLEETING_COLORS_IN_FLIGHT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_the_exquisite_night_chimes"), THE_EXQUISITE_NIGHT_CHIMES);
        //地平线
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_a_moment_apart"), MUSIC_A_MOMENT_APART);
        //糖豆人
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_everybody_falls"), MUSIC_EVERYBODY_FALLS);
    }
}