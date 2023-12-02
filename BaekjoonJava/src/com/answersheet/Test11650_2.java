package com.answersheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.IOException;
public class Test11650_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int[][] arr = new int[n][2];
		StringTokenizer st;
		for (int i=0; i<arr.length; i++)
		{
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] arr1, int[] arr2) 
			{
				if (arr1[0] == arr2[0])
					return Integer.compare(arr1[1], arr2[2]);
				else
					return Integer.compare(arr1[0], arr2[0]);
				
			};	//end compare()
		});	//end Arrays.sort();
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length; i++)
			sb.append(arr[i][0]+ " " +arr[i][1] + "\n");
		
		System.out.println(sb);
		
	}// end main()

}
