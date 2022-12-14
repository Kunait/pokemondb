package Model;

import com.google.gson.annotations.SerializedName;

public class BlackWhite{

	@SerializedName("back_shiny_female")
	private Object backShinyFemale;

	@SerializedName("back_female")
	private Object backFemale;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("front_shiny_female")
	private Object frontShinyFemale;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("animated")
	private Animated animated;

	@SerializedName("front_female")
	private Object frontFemale;

	@SerializedName("back_shiny")
	private String backShiny;

	@SerializedName("front_shiny")
	private String frontShiny;

	public void setBackShinyFemale(Object backShinyFemale){
		this.backShinyFemale = backShinyFemale;
	}

	public Object getBackShinyFemale(){
		return backShinyFemale;
	}

	public void setBackFemale(Object backFemale){
		this.backFemale = backFemale;
	}

	public Object getBackFemale(){
		return backFemale;
	}

	public void setBackDefault(String backDefault){
		this.backDefault = backDefault;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public void setFrontShinyFemale(Object frontShinyFemale){
		this.frontShinyFemale = frontShinyFemale;
	}

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public void setAnimated(Animated animated){
		this.animated = animated;
	}

	public Animated getAnimated(){
		return animated;
	}

	public void setFrontFemale(Object frontFemale){
		this.frontFemale = frontFemale;
	}

	public Object getFrontFemale(){
		return frontFemale;
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
			"BlackWhite{" + 
			"back_shiny_female = '" + backShinyFemale + '\'' + 
			",back_female = '" + backFemale + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_shiny_female = '" + frontShinyFemale + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",animated = '" + animated + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}