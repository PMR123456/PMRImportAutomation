package COLLECTION;

import java.util.HashMap;

public class Hashmapexample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String,String>Animals=new HashMap<String,String>();
		Animals.put("Pet1","Dog");
		Animals.put("Pet2","Cat");
		Animals.put("Pet3","Lion");
		Animals.put("Pet4","Crow");
		Animals.put("Pet5","Tiger");
		System.out.println(Animals);
		System.out.println(Animals.get("Pet3"));
		System.out.println(Animals.get("Pet5"));
		for(String Animalsone:Animals.values())
		{
			System.out.println(Animalsone);
		}
		for (String Animalsone:Animals.keySet())
		{
			System.out.println(Animalsone);
		}
	}

}
