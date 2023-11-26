package com.answersheet;

import java.util.Scanner;

public class Test10807_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N, v, result;

		N = sc.nextInt();
		
		int arr[] = new int[N];
		for (int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		v = sc.nextInt();
		result = 0;

		sc.close();
		
		for (int i=0; i<N; i++)
			if (arr[i]== v)
				result++;
		
		System.out.println(result);
	}
}
