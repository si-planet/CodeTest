package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11399
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		for (int i=0; i<num.length; i++)
			num[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(num);
		
		for (int i=0; i<num.length; i++)
			for (int j=0; j<=i; j++)
				sum += num[j];
		
		System.out.println(sum);
	}

}
