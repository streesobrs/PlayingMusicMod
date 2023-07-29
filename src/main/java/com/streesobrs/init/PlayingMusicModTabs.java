package com.streesobrs.init;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.streesobrs.PlayingMusicMod;

public class PlayingMusicModTabs {
    public static ResourceKey<CreativeModeTab> TAB_GENSHIN_MUSIC = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(PlayingMusicMod.MODID, "genshin_music"));

    public static void load() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GENSHIN_MUSIC,
                FabricItemGroup.builder().title(Component.translatable("item_group." + PlayingMusicMod.MODID + ".genshin_music")).icon(() -> new ItemStack(Items.MUSIC_DISC_13)).build());
    }
}