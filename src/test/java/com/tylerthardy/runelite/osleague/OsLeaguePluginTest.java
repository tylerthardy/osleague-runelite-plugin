package com.tylerthardy.runelite.osleague;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class OsLeaguePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(OsLeaguePlugin.class);
		RuneLite.main(args);
	}
}