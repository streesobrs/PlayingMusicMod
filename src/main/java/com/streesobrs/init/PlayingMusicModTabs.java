package com.streesobrs.init;


import com.streesobrs.PlayingMusicMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class PlayingMusicModTabs {
    //创建原神栏
    public static ResourceKey<CreativeModeTab> TAB_GENSHIN_MUSIC = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(PlayingMusicMod.MODID, "genshin_music"));
    //创建地平线栏
    public static ResourceKey<CreativeModeTab> TAB_FORZA_HORIZON_MUSIC = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(PlayingMusicMod.MODID, "forza_horizon_music"));

    public static void load() {
        //原神音乐栏
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GENSHIN_MUSIC,
                FabricItemGroup.builder().title(Component.translatable("item_group." + PlayingMusicMod.MODID + ".genshin_music")).icon(() -> new ItemStack(Items.MUSIC_DISC_13)).build());
        //地平线音乐栏
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_FORZA_HORIZON_MUSIC,
                FabricItemGroup.builder().title(Component.translatable("item_group." + PlayingMusicMod.MODID + ".forza_horizon_music")).icon(() -> new ItemStack(Items.MUSIC_DISC_13)).build());
    }
}