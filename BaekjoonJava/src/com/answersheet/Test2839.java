package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2839
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int kg5 = N/5;
		int kg3 = 0;
		
		int result = 0;
		
		while (true)
		{
			kg3 = (N - (5 * kg5)) % 3;

			if (kg3==0)
			{
				kg3 = (N - (5 * kg5)) / 3;
				result = kg5 + kg3;
				break;
			}
			
			if (kg3!=0 && kg5 > 0)
			{
				kg5--;
				continue;
			}
			else if (kg3!=0 && kg5==0)
			{
				System.out.println(-1);
				return;
			}
			
		}
		
		System.out.println(result);
	}

}
