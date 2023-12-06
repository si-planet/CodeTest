package com.answersheet;

import java.io.*;
import java.util.*;
public class Test10816_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		StringTokenizer st;
		
		Integer.parseInt(br.readLine()); // 사용 X 
		
		st = new StringTokenizer(br.readLine()," ");
		while (st.hasMoreTokens())
		{
			String key = st.nextToken();
			int value = 1;
			if (map.containsKey(key))
			{
				value = map.get(key) + 1;
				map.put(key, value);
			}
			else
				map.put(key, value);
		}
		
		Integer.parseInt(br.readLine()); // 사용 X 
		
		st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens())
		{
			String key = st.nextToken();
			if (map.containsKey(key))
				sb.append(map.get(key));
			else
				sb.append(0);

			sb.append(" ");
		}

		System.out.println(sb);
	}

}
