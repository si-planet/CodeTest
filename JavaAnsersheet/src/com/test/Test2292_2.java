package com.test;

import java.util.Scanner;
public class Test2292_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 1;
		int start = 2; 
		int end = 7;
		
		while (true)
		{
			if (N==1)
				break;
			
			cnt++;
			if (N>=start && N<=end)
				break;
			
			start += 6 * (cnt-1);
			end += 6 * cnt;
		}
		
		System.out.println(cnt);
	}

}
