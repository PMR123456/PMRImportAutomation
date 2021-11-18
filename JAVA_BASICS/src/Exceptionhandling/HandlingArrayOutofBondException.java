package Exceptionhandling;

public class HandlingArrayOutofBondException 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] rollno=new int[5];
		try{
		for (int j=0;j<=5;j++)
		{
			rollno[j]=j+1;
		}
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("j is less than or equal to 5");
		}
		finally
		{
			System.out.println("log out");
		}
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println("Hello World");
	}
	

}
