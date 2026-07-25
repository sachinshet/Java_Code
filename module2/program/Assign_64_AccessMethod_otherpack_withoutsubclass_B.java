package module2.program;
import module1.program.Assign_64_AccessMethod_otherpack_withoutsubclass_A;
public class Assign_64_AccessMethod_otherpack_withoutsubclass_B 
{
public static void main(String[] args) 
{
	Assign_64_AccessMethod_otherpack_withoutsubclass_A obj = new Assign_64_AccessMethod_otherpack_withoutsubclass_A();
	obj.publicMethod();
	//obj.protectedMethod(); ❌ Not accessible protectedMethod
	//obj.defaultMethod();// ❌ Not accessible defaultMethod
	//obj.privateMethod();   ❌ Not accessible Private method
}
}
