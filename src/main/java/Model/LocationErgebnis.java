package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LocationErgebnis{

	@SerializedName("game_indices")
	private List<GameIndicesItem> gameIndices;

	@SerializedName("names")
	private List<NamesItem> names;

	@SerializedName("name")
	private String name;

	@SerializedName("areas")
	private List<AreasItem> areas;

	@SerializedName("id")
	private int id;

	@SerializedName("region")
	private Region region;

	public List<GameIndicesItem> getGameIndices(){
		return gameIndices;
	}

	public List<NamesItem> getNames(){
		return names;
	}

	public String getName(){
		return name;
	}

	public List<AreasItem> getAreas(){
		return areas;
	}

	public int getId(){
		return id;
	}

	public Region getRegion(){
		return region;
	}

	@Override
 	public String toString(){
		return 
			"LocationErgebnis{" + 
			"game_indices = '" + gameIndices + '\'' + 
			",names = '" + names + '\'' + 
			",name = '" + name + '\'' + 
			",areas = '" + areas + '\'' + 
			",id = '" + id + '\'' + 
			",region = '" + region + '\'' + 
			"}";
		}
}