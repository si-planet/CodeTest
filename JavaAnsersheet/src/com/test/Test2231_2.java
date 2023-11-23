package com.test;

import java.io.*;
public class Test2231_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		int result = 0;
		
		for (int i=(N-(str.length()*9)); i<N; i++)	// 시작 하는 수는 주어진 값 - 자릿수합의 최대 부터!
		{
			int temp = i;	// 현재 값 (계산 해야하므로 임시로 저장)
			int sum = 0;	// 현재 값의 자릿수 합
			
			while (temp!=0)	// 각 자릿수 더하기
			{
				sum += temp%10;
				temp /=10;
			}
			
			if (N == (i + sum))	// 주어진 값 == 현재 값 + 자릿수 합 (생성자 찾음)  
			{
				result = i;
				break;
			}

		}
		
		System.out.println(result);
	}

}
/*
응용 방법
각 자릿수의 합의 최대는 (0~9 까지 이므로)
세 자릿수면 주어진 값 3 * 9 = 27 만큼 차이날 수 있음 (즉, 1부터 구할 필요가 없다) 
*/