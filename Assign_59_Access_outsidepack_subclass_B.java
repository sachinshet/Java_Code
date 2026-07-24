package module2.program;

import module1.program.Assign_59_Access_outsidepack_subclass;

public class Assign_59_Access_outsidepack_subclass_B extends Assign_59_Access_outsidepack_subclass
{
	public static void main(String[] args) 
	{
		System.out.println(Assign_59_Access_outsidepack_subclass.a);
		System.out.println(Assign_59_Access_outsidepack_subclass.b);
		// System.out.println(Assign_59_Access_outsidepack_subclass.c);  // ❌ default not accessible
        // System.out.println(Assign_59_Access_outsidepack_subclass.d);  // ❌ private not accessible
		
		Assign_59_Access_outsidepack_subclass_B obj = new Assign_59_Access_outsidepack_subclass_B();
		System.out.println(obj.a1);
		System.out.println(obj.b1);
		// System.out.println(obj.c1);  // ❌ default not accessible
        // System.out.println(obj.d1);  // ❌ private not accessible
	}
}
