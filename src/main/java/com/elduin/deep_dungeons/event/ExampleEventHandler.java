package com.elduin.deep_dungeons.event;

import com.elduin.deep_dungeons.ModTemplate;
import net.minecraft.server.level.ServerPlayer;

public class ExampleEventHandler {

	public static void onPlayerHurt(ServerPlayer player) {
		ModTemplate.LOGGER.info("{} took damage.", player.getDisplayName());
	}
}
