package mapping;

public class InOneEcample {

	public static void main(String[] args) {
		
		TalukaInOne t=new TalukaInOne();
		
		t.setCountryName("India");
	
		t.setStateName("Maharashtra");
		
		t.setDistrictName("Yawatmal");
		
		t.setTalukaName("Maregaon");
		
		System.out.println(t.getCountryName());
		System.out.println(t.getStateName());
		System.out.println(t.getDistrictName());
		System.out.println(t.getTalukaName());
 }

}
