package Model;

import com.google.gson.annotations.SerializedName;

public class PokedexesItem{

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"PokedexesItem{" + 
			"name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}