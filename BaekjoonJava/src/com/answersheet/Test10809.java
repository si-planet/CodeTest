package com.answersheet;

import java.io.*;
public class Test10809
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int[] arr = new int[26];
		
		for (int i=0; i< arr.length; i++)
			arr[i] = -1;
		
		for (int i=0; i<word.length(); i++)
		{
			if (arr[word.charAt(i)-'a'] != -1)
				continue;

			arr[word.charAt(i)-'a'] = i;
		}
		
		for (int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
			
	}

}
