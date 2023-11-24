package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test15829
{
	static final int M = 1234567891;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
	
		long sum = 0;
		long pow = 1;
		
		for (int i=0; i<L; i++)
		{
			// a 가 1 부터 시작
			// %M 은 모듈러 연산 성질 사용
			sum += (((str.charAt(i)-'a'+1) % M) * pow) % M  ;
			pow = (pow * 31) % M;	
		}

		// 모듈러 연산에의해 마지막 합계에도 mod M 필요
		System.out.println(sum % M);
		
	}

}
