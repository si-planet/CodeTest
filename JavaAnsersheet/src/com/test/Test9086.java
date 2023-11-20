package com.test;

import java.io.*;
public class Test9086
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());		
		StringBuilder sb = new StringBuilder();

		for (int i=0; i<T; i++)
		{
			String str = br.readLine();
			sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
		}
		
		br.close();
		System.out.println(sb);
 
	}

}
