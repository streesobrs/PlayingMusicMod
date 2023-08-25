package com.streesobrs.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.streesobrs.init.PlayingMusicModTabs;
import com.streesobrs.init.PlayingMusicModSounds;

public class MusicXiongYingItem extends RecordItem {
    public MusicXiongYingItem() {
        super(0, PlayingMusicModSounds.MUSIC_XIONG_YING, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 240);
        ItemGroupEvents.modifyEntriesEvent(PlayingMusicModTabs.TAB_MORE_MUSIC).register(content -> content.accept(this));
    }
}
