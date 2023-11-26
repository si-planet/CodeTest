package com.answersheet;

import java.io.*;
public class Test27866
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int step = Integer.parseInt(br.readLine())-1; // index 는 0 부터 세기 때문에
		
		System.out.println(word.charAt(step));
	}

}
