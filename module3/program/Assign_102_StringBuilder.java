package module3.program;

public class Assign_102_StringBuilder 
{
  public static void main(String[] args) 
{
	  StringBuilder s2 = new StringBuilder("Automation");

      // insert()
      System.out.println("After insert: " + s2.insert(0, "Selenium "));

      // replace()
      s2.replace(0, 8, "Testing");
      System.out.println("After replace: " + s2);

      // substring(start)
      System.out.println("Substring(0): " + s2.substring(0));

      // substring(start,end)
      System.out.println("Substring(0,5): " + s2.substring(0,5));

      // length()
      System.out.println("Length: " + s2.length());

      // capacity()
      System.out.println("Capacity: " + s2.capacity());

      // delete()
      s2.delete(0,7);
      System.out.println("After delete: " + s2);

      // charAt()
      System.out.println("Character at index 0: " + s2.charAt(3));
      
      // reverse()
      s2.reverse();
      System.out.println("After reverse: " + s2);
}
}
