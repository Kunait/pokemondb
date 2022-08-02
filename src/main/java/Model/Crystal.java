package Model;

import com.google.gson.annotations.SerializedName;

public class Crystal{

	@SerializedName("back_transparent")
	private String backTransparent;

	@SerializedName("back_shiny_transparent")
	private String backShinyTransparent;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_transparent")
	private String frontTransparent;

	@SerializedName("front_shiny_transparent")
	private String frontShinyTransparent;

	@SerializedName("back_shiny")
	private String backShiny;

	@SerializedName("front_shiny")
	private String frontShiny;

	public void setBackTransparent(String backTransparent){
		this.backTransparent = backTransparent;
	}

	public String getBackTransparent(){
		return backTransparent;
	}

	public void setBackShinyTransparent(String backShinyTransparent){
		this.backShinyTransparent = backShinyTransparent;
	}

	public String getBackShinyTransparent(){
		return backShinyTransparent;
	}

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

	public void setFrontShinyTransparent(String frontShinyTransparent){
		this.frontShinyTransparent = frontShinyTransparent;
	}

	public String getFrontShinyTransparent(){
		return frontShinyTransparent;
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
			"Crystal{" + 
			"back_transparent = '" + backTransparent + '\'' + 
			",back_shiny_transparent = '" + backShinyTransparent + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			",front_shiny_transparent = '" + frontShinyTransparent + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}