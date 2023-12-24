package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test1764
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder result = new StringBuilder();
		int count = 0;
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<String> list = new ArrayList<String>(); 
		HashMap<String, String> name = new HashMap<>();
		
		String str;
		for (int i=0; i<n; i++)
		{
			str = br.readLine();
			name.put(str, str);
		}
		
		for (int i=0; i<m; i++)
		{
			str = br.readLine();
			if (name.containsKey(str))
			{
				list.add(str);
				count++;
			}
		}
		
		Collections.sort(list);
		
		for (String same : list)
			result.append(same).append("\n");
		
		System.out.println(count);
		System.out.println(result);
	}

}
