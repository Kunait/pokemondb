package Model;

import com.google.gson.annotations.SerializedName;

public class Icons{

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_female")
	private Object frontFemale;

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public void setFrontFemale(Object frontFemale){
		this.frontFemale = frontFemale;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	@Override
 	public String toString(){
		return 
			"Icons{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			"}";
		}
}