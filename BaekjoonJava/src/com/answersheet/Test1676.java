package com.answersheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;
public class Test1676
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String str = String.valueOf(factorial(n));

		for (int i=str.length()-1; i<str.length(); i--)
		{
			if ((str.charAt(i)-'0') == 0)
			{
				cnt++;
			}
			else
				break;
		}
		
		System.out.println(cnt);
	}
	
	private static BigInteger factorial(int n)
	{
		if (n<=1)
			return BigInteger.ONE;

		BigInteger result = BigInteger.valueOf(n);
		for (int i=n; i>=2; i--)
			result = result.multiply(BigInteger.valueOf(i-1));
		
		return result;
	}

}
