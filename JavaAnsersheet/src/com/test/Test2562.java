package com.test;

import java.io.*;
public class Test2562
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[]  = new int[9];
		for (int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		int num=0, step=0;
		for (int i=0; i<arr.length; i++)
			if (arr[i]>num)
			{
				num = arr[i];
				step = i+1;		// index + 1 해야 순서
			}
		
		System.out.println(num);
		System.out.println(step);
	}

}
