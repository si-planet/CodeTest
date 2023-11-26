package com.answersheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Test2475
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens())
			result += Math.pow(Integer.parseInt(st.nextToken()), 2);
		
		System.out.println(result%10);
	}

}
