package com.streesobrs.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;



import com.streesobrs.init.PlayingMusicModTabs;
import com.streesobrs.init.PlayingMusicModSounds;
public class MusicAMomentApartItem extends RecordItem{
    public MusicAMomentApartItem() {
        super(0, PlayingMusicModSounds.MUSIC_A_MOMENT_APART, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 240);
        ItemGroupEvents.modifyEntriesEvent(PlayingMusicModTabs.TAB_FORZA_HORIZON_MUSIC).register(content -> content.accept(this));
    }
}
