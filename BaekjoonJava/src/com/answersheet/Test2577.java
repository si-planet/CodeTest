package com.answersheet;

import java.io.*;
public class Test2577
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, c;
		int[] arr = new int[10]; // 0~9
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		c = Integer.parseInt(br.readLine());
		
		String str = String.valueOf(a*b*c);
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<str.length(); i++)
			arr[str.charAt(i)-'0']++;
		
		for (int i : arr)
			sb.append(i).append("\n");
		
		System.out.println(sb);
	}

}
