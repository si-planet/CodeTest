package com.answersheet;

import java.io.*;
import java.util.*;
public class Test10814_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result[];
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		result = new String[N];
		
		for (int i=0; i<N; i++)
			result[i] = br.readLine();
		
		Arrays.sort(result, new Comparator<String>()
		{
			@Override
			public int compare(String str1, String str2) 
			{
				StringTokenizer st1 = new StringTokenizer(str1, " ");
				StringTokenizer st2 = new StringTokenizer(str2, " ");
				
				return ( Integer.parseInt(st1.nextToken()) ) - ( Integer.parseInt(st2.nextToken()) ) ;
				
			};
		});
		
		for (int i=0; i<result.length; i++)
			sb.append(result[i]).append("\n");

		System.out.println(sb);
		
	}// end main()

}
