package mapping;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {

	public static void main(String[] args) 
	{
         IdentityHashMap ihm=new IdentityHashMap();
         ihm.put("1", "abc");
         ihm.put(new String("1"),"abc");//reference
         System.out.println(ihm);
	}

}
