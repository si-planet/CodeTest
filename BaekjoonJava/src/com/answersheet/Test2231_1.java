package com.answersheet;

import java.io.*;
public class Test2231_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		
		for (int i=1; i<N; i++)
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
생성자 단순하게 구하는 방법
자연수 1부터 주어진 값 N 까지 순서대로 확인
확인할 자연수의 각 자릿수의 합 + 자기자신이 주어진 값과 동일한지 확인하여
찾으면 바로 반복문을 멈추고 출력 (최소값을 구해야 하기 때문)
*/
