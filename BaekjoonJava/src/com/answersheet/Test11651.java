package com.answersheet;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class Test11651
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int[][] arr;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][2];
		
		for (int i=0; i<arr.length; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] arr1, int[] arr2) 
			{
				if (arr1[1] == arr2[1])
					return arr1[0]-arr2[0];
				
				return arr1[1]-arr2[1];
			};
		});
		
		for (int i=0; i<arr.length; i++)
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		
		System.out.println(sb);
		
	}

}
