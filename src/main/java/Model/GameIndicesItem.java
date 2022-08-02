package Model;

import com.google.gson.annotations.SerializedName;

public class GameIndicesItem{

	@SerializedName("generation")
	private Generation generation;

	@SerializedName("game_index")
	private int gameIndex;


	@SerializedName("version")
	private Version version;

	public Generation getGeneration(){
		return generation;
	}

	public int getGameIndex(){
		return gameIndex;
	}

	@Override
 	public String toString(){
		return 
			"GameIndicesItem{" + 
			"generation = '" + generation + '\'' + 
			",game_index = '" + gameIndex + '\'' + 
			"}";
		}

	public void setVersion(Version version){
		this.version = version;
	}

	public Version getVersion(){
		return version;
	}
}