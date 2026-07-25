package module2.program;
import module1.program.Assign_63_AccessspecMethod_otherpackage_A;
public class Assign_63_AccessspecMethod_otherpackage_B extends Assign_63_AccessspecMethod_otherpackage_A
{
public static void main(String[] args) 
{
	Assign_63_AccessspecMethod_otherpackage_B obj = new Assign_63_AccessspecMethod_otherpackage_B();
	obj.publicMethod();
	obj.protectedMethod();
	//obj.defaultMethod();// ❌ Not accessible defaultMethod
	//obj.privateMethod(); ❌ Not accessible Private method
}
}
