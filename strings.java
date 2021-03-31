import java.util.*;
public class stringNew {
	public static void main(String args[])
	{
		String k="chakradhar";
		if(k.isEmpty())
		{
			System.out.println("hi");
		}
		char a= k.charAt(1);
		System.out.println(a);
		char p[]=k.toCharArray();
//		s = Arrays.copyOf(s, j);
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]+" ");
		}
		System.out.println((int)p[5]);
		char c[]=new char [5];
		k.getChars(0, 5, c, 0);
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		int f=Arrays.binarySearch(c, 'h');
		System.out.println(f);
		byte b[]=k.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println(k.toUpperCase());
		System.out.println(k.startsWith("c"));
		System.out.println(k.indexOf('a',2));
		System.out.println(k.substring(3));
		System.out.println(k.substring(3,5));
		String s="hii whatsup 5 6 6 6 5";
		System.out.println(k.concat(" bro"));		
		System.out.println(s.matches("hii"));
		String data[]=s.split(" ",2);
		System.out.println(Arrays.toString(data));
		System.out.println(String.join(",", "A","B","C"));
		String r="  heeeeeeeey  ";
		System.out.println(r.trim());
		System.out.println(r.replace('e','f'));
		int a1=50,b1=10;
		String z=String.valueOf(a1);
		System.out.println(z+b1);
		System.out.println(Integer.parseInt("1010",2));
		System.out.println(Integer.toBinaryString(14));
		System.out.println(Math.max(10,50));
	}
}
