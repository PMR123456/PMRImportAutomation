package COLLECTION;

import java.util.LinkedList;

public class linkedlistsampleprogramme 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<String> ListofAnimals=new LinkedList<String>();
		ListofAnimals.add("Cow");
		ListofAnimals.add("Ant");
		ListofAnimals.add("DOG");
		ListofAnimals.add("GOAT");
		ListofAnimals.add("BEAR");
		//System.out.println(ListofAnimals);
		
		for(String jungle:ListofAnimals)
		{
			System.out.println(jungle);
		}
	}
	

}
