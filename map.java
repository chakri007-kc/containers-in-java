import java.util.*;
import java.util.Map.Entry;
public class map {
	public static void main(String args[])
	{
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		m.put(10,"hii");
		m.put(5, "Hello");
		m.put(15, "Hey");
		System.out.println(m + " "+ m.size());
		 if(m.containsKey(5))
		 {
			 System.out.println(m.get(5));
		 }
		 m.put(10, "hey baby");//changing elements
		 m.remove(15);//remove
		 System.out.println(m);
		 //traversal in HashMap
		 for(Entry<Integer,String> e: m.entrySet())
		 {
			 System.out.println(e.getKey()+" "+e.getValue());
		 }
	}
}

