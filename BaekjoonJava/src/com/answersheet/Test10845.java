package com.answersheet;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class Test10845
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			int reply= -2;
			if (st.hasMoreTokens())
				reply = Integer.parseInt(st.nextToken());
			
			if (str.equals("push"))
			{
				q.add(reply);
			}
			else if (str.equals("pop")) 
			{
				if (q.size()>0)
					reply = q.poll();
				else
					reply = -1;
				
				sb.append(reply).append("\n");
			}
			else if (str.equals("size")) 
			{
				reply = q.size();
				sb.append(reply).append("\n");
			}
			else if (str.equals("empty")) 
			{
				if (q.size()>0)
					reply = 0;
				else
					reply = 1;
				sb.append(reply).append("\n");
			}
			else if (str.equals("front"))
			{
				if (q.size()>0)
					reply = q.peek();	
				else
					reply = -1;
				sb.append(reply).append("\n");
			}
			else
			{
				if (q.size()>0)
					reply = getBack(q);
				else
					reply = -1;
				sb.append(reply).append("\n");
			}
			
		}
		
		System.out.println(sb);

	}// end main()
	
	
	static int getBack(Queue<Integer> q)
	{
		int result = -2	;
		int size = q.size();
		while(size>0)
		{
			size--;
			result = q.poll();
			q.add(result);
		}		
			
		return result;
	}
}
