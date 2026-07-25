package module2.program;

import module1.program.Assign_60_AccessSpe_outsidepack_a;

public class Assign_60_AccessSpe_outsidepack_B 
{
   public static void main(String[] args) 
{
  System.out.println(Assign_60_AccessSpe_outsidepack_a.a);
	
  Assign_60_AccessSpe_outsidepack_a obj = new Assign_60_AccessSpe_outsidepack_a();
  System.out.println(obj.a1);
	//System.out.println(obj.b1); // ❌ protected not accessible
	//System.out.println(obj.c1); // ❌ default not accessible
	//System.out.println(obj.d1);// ❌ private not accessible
}
}
