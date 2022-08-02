package Model;

import com.google.gson.annotations.SerializedName;

public class Yellow{

	@SerializedName("front_gray")
	private String frontGray;

	@SerializedName("back_transparent")
	private String backTransparent;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("back_gray")
	private String backGray;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("front_transparent")
	private String frontTransparent;

	public void setFrontGray(String frontGray){
		this.frontGray = frontGray;
	}

	public String getFrontGray(){
		return frontGray;
	}

	public void setBackTransparent(String backTransparent){
		this.backTransparent = backTransparent;
	}

	public String getBackTransparent(){
		return backTransparent;
	}

	public void setBackDefault(String backDefault){
		this.backDefault = backDefault;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public void setBackGray(String backGray){
		this.backGray = backGray;
	}

	public String getBackGray(){
		return backGray;
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

	@Override
 	public String toString(){
		return 
			"Yellow{" + 
			"front_gray = '" + frontGray + '\'' + 
			",back_transparent = '" + backTransparent + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",back_gray = '" + backGray + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			"}";
		}
}