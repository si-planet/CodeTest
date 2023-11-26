package com.test;

import java.io.*;
import java.util.StringTokenizer;
public class Test2675
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num  = Integer.parseInt(br.readLine());
		for (int i=0; i <num; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int repeat = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			for (int j=0; j<str.length(); j++)
				for (int k=0; k<repeat; k++)
					sb.append(str.charAt(j));
				
			System.out.println(sb);
		}
	}
}
