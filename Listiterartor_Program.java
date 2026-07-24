package javaexercises.program;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterartor_Program 
{
	public static void main(String[] args) {
		
	ArrayList <String> list = new ArrayList<>();
	
	list.add("Java");
	list.add("Selenium");
	list.add("Automation");
	list.add("Testing");
	
	ListIterator <String> li = list.listIterator();
	
	System.out.println("Forward Iteration : \n");
	
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	System.out.println("\nBackword Iteration : \n");
	
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}	
}
}
