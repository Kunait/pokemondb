package Model;

import com.google.gson.annotations.SerializedName;

public class VersionGroupsItem{

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
			"VersionGroupsItem{" + 
			"name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}