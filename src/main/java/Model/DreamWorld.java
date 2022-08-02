package Model;

import com.google.gson.annotations.SerializedName;

public class DreamWorld{

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
			"DreamWorld{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			"}";
		}
}