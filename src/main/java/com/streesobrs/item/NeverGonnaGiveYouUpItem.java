package com.streesobrs.item;

import net.minecraft.item.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import com.streesobrs.init.PlayingMusicModTabs;
import com.streesobrs.init.PlayingMusicModSounds;
import net.minecraft.util.Rarity;

public class NeverGonnaGiveYouUpItem extends RecordItem {
    public NeverGonnaGiveYouUpItem() {
        super(0, PlayingMusicModSounds.MUSIC_NEVER_GONNA_GIVE_YOU_UP, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
        ItemGroupEvents.modifyEntriesEvent(PlayingMusicModTabs.TAB_GENSHIN_MUSIC).register(content -> content.accept(this));
    }
}