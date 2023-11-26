package com.test;

import java.io.*;
import java.util.StringTokenizer;
public class Test1546
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = 1;

		int sum = 0;
		double avg = 0;
		// 받은 값 최고 값 찾기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens())
		{
			int temp = Integer.parseInt(st.nextToken());

			if (temp > M)
				M = temp;
			sum += temp;
		}

		// 찾은 최대 값으로 평균 구하기
		avg = ((double)sum/M*100)/N;
		System.out.println(avg);
		
	}

}
