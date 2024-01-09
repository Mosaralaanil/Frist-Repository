package javaconcept;

abstract class Tests
{
// Declaration of the instance method
	void msg1()
	{
		System.out.println("msg1-Hello");
	}
	abstract void msg2();// abstract method
}
public class Abstraction1 extends Tests
{

	void msg2() 
{		
		System.out.println("msg2-Test");
}
	public static void main(String[]args)
	{	
		// Creating object of subclass Test
		Abstraction1 obj = new Abstraction1();
		obj.msg1();
		obj.msg2();
	}
}