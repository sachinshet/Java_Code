package javaexercises.program;

import java.util.Arrays;

public class Anagram_Program 
{


	public static void main(String[] args)
	{
	String str1 = "Listen";
	String str2 = "silent";
	// convert strings to lowercase
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();

	if(str1.length() != str2.length())
	{
	System.out.println("Not an Anagram");
	}
	else {
	// convert string to char array
	char arr1[] = str1.toCharArray();
	char arr2[] = str2.toCharArray();

	// sort both arrays
	Arrays.sort(arr1);
	Arrays.sort(arr2);

	// compare arrays
	if(Arrays.equals(arr1, arr2)) {
	System.out.println("Strings are Anagram");
	} else {
	System.out.println("Strings are Not Anagram");
	}
	}
	}
	
}