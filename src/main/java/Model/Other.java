package Model;

import com.google.gson.annotations.SerializedName;

public class Other{

	@SerializedName("dream_world")
	private DreamWorld dreamWorld;

	@SerializedName("official-artwork")
	private OfficialArtwork officialArtwork;

	@SerializedName("home")
	private Home home;

	public void setDreamWorld(DreamWorld dreamWorld){
		this.dreamWorld = dreamWorld;
	}

	public DreamWorld getDreamWorld(){
		return dreamWorld;
	}

	public void setOfficialArtwork(OfficialArtwork officialArtwork){
		this.officialArtwork = officialArtwork;
	}

	public OfficialArtwork getOfficialArtwork(){
		return officialArtwork;
	}

	public void setHome(Home home){
		this.home = home;
	}

	public Home getHome(){
		return home;
	}

	@Override
 	public String toString(){
		return 
			"Other{" + 
			"dream_world = '" + dreamWorld + '\'' + 
			",official-artwork = '" + officialArtwork + '\'' + 
			",home = '" + home + '\'' + 
			"}";
		}
}