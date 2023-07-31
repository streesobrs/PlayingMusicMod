package com.streesobrs;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.streesobrs.init.PlayingMusicModTabs;
import com.streesobrs.init.PlayingMusicModSounds;
import com.streesobrs.init.PlayingMusicModItems;

public class PlayingMusicMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	//设置mod id
	public static final String MODID = "playing_music";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PlayingMusicMod");

		PlayingMusicModTabs.load();

		PlayingMusicModItems.load();

		PlayingMusicModSounds.load();

	}
}