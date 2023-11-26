package com.answersheet;

import java.io.*;

public class Test11720
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		String str = br.readLine();
		int result = 0;
		for (int i=0; i<num; i++)
			result += str.charAt(i)-'0';

		System.out.println(result);
	}

}
