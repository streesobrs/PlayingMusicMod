package com.streesobrs;

import com.streesobrs.mixin.ModItems;
import com.streesobrs.mixin.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class PlayingMusicMod implements ModInitializer {
	//设置mod id
	public static final String MOD_ID = "playing-music-mod";
	// 创建创造物品栏

	//测试用的物品栏
	public static final ItemGroup TAB_CREATIVE_MUSIC = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "tab_creative_music"),
			() -> new ItemStack(ModItems.MUSIC_DISC_CREATIVE_MUSIC)
	);
	//原神 唱片物品栏
	public static final ItemGroup TAB_YUANSHEN_MUSIC = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "tab_yuanshen_music"),
			() -> new ItemStack(ModItems.MUSIC_DISC_YUANSHEN_MUSIC)
	);
	//FallGuys 唱片物品栏
	public static final ItemGroup TAB_FALLGUYS_MUSIC = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "tab_fallguys_music"),
			() -> new ItemStack(ModItems.MUSIC_DISC_FALLGUYS_MUSIC)
	);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
	}
}