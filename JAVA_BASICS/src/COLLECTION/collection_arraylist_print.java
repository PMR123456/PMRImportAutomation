package COLLECTION;

import java.util.ArrayList;

public class collection_arraylist_print 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<>();
		alist.add("ONE");
		alist.add("TWO");
		alist.add("THREE");
		alist.add("FOUR");
		alist.add("FIVE");
		System.out.println(alist);
		
		ArrayList<Integer> NOLIST=new ArrayList<>();
		NOLIST.add(1);
		NOLIST.add(2);
		NOLIST.add(3);
		NOLIST.add(4);
		NOLIST.add(5);
		System.out.println(NOLIST);
		
		alist.add(3, "TEN");
		System.out.println(alist);
		
		NOLIST.add(4, 100);
		System.out.println(NOLIST);
		
		NOLIST.remove(2);
		System.out.println(NOLIST);
		
		alist.remove("THREE");
		System.out.println(alist);
		
		alist.set(1, "seven");
		System.out.println(alist);
		
		NOLIST.set(2, 999);
		System.out.println(NOLIST);
		
		System.out.println("size of alist is"+alist.size());
		System.out.println("size of NOLIST is"+NOLIST.size());
		
		if (alist.contains("ONE"))
		{
			System.out.println("element found");
		}
		else 
		{
			System.out.println("element not found");
		}
	}
	

}
