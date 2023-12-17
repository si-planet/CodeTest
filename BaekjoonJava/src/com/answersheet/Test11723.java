package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test11723
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] S = new int[21];
		
		
		for (int i=0; i<M; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			String cal = st.nextToken();
			int num = -1;
			
			if (st.hasMoreTokens())
				num = Integer.parseInt(st.nextToken());
			
			if (cal.equals("add"))
			{
				if (S[num]==0)
					S[num]=1;
			}
			else if (cal.equals("remove")) 
			{
				if (S[num]==1)
					S[num]=0;
			}
			else if (cal.equals("check")) 
			{
				if (S[num]==0)
					sb.append(0).append("\n");
				else
					sb.append(1).append("\n");
			}
			else if (cal.equals("toggle")) 
			{
				if (S[num]==0)
					S[num]=1;
				else
					S[num]=0;
				
			}
			else if (cal.equals("all")) 
			{
				for (int j=1; j<S.length; j++)
				{
					if (S[j]==0)
						S[j]=1;
				}
			}
			else
			{
				S = new int[21];
			}
			
		}
		
		System.out.println(sb);

	}// end main()

}
