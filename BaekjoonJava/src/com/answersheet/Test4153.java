package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test4153
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int a, b, c;
		
		
		do
		{
			String ans = "wrong";
			str =br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if (a==0&&b==0&&c==0)
				break;
			
			if (a*a==(b*b+c*c))
				ans = "right";
			else if (b*b==(a*a+c*c))
				ans = "right";
			else if (c*c==(b*b+a*a))
				ans = "right";
			
			System.out.println(ans);
		} while (true);
	}
	
}
