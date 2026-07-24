package javaexercises.program;

public class This_Constructor_Program 
{
	This_Constructor_Program()
	{
		this(10);
		System.out.println("\nDefault constructor : ");
	}
	
	This_Constructor_Program(int a)
	{
		this(15,20);
		System.out.println("single parameter constructor : "+a);
	}
	
	This_Constructor_Program(int b, int c)
	{
		System.out.println("two parameters constructor : "+ b+" , " + c +"\n");
	}
	
 public static void main(String[] args) 
 {
	 new This_Constructor_Program(); 
}
}
