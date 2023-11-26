package com.test;

import java.util.Scanner;
public class Test2292_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;	// sum 은 증가한 수의 합
		int cnt = 1; 	// cnt 는 해당 번째
		
		while (true)
		{
			if ( N > 6*sum +1)
			{
				sum += cnt; 
				cnt += 1;
			}
			else
				break;
		}
		
		System.out.println(cnt);
	}

}
