package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test1978
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		
		boolean isPrime;
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 입력받은 갯수 만큼 확인
		for (int i=0; i<N; i++)
		{
			isPrime = true;
			
			int temp = Integer.parseInt(st.nextToken());
			// 1은 소수가 아님 -> 예외처리
			if (temp==1)
				continue;

			// 2부터 자기자신 직전까지 나눠지면 소수가 아님 
			for (int j=2; j<temp; j++)
			{
				if (temp%j==0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
				cnt+=1;
		}

		System.out.println(cnt);
		
	}

}
