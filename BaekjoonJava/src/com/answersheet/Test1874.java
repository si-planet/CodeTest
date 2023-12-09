package com.answersheet;

import java.io.*;
import java.util.Stack;
public class Test1874
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Stack<Integer> s = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int start = 0;
		
		while(n-- > 0)
		{
			
			int temp = Integer.parseInt(br.readLine());
			
			if (temp > start)
			{
				for (int i=start+1 ; i<=temp; i++)
				{
					s.push(i);
					sb.append("+").append("\n");
				}
				
				start = temp;
			}
			else if (s.peek()!= temp)
			{
				System.out.println("NO");
				return;
			}
			
			s.pop();
			sb.append("-").append("\n");
			
		}
		
		System.out.println(sb);
		
	}// end main()
	
}
