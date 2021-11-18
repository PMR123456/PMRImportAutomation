package Abstraction;

public abstract class mobile_abstract 
{
	public void backcamera()
		{
		System.out.println("Back camera_50MP");	
		}
	public void frontcamera()
	{
	System.out.println("front camera_25MP");	
	}
	public void backflash()
	{
	System.out.println("Back flash");
	}
	public abstract void frontflash();
	
}
