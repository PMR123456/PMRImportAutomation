package ARRAYS;

public class singledimensionalarray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*int[] rollno=new int[5];
		rollno[0]=1;
		rollno[1]=4;
		rollno[2]=7;
		rollno[3]=9;
		rollno[4]=10;*/
		/*int[] rollno={1,4,7,9,10};*/
		int[] rollno=new int[100];
		for (int j=0;j<100;j++)
		{
			rollno[j]=j+1;
		}
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}
				
	}

}
