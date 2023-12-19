package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test17219
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, String> pw = new HashMap<String, String>(); 
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			pw.put(st.nextToken(), st.nextToken());
		}
		
		for (int i=0; i<M; i++)
			bw.append(pw.get(br.readLine())).append("\n");
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
