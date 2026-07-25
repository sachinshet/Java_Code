package module3.program;

import java.util.Arrays;

public class Anagram_prog 
{

	public static void main(String[] args) 
	{
	   String str1 ="silent";
	   String str2 ="listen";
	   
	   str1 = str1.toLowerCase();
	   str2 = str2.toLowerCase();
	   
	   if(str1.length() != str2.length())
	   {
		   System.out.println("this is not anagram");
	   }
	   
	   else
	   {
		   char [] arr1 = str1.toCharArray();
		   char [] arr2 = str2.toCharArray();
		   
		   Arrays.sort(arr1);
		   Arrays.sort(arr2);
		   
		   if (Arrays.equals(arr1,arr2))
		   {
			   System.out.println("this is anagram");
		   }
		   else
		   {
			   System.out.println("this is not anagram");
		   }
		   
	   }
	   
	}
	
}
