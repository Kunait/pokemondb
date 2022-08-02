package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PokemonEncountersItem{

	@SerializedName("pokemon")
	private Pokemon pokemon;

	@SerializedName("version_details")
	private List<VersionDetailsItem> versionDetails;

	public Pokemon getPokemon(){
		return pokemon;
	}

	public List<VersionDetailsItem> getVersionDetails(){
		return versionDetails;
	}

	@Override
 	public String toString(){
		return 
			"PokemonEncountersItem{" + 
			"pokemon = '" + pokemon + '\'' + 
			",version_details = '" + versionDetails + '\'' + 
			"}";
		}
}