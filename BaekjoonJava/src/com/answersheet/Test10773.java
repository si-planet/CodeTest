package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test10773
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<Integer>();

		int result = 0;
		while (k-- > 0)
		{
			int temp = Integer.parseInt(br.readLine());
			
			if (temp==0)
				result -= s.pop();
			else
			{
				s.push(temp);
				result += temp;
			}
		}
		
		System.out.println(result);
	}

}
