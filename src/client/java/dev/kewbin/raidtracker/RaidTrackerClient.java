package dev.kewbin.raidtracker;

import dev.kewbin.raidtracker.controllers.Authentication;
import dev.kewbin.raidtracker.controllers.Config;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

public class RaidTrackerClient implements ClientModInitializer {
	public static Config.ConfigData config_data;

	@Override
	public void onInitializeClient() {
		config_data = Config.getConfigData();

		ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
			Authentication.authInit();
		});
	}
}