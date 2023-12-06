package com.answersheet;

import java.io.*;
import java.util.Stack;
public class Test9012_2
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

			if (isVps(str))
				sb.append("YES");
			else
				sb.append("NO");
			sb.append("\n");			
		}
		
		System.out.println(sb);

		
	}// end main()
	
	private static boolean isVps(String str)
	{
		int len = str.length();
		Stack<Character> stack = new Stack<Character>(); 
		
		for (int i=0; i<len; i++)
		{
			char ch = str.charAt(i); 
			
			if ( ch == '(')
				stack.push(ch);
			else
			{
				if (stack.isEmpty())
					return false;
				else
					stack.pop();
			}
		}
		
		return stack.isEmpty();
	} // end isVps()
	
}
