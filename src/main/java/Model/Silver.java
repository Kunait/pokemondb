package Model;

import com.google.gson.annotations.SerializedName;

public class Silver{

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_transparent")
	private String frontTransparent;

	@SerializedName("back_shiny")
	private String backShiny;

	@SerializedName("front_shiny")
	private String frontShiny;

	public void setBackDefault(String backDefault){
		this.backDefault = backDefault;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public void setFrontTransparent(String frontTransparent){
		this.frontTransparent = frontTransparent;
	}

	public String getFrontTransparent(){
		return frontTransparent;
	}

	public void setBackShiny(String backShiny){
		this.backShiny = backShiny;
	}

	public String getBackShiny(){
		return backShiny;
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
			"Silver{" + 
			"back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}