package com.answersheet;

import java.io.*;
public class Test9012_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String str;
		
		for (int i=0; i<t; i++)
		{
			str = br.readLine();
			
			if (!str.contains("()") )
				sb.append("NO" + "\n");
			else
			{
				while (str.contains("()"))
					str = str.replace("()", "");
					
				if (str.isEmpty())
					sb.append("YES" + "\n");
				else
					sb.append("NO" + "\n");
			}
			
		}
		
		System.out.println(sb);

		
	}// end main()
}
