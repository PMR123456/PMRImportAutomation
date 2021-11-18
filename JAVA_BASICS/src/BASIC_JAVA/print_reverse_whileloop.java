package BASIC_JAVA;

public class print_reverse_whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int reverse=0,n=7896,rem=0;
	while (n!=0)
	{
		rem=n%10;
		reverse= (reverse*10)+rem;
		n=n/10;
	}
	System.out.println(reverse);
		}

}
