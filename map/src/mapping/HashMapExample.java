package mapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put(1,"School");
		hm.put("2", "college");//override with laptop
		hm.put(2,"bag");
		hm.put("2", "laptop");
		hm.put(3,"ZP");
		hm.put(4, "college");
		
		System.out.println(hm);
		
		Set s=hm.keySet();
		
		for(Object o:s)
		{
			System.out.println(s);//keys
		    Object o1=hm.get(o);
		    System.out.println(o1);//keys and values
		}
		
		System.out.println("===========Map.Entry============");
		Set s1=hm.entrySet();
		for(Object o2:s1)
		{
			Map.Entry me=(Map.Entry)o2;
			System.out.println(me);  //key value
		}
		
		
		/*System.out.println("Equality checking");
		HashMap mh=new HashMap();
		mh.put("1","Abc" );
		mh.put(new String("1"),"Abc" );
		System.out.println(mh);*/
	}

}
