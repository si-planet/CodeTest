package com.answersheet;
import java.util.*;
import java.io.*;

class Test1920_1 
{
    	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int max = 0;
		for (int i=0; i<arrN.length; i++)
		{
			arrN[i] = Integer.parseInt(st.nextToken());
			if (max < arrN[i])
				max = arrN[i];
		}
		
		int[] arr = new int[max+1];
		for (int i=0; i<arrN.length; i++)
			arr[arrN[i]]++;
		
		int m = Integer.parseInt(br.readLine());
		int[] arrM = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i< arrM.length; i++)
		{
			int temp = Integer.parseInt(st.nextToken());
			
			if (temp > max)
				arrM[i] = 0;
			else if (arr[temp]>0)
				arrM[i] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arrM.length; i++)
			sb.append(arrM[i] + "\n");
		
		System.out.println(sb);
	
	}// end main()

}