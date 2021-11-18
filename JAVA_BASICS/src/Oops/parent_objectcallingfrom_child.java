package Oops;

public class parent_objectcallingfrom_child 
{
	public void calculate_Sum ()
	{
		int a=10,b=6,c;
		c=a+b;
		System.out.println("sum of two numbers is "+c);

	}
	//accessmodifire(public) static/nonstatic returntype(void/int) methodname()
	public void justtodisplay()
		{
			System.out.println("Hello world");
		}
	
	public static void calculate_Difference (int a,int b)
			{
				int c;
				c=a-b;
				System.out.println("Difference of the two number is "+c);
		
			}
	public void calculate_multiply (int a,int b)
				{
					int c;
					c=a*b;
					System.out.println("Multiply of the two number is "+c);
				}
	
}
