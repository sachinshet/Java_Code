package module3.program;
import java.util.ArrayList;
public class Assign_105_ArrayListMethodsDemo 
{
	public static void main(String[] args) 
	{
		// Creating ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // Adding elements
        al.add("Java");
        al.add("Selenium");
        al.add("SQL");
        al.add("API Testing");

        // Printing ArrayList
        System.out.println("ArrayList Elements : " + al);

        // size()
        System.out.println("Size of ArrayList : " + al.size());

        // get()
        System.out.println("Element at index 2 : " + al.get(2));

        // contains()
        System.out.println("Contains Selenium ? " + al.contains("Selenium"));

        System.out.println("Contains Python ? " + al.contains("Python"));
		
	}

}
