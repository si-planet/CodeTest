package com.answersheet;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class Test10866
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<Integer>();
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			int reply= -2;
			if (str.contains("push"))
				reply = Integer.parseInt(st.nextToken());
			
			if (str.equals("push_front"))
			{
				d.addFirst(reply);
			}
			else if (str.equals("push_back"))
			{
				d.addLast(reply);
			}
			else if (str.equals("pop_front")) 
			{
				if (d.size()>0)
					reply = d.pollFirst();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
			else if (str.equals("pop_back")) 
			{
				if (d.size()>0)
					reply = d.pollLast();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
			else if (str.equals("size")) 
			{
				reply = d.size();
				sb.append(reply).append("\n");
			}
			else if (str.equals("empty")) 
			{
				if (d.size()>0)
					reply = 0;
				else
					reply = 1;
				sb.append(reply).append("\n");
			}
			else if (str.equals("front")) 
			{
				if (d.size()>0)
					reply = d.getFirst();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
			else if (str.equals("back")) 
			{
				if (d.size()>0)
					reply = d.getLast();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
		}
		
		System.out.println(sb);

	}// end main()
	
	
}
