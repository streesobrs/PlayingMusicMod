package com.streesobrs.mixin;

import com.streesobrs.PlayingMusicMod;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
	private static SoundEvent register;
	//测试栏
	public static final SoundEvent MODSOUND_MUSIC_DISC_CREATIVE_MUSIC = register("playing-music-mod.creative_music");
	public static final SoundEvent MODSOUND_MUSIC_DISC_YUANSHEN_MUSIC = register("playing-music-mod.yuanshen_music");
	public static final SoundEvent MODSOUND_MUSIC_DISC_FALLGUYS_MUSIC = register("playing-music-mod.fallguys_music");
	//普通栏
	public static final SoundEvent MODSOUND_MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP = register("playing-music-mod.ceshi_music.never_gonna_give_you_up");
	//原神栏
	public static final SoundEvent MODSOUND_MUSIC_DISC_ZHAN_DOU_DE_MI_YI = register("playing-music-mod.yuanshen_music.zhan_dou_de_mi_yi");
	public static final SoundEvent MODSOUND_MUSIC_DISC_JIE_JUE_ZHI_DAO = register("playing-music-mod.yuanshen_music.jie_jue_zhi_dao");
	public static final SoundEvent MODSOUND_MUSIC_DISC_GUANG_HUEI_DE_ZHANG_LUO =register("playing-music-mod.yuanshen_music.guang_huei_de_zhang_luo");
	//Fall Guys栏（糖豆人


	public static SoundEvent register(String name) {
		Identifier id = new Identifier(PlayingMusicMod.MOD_ID, name);
		return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
	}

	public static void registerSounds() {}
}