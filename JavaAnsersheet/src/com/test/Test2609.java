package com.test;

import java.io.*;
import java.util.StringTokenizer;
public class Test2609
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int gcd;
		long lcm;
		
		gcd = getGcd(num1, num2);
		// 최소공배수 = 숫자1 * 숫자2 / 최대공약수
		lcm = (num1 * num2) / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

	static int getGcd(int a, int b)
	{
		int result = -1;
		
		// a가 큰 수가 되도록 정렬
		if (a < b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		// 최대 공약수 구하기 -- 유클리드 호제법
		while (a%b!=0)
		{
			int temp = a % b;
			a = b; 
			b = temp;
		}
		
		result = b;
		
		return result;
	}
	
}
