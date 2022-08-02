package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RegionErgebnis{

	@SerializedName("main_generation")
	private MainGeneration mainGeneration;

	@SerializedName("names")
	private List<NamesItem> names;

	@SerializedName("pokedexes")
	private List<PokedexesItem> pokedexes;

	@SerializedName("version_groups")
	private List<VersionGroupsItem> versionGroups;

	@SerializedName("name")
	private String name;

	@SerializedName("locations")
	private List<LocationsItem> locations;

	@SerializedName("id")
	private int id;

	public MainGeneration getMainGeneration(){
		return mainGeneration;
	}

	public List<NamesItem> getNames(){
		return names;
	}

	public List<PokedexesItem> getPokedexes(){
		return pokedexes;
	}

	public List<VersionGroupsItem> getVersionGroups(){
		return versionGroups;
	}

	public String getName(){
		return name;
	}

	public List<LocationsItem> getLocations(){
		return locations;
	}

	public int getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"RegionErgebnis{" + 
			"main_generation = '" + mainGeneration + '\'' + 
			",names = '" + names + '\'' + 
			",pokedexes = '" + pokedexes + '\'' + 
			",version_groups = '" + versionGroups + '\'' + 
			",name = '" + name + '\'' + 
			",locations = '" + locations + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}