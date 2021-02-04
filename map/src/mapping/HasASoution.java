package mapping;

public class HasASoution {

	public static void main(String[] args)
	{
		Country c=new Country();
		c.setCname("India");
		
		State s=new State();
		s.setsName("Maharashtra");
		s.setCountry(c);
		
		District d=new District();
		d.setDname("Yavatmal");
		d.setState(s);
		
		Taluka t=new Taluka();
		t.setTname("Wani");
		t.setDistrict(d);
		
		System.out.println(s.getCountry().getCname());
		System.out.println(d.getState().getsName());
		System.out.println(t.getDistrict().getDname());
		System.out.println(t.getTname());
		
	}	

}
