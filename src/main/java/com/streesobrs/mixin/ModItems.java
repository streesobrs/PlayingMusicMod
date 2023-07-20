package com.streesobrs.mixin;

import com.streesobrs.PlayingMusicMod;
import com.streesobrs.mixin.types.CustomDiscItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item MUSIC_DISC_CREATIVE_MUSIC = registerDiscCmdsOnly("music_disc_creative_music", ModSounds.MODSOUND_MUSIC_DISC_CREATIVE_MUSIC);
    public static final Item MUSIC_DISC_YUANSHEN_MUSIC = registerDiscCmdsOnly("music_disc_yuanshen_music", ModSounds.MODSOUND_MUSIC_DISC_YUANSHEN_MUSIC);
    public static final Item MUSIC_DISC_FALLGUYS_MUSIC = registerDiscCmdsOnly("music_disc_fallguys_music", ModSounds.MODSOUND_MUSIC_DISC_FALLGUYS_MUSIC);

    //普通创造物品
    //定义↓             物品↓     物品名称↓                           创造物品栏↓        小写物品名称↓
    public static final Item MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP = PUTONGWUPIN_CREATE("music_disc_never_gonna_give_you_up",ModSounds.MODSOUND_MUSIC_DISC_NEVER_GONNA_GIVE_YOU_UP);



    //原神创造栏物品
    public static final Item MUSIC_DISC_ZHAN_DOU_DE_MI_YI = YUANSHEN_CREATE("music_disc_zhan_dou_de_mi_yi",ModSounds.MODSOUND_MUSIC_DISC_ZHAN_DOU_DE_MI_YI);
    public static final Item MUSIC_DISC_JIE_JUE_ZHI_DAO = YUANSHEN_CREATE("music_disc_jie_jue_zhi_dao",ModSounds.MODSOUND_MUSIC_DISC_JIE_JUE_ZHI_DAO);
    public static final Item MUSIC_DISC_GUANG_HUEI_DE_ZHANG_LUO = YUANSHEN_CREATE("music_disc_guang_huei_de_zhang_luo",ModSounds.MODSOUND_MUSIC_DISC_GUANG_HUEI_DE_ZHANG_LUO);


    //定义普通创造物品
    public static Item PUTONGWUPIN_CREATE(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(PlayingMusicMod.TAB_CREATIVE_MUSIC);
        return Registry.register(Registry.ITEM, new Identifier(PlayingMusicMod.MOD_ID, id), new CustomDiscItem(11, sound, settings));
    }
    //定义原神创造物品
    public static Item YUANSHEN_CREATE(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(PlayingMusicMod.TAB_YUANSHEN_MUSIC);
        return Registry.register(Registry.ITEM, new Identifier(PlayingMusicMod.MOD_ID, id), new CustomDiscItem(15, sound, settings));
    }
    //定义FALLGUYS创造物品(糖豆人
    public static Item FALLGUYS_CREATE(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(PlayingMusicMod.TAB_FALLGUYS_MUSIC);
        return Registry.register(Registry.ITEM, new Identifier(PlayingMusicMod.MOD_ID, id), new CustomDiscItem(14, sound, settings));
    }
    //测试用的，没有实际价值
    public static Item registerDiscCmdsOnly(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.EPIC).maxCount(1);
        return Registry.register(Registry.ITEM, new Identifier(PlayingMusicMod.MOD_ID, id), new CustomDiscItem(1, sound, settings));
    }
}