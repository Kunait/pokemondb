package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BegegnungResult{

	@SerializedName("game_index")
	private int gameIndex;

	@SerializedName("names")
	private List<NamesItem> names;

	@SerializedName("pokemon_encounters")
	private List<PokemonEncountersItem> pokemonEncounters;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private Location location;

	@SerializedName("id")
	private int id;

	@SerializedName("encounter_method_rates")
	private List<EncounterMethodRatesItem> encounterMethodRates;

	public int getGameIndex(){
		return gameIndex;
	}

	public List<NamesItem> getNames(){
		return names;
	}

	public List<PokemonEncountersItem> getPokemonEncounters(){
		return pokemonEncounters;
	}

	public String getName(){
		return name;
	}

	public Location getLocation(){
		return location;
	}

	public int getId(){
		return id;
	}

	public List<EncounterMethodRatesItem> getEncounterMethodRates(){
		return encounterMethodRates;
	}

	@Override
 	public String toString(){
		return 
			"BegegnungResult{" + 
			"game_index = '" + gameIndex + '\'' + 
			",names = '" + names + '\'' + 
			",pokemon_encounters = '" + pokemonEncounters + '\'' + 
			",name = '" + name + '\'' + 
			",location = '" + location + '\'' + 
			",id = '" + id + '\'' + 
			",encounter_method_rates = '" + encounterMethodRates + '\'' + 
			"}";
		}
}