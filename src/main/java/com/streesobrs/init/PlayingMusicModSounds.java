package com.streesobrs.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PlayingMusicModSounds {
    //原神音乐
    public static SoundEvent MUSIC_NEVER_GONNA_GIVE_YOU_UP = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_never_gonna_give_you_up"));
    //地平线音乐
    public static SoundEvent MUSIC_A_MOMENT_APART = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_a_moment_apart"));
    //糖豆人音乐
    public static SoundEvent MUSIC_EVERYBODY_FALLS = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_everybody_falls"));

    public static void load() {
        //原神
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_never_gonna_give_you_up"), MUSIC_NEVER_GONNA_GIVE_YOU_UP);
        //地平线
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_a_moment_apart"), MUSIC_A_MOMENT_APART);
        //糖豆人
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_everybody_falls"), MUSIC_EVERYBODY_FALLS);
    }
}