package com.test;

import java.io.*;
public class Test2439
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		/*
		for (int i=1; i<=num; i++)
		{
			for (int j=0; j<num-i; j++)
				System.out.print(" ");
			for (int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		*/
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <=num; i++)
		{
			for (int j=0; j<num-i; j++)
				sb.append(" ");
			for (int j=0; j<i; j++)
				sb.append("*");
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
