package COLLECTION;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashsetexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<String>Countrylist=new TreeSet<String>();
		Countrylist.add("9");
		Countrylist.add("7");
		Countrylist.add("8");
		Countrylist.add("1");
		Countrylist.add("3");
		for(String Counter:Countrylist)
		{
			System.out.println(Counter);
		}
	}
		

}
