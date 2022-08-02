package Model;

import com.google.gson.annotations.SerializedName;

public class Emerald{

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_shiny")
	private String frontShiny;

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public void setFrontShiny(String frontShiny){
		this.frontShiny = frontShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"Emerald{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}