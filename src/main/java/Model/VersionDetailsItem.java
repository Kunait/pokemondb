package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class VersionDetailsItem{

	@SerializedName("max_chance")
	private int maxChance;

	@SerializedName("encounter_details")
	private List<EncounterDetailsItem> encounterDetails;

	@SerializedName("version")
	private Version version;

	@SerializedName("rate")
	private int rate;

	public int getMaxChance(){
		return maxChance;
	}

	public List<EncounterDetailsItem> getEncounterDetails(){
		return encounterDetails;
	}

	public Version getVersion(){
		return version;
	}

	public int getRate(){
		return rate;
	}

	@Override
 	public String toString(){
		return 
			"VersionDetailsItem{" + 
			"max_chance = '" + maxChance + '\'' + 
			",encounter_details = '" + encounterDetails + '\'' + 
			",version = '" + version + '\'' + 
			",rate = '" + rate + '\'' + 
			"}";
		}
}