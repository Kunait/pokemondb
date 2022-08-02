package Model;

import com.google.gson.annotations.SerializedName;

public class GenerationViii{

	@SerializedName("icons")
	private Icons icons;

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	@Override
 	public String toString(){
		return 
			"GenerationViii{" + 
			"icons = '" + icons + '\'' + 
			"}";
		}
}