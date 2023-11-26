package com.answersheet;

import java.io.*;
public class Test3052
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		int cnt = 0;
		
		for (int i=0; i<10; i++)
		{
			int temp = Integer.parseInt(br.readLine()) % 42;
			arr[temp]++; 
		}
		
		for (int i=0; i<arr.length; i++)
			if (arr[i]!=0)
				cnt++;
		
		System.out.println(cnt);
	}

}
