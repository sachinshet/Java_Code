package module3.program;
import java.util.ArrayList;
public class Assign_103_ArrayListMethods 
{public static void main(String[] args) 
	{
	// Creating first ArrayList
    ArrayList<String> al1 = new ArrayList<String>();
    // add()
    al1.add("Java");
    al1.add("Selenium");
    al1.add("SQL");
    System.out.println("ArrayList 1 : " + al1);
    // Creating second ArrayList
    ArrayList<String> al2 = new ArrayList<String>();
    al2.add("Manual Testing");
    al2.add("API Testing");
    System.out.println("ArrayList 2 : " + al2);
    // addAll()
    al1.addAll(al2);
    System.out.println("After addAll() : " + al1);
    // size()
    System.out.println("Size of ArrayList : " + al1.size());
    // get()
    System.out.println("Element at index 2 : " + al1.get(2));
    // contains()
    System.out.println("Contains Selenium ? " + al1.contains("Selenium"));
    // containsAll()
    System.out.println("Contains All Elements of al2 ? " + al1.containsAll(al2));
    // isEmpty()
    System.out.println("Is ArrayList Empty ? " + al1.isEmpty());
    // equals()
    System.out.println("al1 equals al2 ? " + al1.equals(al2));
    // remove()
    al1.remove("SQL");
    System.out.println("After remove() : " + al1);
    // removeAll()
    al1.removeAll(al2);
    System.out.println("After removeAll() : " + al1);
	
	}

}
