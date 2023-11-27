package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test11050_3
{
	static int[][] dp; // 계산 했던 factorial 값을 저장할 배열
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial3(n,k));
		
	}

	// 재귀 함수 factorial2 을 효율적으로 바꾸기 -> 계산 했던 factorial 저장 -> 다시 꺼내쓰기!
	static int factorial3 (int n, int k)
	{
		if (dp[n][k] > 0)	// 해당 값을 계산한 적이 있다면
			return dp[n][k];
		
		if (n==k || k==0)	// nCn 또는 nC0 은 1
			return dp[n][k] = 1;
		
		// n+1Cr+1 = nCr + nCr+1
		return dp[n][k] = factorial3(n-1, k-1) + factorial3(n-1, k);
	}

}
/*
동적 계획법 추가
*/
