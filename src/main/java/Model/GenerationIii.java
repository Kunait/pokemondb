package Model;

import com.google.gson.annotations.SerializedName;

public class GenerationIii{

	@SerializedName("firered-leafgreen")
	private FireredLeafgreen fireredLeafgreen;

	@SerializedName("ruby-sapphire")
	private RubySapphire rubySapphire;

	@SerializedName("emerald")
	private Emerald emerald;

	public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen){
		this.fireredLeafgreen = fireredLeafgreen;
	}

	public FireredLeafgreen getFireredLeafgreen(){
		return fireredLeafgreen;
	}

	public void setRubySapphire(RubySapphire rubySapphire){
		this.rubySapphire = rubySapphire;
	}

	public RubySapphire getRubySapphire(){
		return rubySapphire;
	}

	public void setEmerald(Emerald emerald){
		this.emerald = emerald;
	}

	public Emerald getEmerald(){
		return emerald;
	}

	@Override
 	public String toString(){
		return 
			"GenerationIii{" + 
			"firered-leafgreen = '" + fireredLeafgreen + '\'' + 
			",ruby-sapphire = '" + rubySapphire + '\'' + 
			",emerald = '" + emerald + '\'' + 
			"}";
		}
}