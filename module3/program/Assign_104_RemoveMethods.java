package module3.program;
import java.util.ArrayList;
public class Assign_104_RemoveMethods 
{public static void main(String[] args) 
	{
		// Creating ArrayList
        ArrayList<String> al = new ArrayList<String>();
        // add()
        al.add("Java");
        al.add("Selenium");
        al.add("SQL");
        al.add("API");
        al.add("Manual Testing");
        System.out.println("Original ArrayList : " + al);
        // remove(Object o)
        al.remove("SQL");
        System.out.println("After remove(Object) : " + al);
        // remove(int index)
        al.remove(2);
        System.out.println("After remove(index) : " + al);
        // Creating another ArrayList
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Java");
        al2.add("Manual Testing");
        // removeAll()
        al.removeAll(al2);
        System.out.println("After removeAll() : " + al);

        // add elements again
        al.add("Python");
        al.add("C++");
        System.out.println("Before clear() : " + al);
        // clear()
        al.clear();
        System.out.println("After clear() : " + al);

	}

}
