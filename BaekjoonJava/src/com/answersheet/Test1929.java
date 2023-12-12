package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1929
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		int[] decimal = new int[1000001];
		for (int i=2; i<=end; i++)
			decimal[i] = i;
		
		for (int i=2; i<=end; i++)
		{
			if (decimal[i]==0)
				continue;
			
			for (int j=2*i; j<=end; j+=i)
				decimal[j]=0;
		}
		
		
		for (int i=start; i<=end; i++)
		{
			if (decimal[i]>0)
				sb.append(decimal[i]).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
