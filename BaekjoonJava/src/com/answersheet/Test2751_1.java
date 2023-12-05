package com.answersheet;

import java.io.*;
import java.util.Arrays;
public class Test2751_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for (int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);	// 정렬
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length; i++)
			sb.append(arr[i] + "\n");
		
		System.out.println(sb);
	}

}
