package Exceptionhandling;

public class ArithamaticExceptionHandling 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10,b=2,c=0;
		
		try 
		{c=a/b;
		}catch(ArithmeticException e)
		{
			System.out.println("divided by zero not possible");
		}
		System.out.println(c);
		System.out.println("Hello World");
		}
	
	

}
