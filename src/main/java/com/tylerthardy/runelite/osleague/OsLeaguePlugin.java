package com.tylerthardy.runelite.osleague;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "OsLeague"
)
public class OsLeaguePlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private OsLeagueConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("OsLeague started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("OsLeague stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "OsLeague says " + config.greeting(), null);
		}
	}

	@Provides
	OsLeagueConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(OsLeagueConfig.class);
	}
}
