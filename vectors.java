import java.util.*;
public class vectors {
	public static void main(String args[])
	{
		Vector<Integer> v= new Vector<Integer> ();
//		Vector v = new Vector();
		for(int i=0;i<5;i++)
		{
			v.add(i);
		}
		Vector<Integer> v1= new Vector<Integer>(v);
		List<Integer> v2= new ArrayList<Integer>();
		v2=v1.subList(1, 5);
 		v.remove(1);
		v.set(2, 20);//replacing element
		System.out.println(v);
		System.out.println(v.contains(4));//find 
		Collections.sort(v);
		System.out.println(v);
		System.out.println(v1.isEmpty());
		v.clear();
		for(int i=0;i<v2.size();i++)
		{
			System.out.print(v2.get(i)+ " ");
		}
		System.out.println("\n");
		v1.trimToSize();
		v1.setSize(10);//resize
		for(Integer i: v1)
		{
			System.out.print(i+" ");
		}
	}
}
