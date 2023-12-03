package com.answersheet;

import java.io.*;
import java.util.*;
public class Test1920_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		for (int i=0; i<arrN.length; i++)
			arrN[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arrN);
		
		int m = Integer.parseInt(br.readLine());
		int[] arrM = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		for (int i=0; i< arrM.length; i++)
		{
			arrM[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arrM.length; i++)
		{
			boolean result = binarySearch(arrN, arrM[i]);
			
			if (result)
				sb.append("1\n");
			else
				sb.append("0\n");
		}
		
		System.out.println(sb);
		
	}// end main()

	private static boolean binarySearch(int[] arr, int target)
	{
		int first = 0, last = arr.length-1;
		int mid;
		
		while (first<=last)
		{
			mid = (first + last)/2;
			
			if (arr[mid] == target)
				return true;
			else if (arr[mid] > target)
				last = mid -1;
			else
				first = mid + 1;
		}
		
		return false;
	}
}
