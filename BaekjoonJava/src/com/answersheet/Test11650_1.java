package com.answersheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;
public class Test11650_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		String[] arr = new String[n];
		for (int i=0; i<arr.length; i++)
			arr[i] = br.readLine();
		
		Arrays.sort(arr, new Comparator<String>()
		{
			StringTokenizer st1;
			StringTokenizer st2;
			
			@Override
			public int compare(String str1, String str2) 
			{
				st1 = new StringTokenizer(str1, " ");
				st2 = new StringTokenizer(str2, " ");
				
				int temp1, temp2;

				temp1 = Integer.parseInt(st1.nextToken()); 
				temp2 = Integer.parseInt(st2.nextToken());
				if ( temp1 == temp2 )
				{
					temp1 = Integer.parseInt(st1.nextToken());
					temp2 = Integer.parseInt(st2.nextToken());
					
					return temp1 - temp2;
				}

				return temp1 - temp2;
			};	//end compare()
		});	//end Arrays.sort();
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length; i++)
			sb.append(arr[i]).append("\n");
		
		System.out.println(sb);
		
	}// end main()

}
