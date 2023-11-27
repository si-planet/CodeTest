package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test11050_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		// nCk = n! / ((n-k)! * k!)
		System.out.println(factorial(n) / (factorial(n - k) * factorial(k)));
		
	}

	// 재귀 함수를 통해 factorial 계산을 하는 방법 
	static int factorial (int N)
	{
		if (N==0)
			return 1; 
		
		return N * factorial(N - 1);
	}

}
/*
이항계수란 주어진 집합에서 원하는 개수만큼 순서없이 뽑는 조합의 개수를 말한다
====
└ 뽑거나 뽑지 않거나의 두 가지 선택권

cf) (a+b)² = a² + 2ab + b² -> 1, 2, 1
cf) 파스칼의 삼각형
두개의 항에 대한 식을 전개 했을 때의 계수를 말함

*/
