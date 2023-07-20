package com.streesobrs.mixin.types;

import com.streesobrs.PlayingMusicMod;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class BlockItemWithDesc extends BlockItem {

    String blockNameString;

    public BlockItemWithDesc(Block block, Settings settings, String blockString) {
        super(block, settings);
        blockNameString = blockString;
    }

    // override tooltip method and add description
    @Override
    public void appendTooltip(ItemStack itemStack, World world, java.util.List<net.minecraft.text.Text> tooltip, TooltipContext tooltipContext) {

        // grey tooltip
        tooltip.add( new TranslatableText("block." + PlayingMusicMod.MOD_ID + "." + blockNameString + ".desc").formatted(Formatting.GRAY) );
        tooltip.add( new TranslatableText("block." + PlayingMusicMod.MOD_ID + "." + blockNameString + ".desc_2").formatted(Formatting.GRAY) );

    }

}