package javaexercises.program;

import java.util.HashMap;

public class Frequency_Of_String
{
	public static void main(String[] args) 
	{
		String str = "automation";
		
		HashMap <Character,Integer> map = new HashMap<>();
		
		for(char ch:str.toCharArray())
		{
			if (map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			
			else
			{
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
	}

}
