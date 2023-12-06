package com.answersheet;

import java.io.*;
import java.util.*;
public class Test10816_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[20000001];
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i=0; i<N; i++)
			arr[Integer.parseInt(st.nextToken()) + 10000000]++;
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens())
			sb.append(arr[Integer.parseInt(st.nextToken())+10000000] + " ");

		System.out.println(sb);
	}

}
