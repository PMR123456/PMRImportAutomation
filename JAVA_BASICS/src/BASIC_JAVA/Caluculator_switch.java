package BASIC_JAVA;

public class Caluculator_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10,b=5,s;
	String op="&";
	switch(op){
	case "+" :
		s=a+b;
		System.out.println("sum is "+s);
		break;
	case "-" :
		s=a-b;
		System.out.println("minus is "+s);
		break;
	case "*" :
		s=a*b;
		System.out.println("multiply is "+s);
		break;
	case "/" :
		s=a/b;
		System.out.println("Division is "+s);
		break;
	default :
		System.out.println("unknown operator");
		break;
	}
	}

}
