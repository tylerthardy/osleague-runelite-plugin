package info.osleague.runelite.osleague.osleague;

import com.google.gson.annotations.SerializedName;
import info.osleague.runelite.osleague.Relic;

public class OsLeagueRelics
{
	@SerializedName("0")
	public OsLeagueRelic relic1 = null;
	@SerializedName("1")
	public OsLeagueRelic relic2 = null;
	@SerializedName("2")
	public OsLeagueRelic relic3 = null;
	@SerializedName("3")
	public OsLeagueRelic relic4 = null;
	@SerializedName("4")
	public OsLeagueRelic relic5 = null;
	@SerializedName("5")
	public OsLeagueRelic relic6 = null;

	public OsLeagueRelics(Relic[] relics)
	{
		for (int i = 0; i < relics.length; i++)
		{
			int tierId = relics[i].getTierId();
			switch (tierId)
			{
				case 0:
					relic1 = new OsLeagueRelic(relics[i]);
					continue;
				case 1:
					relic2 = new OsLeagueRelic(relics[i]);
					continue;
				case 2:
					relic3 = new OsLeagueRelic(relics[i]);
					continue;
				case 3:
					relic4 = new OsLeagueRelic(relics[i]);
					continue;
				case 4:
					relic5 = new OsLeagueRelic(relics[i]);
					continue;
				case 5:
					relic6 = new OsLeagueRelic(relics[i]);
					continue;
			}
		}
	}
}
