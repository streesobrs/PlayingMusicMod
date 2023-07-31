package com.streesobrs.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PlayingMusicModSounds {
    public static SoundEvent MUSIC_NEVER_GONNA_GIVE_YOU_UP = SoundEvent.createVariableRangeEvent(new ResourceLocation("playing_music", "music_never_gonna_give_you_up"));

    public static void load() {
        Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("playing_music", "music_never_gonna_give_you_up"), MUSIC_NEVER_GONNA_GIVE_YOU_UP);
    }
}