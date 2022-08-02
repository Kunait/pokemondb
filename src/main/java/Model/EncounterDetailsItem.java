package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EncounterDetailsItem{

	@SerializedName("condition_values")
	private List<Object> conditionValues;

	@SerializedName("chance")
	private int chance;

	@SerializedName("method")
	private Method method;

	@SerializedName("max_level")
	private int maxLevel;

	@SerializedName("min_level")
	private int minLevel;

	public List<Object> getConditionValues(){
		return conditionValues;
	}

	public int getChance(){
		return chance;
	}

	public Method getMethod(){
		return method;
	}

	public int getMaxLevel(){
		return maxLevel;
	}

	public int getMinLevel(){
		return minLevel;
	}

	@Override
 	public String toString(){
		return 
			"EncounterDetailsItem{" + 
			"condition_values = '" + conditionValues + '\'' + 
			",chance = '" + chance + '\'' + 
			",method = '" + method + '\'' + 
			",max_level = '" + maxLevel + '\'' + 
			",min_level = '" + minLevel + '\'' + 
			"}";
		}
}