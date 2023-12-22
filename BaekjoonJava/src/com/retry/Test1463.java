package com.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1463
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		System.out.println(makeOne(N, 0));
	}
	
	private static int makeOne(int N, int count)
	{
		if (N < 2)
			return count;
		
		return Math.min(makeOne(N/3, count + 1 + (N%3)),  makeOne(N/2, count + 1 + (N%2)));
	}

}
