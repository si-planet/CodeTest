package com.answersheet;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class Test2164
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i=1; i<=n; i++)
			q.add(i);
		
		while (q.size()>1)
		{
			q.remove();	// 맨 위 제거
			q.add(q.poll());	// 맨 위 요소를 맨 뒤에 추가
		}
		
		if (q.size()==1)
			System.out.println(q.peek());
	}

}
