package Oops;

public class child_objectfrom_childtoparent 
{

	public static void main(String[] args) 
	{
		//classname objectname=new classname();
		parent_objectcallingfrom_child obj=new parent_objectcallingfrom_child();
		obj.calculate_Sum();
		obj.justtodisplay();
		parent_objectcallingfrom_child.calculate_Difference(4,5);
		obj.calculate_multiply(50,5);
	}

}
