package mapping;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args)
	{
		Country c=new Country();
		c.setCname("India");
		
	
		
		/*HashMap hm=new HashMap();
		hm.put(c, "Maharastra");
		
		c=null;
		System.gc();
		System.out.println(hm);*/
		
		WeakHashMap whm=new WeakHashMap();
		whm.put(c, "MAharastra");
		
		c=null;//object become null;
		System.gc();
		System.out.println(whm);
	}

}
