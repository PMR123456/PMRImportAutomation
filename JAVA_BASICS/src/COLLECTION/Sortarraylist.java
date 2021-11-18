package COLLECTION;
import java.util.ArrayList;
import java.util.Collections;


public class Sortarraylist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> listofcountries=new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("AUS");
		listofcountries.add("SRILANKA");
		listofcountries.add("NEPAL");
		listofcountries.add("AMERICA");
		for(String Declare:listofcountries)
		{
			System.out.println(Declare);
		}
		Collections.sort(listofcountries);
		System.out.println("values after sorting" );
		
		for(String Declare:listofcountries)
		{
			System.out.println(Declare);
		}
	}
	

}
