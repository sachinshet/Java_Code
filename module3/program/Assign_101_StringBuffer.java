package module3.program;

public class Assign_101_StringBuffer 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Java");
		
        System.out.println("length() : "+sb.length());
		
		System.out.println("capacity() : "+sb.capacity());
		
		StringBuffer s1 = sb.append(" Programming");
		System.out.println("append() : "+s1);
		
		StringBuffer s2 =sb.insert(5, "Core ");
		System.out.println("insert() : "+s2);
		
		StringBuffer s3 =sb.replace(5, 9, "Advanced");
		System.out.println("replace() : "+s3);
		
		StringBuffer s4 =sb.reverse();
		System.out.println("reverse 1() : "+s4);
		
		StringBuffer s5 =sb.reverse();
		System.out.println("reverse 2() : "+s5);
		
		System.out.println("After deleting : "+s5.delete(5, 14));
		
		
	}

}
