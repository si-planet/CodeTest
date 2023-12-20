package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test18110
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	// 의견 갯수
		if (n==0)
		{
			System.out.println(0);
			return;
		}
		
		int arr[] = new int[n];
		for (int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		
		// 절사 평균을 위해 제외 해야 하는 수
		int num = (int)Math.round( 0.15 * n);
		int sum = 0;
		for (int i=num; i<arr.length-num; i++)
			sum += arr[i];
			
		System.out.println(Math.round(sum/(double)(arr.length-num*2)));
		
	}// end main()

}
