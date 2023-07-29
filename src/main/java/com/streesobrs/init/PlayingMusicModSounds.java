package com.streesobrs.init;

import net.minecraft.sound.SoundEvent;
import net.minecraft.resource.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PlayingMusicModSounds {
    public static SoundEvent MUSIC_NEVER_GONNA_GIVE_YOU_UP = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music_mod", "music_never_gonna_give_you_up"));

    public static void load() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music_mod", "music_never_gonna_give_you_up"), MUSIC_NEVER_GONNA_GIVE_YOU_UP);
    }
}