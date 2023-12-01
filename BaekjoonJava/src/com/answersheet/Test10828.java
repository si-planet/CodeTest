package com.answersheet;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;
public class Test10828
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<Integer>();
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			int reply= -2;
			if (str.equals("push"))
				reply = Integer.parseInt(st.nextToken());
			
			if (str.equals("push"))
			{
				s.add(reply);
			}
			else if (str.equals("pop")) 
			{
				if (s.size()>0)
					reply = s.pop();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
			else if (str.equals("size")) 
			{
				reply = s.size();
				sb.append(reply).append("\n");
			}
			else if (str.equals("empty")) 
			{
				if (s.size()>0)
					reply = 0;
				else
					reply = 1;
				sb.append(reply).append("\n");
			}
			else
			{
				if (s.size()>0)
					reply = s.peek();	
				else
					reply = -1;
				sb.append(reply).append("\n");
			}
		}
		
		System.out.println(sb);

	}// end main()
	
	
}
