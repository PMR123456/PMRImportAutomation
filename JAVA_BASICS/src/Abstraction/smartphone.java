package Abstraction;

public class smartphone extends mobile_abstract
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		smartphone MA=new smartphone();
		MA.backcamera();
		MA.backflash();
		MA.frontcamera();
		MA.frontflash();
		
	}

	@Override
	public void frontflash() {
		// TODO Auto-generated method stub
		{
			System.out.println("frontflash");
		}
		
	}

}
