package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test11050_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial2(n,k));
		
	}

	// 재귀 함수 factorial 을 효율적으로 바꾸기 -> 2개의 factorial 계산을 하나로
	static int factorial2 (int n, int k)
	{
		if (n==k || k==0)
			return 1;
		
		return factorial2(n-1, k-1) + factorial2(n-1, k);
	}

}
/*
여러 번 사용해야하는 factorial 을 한 번에 계산할 수 있도록 만들기
*/
