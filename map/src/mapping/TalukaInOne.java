package mapping;

public class TalukaInOne {

	private String countryName;
	private String stateName;
	private String districtName;
	private String talukaName;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getTalukaName() {
		return talukaName;
	}
	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}
	@Override
	public String toString() {
		return "TalukaInOne [countryName=" + countryName + ", stateName=" + stateName + ", districtName=" + districtName
				+ ", talukaName=" + talukaName + "]";
	}
	
	
}
