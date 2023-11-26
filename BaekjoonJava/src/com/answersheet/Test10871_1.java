package com.answersheet;

import java.io.*;
import java.util.*;
public class Test10871_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, X;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++)
		{
			int value = Integer.parseInt(st.nextToken());
			if ( value < X)
				sb.append(value).append(" ");
		}
		
		br.close();
		System.out.println(sb);
	}

}
/*
int value 생략시 RuntimeError(NoSuchElement) 발생
-> 존재하지 않는 것을 가져오려고 할 때 발생하는 오류
   Integer.parseInt(st.nextToken())으로 확인절차를 걸치기 때문에 발생하지 않는 것으로 보인다
*/