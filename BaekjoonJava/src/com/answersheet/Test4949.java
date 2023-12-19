package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test4949
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		do
		{
			Stack<Integer> s = new Stack<Integer>();
			String str = br.readLine();
			boolean flag = false;

			if (str.equals("."))
				break;
			
			for (int i=0; i<str.length(); i++)
			{
				char ch = str.charAt(i);

				if (i==str.length()-1 && ch=='.')
					break;
					
				switch (ch)
				{
					case '(' : s.add(1);break;
					case '[' : s.add(0);break;
					case ')' : 
						if (!s.isEmpty())
						{
							if (s.peek()==1)
								s.pop();
							else
								flag = true;
							break;
						}
						else
							flag = true;
						break;

					case ']' : 
						if (!s.isEmpty())
						{
							if (s.peek()==0)
								s.pop();
							else
								flag = true;
							break;
						}
						else
							flag = true;
						break;
				}
				
				if (flag)	
					break;
			}
			
			if (flag==false && s.empty())
				sb.append("yes").append("\n");
			else
				sb.append("no").append("\n");
			
			
		} while (true);
		
		System.out.println(sb);
	
	}// end main()

}
