import java.util.*;
public class set {
	public static void main(String args[])
	{
		HashSet<Integer> s= new HashSet<Integer>();
		s.add(5);
		s.add(5);
		s.add(20);
		s.add(1);
		System.out.println(s);
		
		Set <Integer> a=new HashSet<Integer>();
		a.addAll(Arrays.asList( new Integer[] {1, 3, 2, 4, 8, 9, 0}));
		System.out.println(a);
		Set <Integer> b= new HashSet<Integer>();
		b.addAll(Arrays.asList( new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
		Set <Integer> union =new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union);
		Set <Integer> intersection= new HashSet<Integer> (a);
		intersection.retainAll(b);
		System.out.println(intersection);
		Set <Integer> diff=new HashSet<Integer>(a);
		diff.removeAll(b);
		System.out.println(diff);
		
		System.out.println(s.contains(5));
		a.remove(9);
		System.out.println(a);
		for(int i:b)
		{
			System.out.print(i+" ");
		}
	}
}
