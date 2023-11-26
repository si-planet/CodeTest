package com.answersheet;

import java.io.*;
public class Test1259
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while (!(str = br.readLine()).equals("0"))
		{
			int arr[] = new int[str.length()];
			for (int i=0; i<arr.length; i++)
				arr[i] = str.charAt(i);
			
			System.out.println(search(arr));
		}
	}
	
	static String search(int[] arr)
	{
		String result = "yes";
		
		for (int i=0; i<(arr.length/2); i++)
		{
			for (int j=(arr.length-i-1); j<(arr.length-i); j++)
			{
				if (arr[i]!=arr[j])
					return result = "no";
			}
		}
		
		return result;
	}

}
