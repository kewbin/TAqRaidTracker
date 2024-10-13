package dev.kewbin.raidtracker;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaidTracker implements ModInitializer {
	public static final String MOD_ID = "raidtracker";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing RaidTracker");
	}
}