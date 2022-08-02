package Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EncounterMethodRatesItem{

	@SerializedName("version_details")
	private List<VersionDetailsItem> versionDetails;

	@SerializedName("encounter_method")
	private EncounterMethod encounterMethod;

	public List<VersionDetailsItem> getVersionDetails(){
		return versionDetails;
	}

	public EncounterMethod getEncounterMethod(){
		return encounterMethod;
	}

	@Override
 	public String toString(){
		return 
			"EncounterMethodRatesItem{" + 
			"version_details = '" + versionDetails + '\'' + 
			",encounter_method = '" + encounterMethod + '\'' + 
			"}";
		}
}