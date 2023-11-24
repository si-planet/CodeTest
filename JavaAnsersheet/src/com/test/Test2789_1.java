package com.test;

import java.io.*;
import java.util.StringTokenizer;
public class Test2789_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N,M; // N: 카드 갯수 N개(입력받을 숫자) , M: 최댓값 기준
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());	// n 은 3~100 개
		M = Integer.parseInt(st.nextToken());	// m 은 10~30만
		
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		int sum = 0;	// 합계
		for (int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int max = 0;
		// 받아온 카드 중 3장을 뽑아서 최댓값을 넘지 않는 최대값 만들기
		for (int i=0; i < arr.length-2; i++)
		{
			for (int j= i+1; j < arr.length-1; j++)
			{
				for (int k = j+1; k < arr.length; k++)
				{
					int temp = arr[i]+arr[j]+arr[k];
					if (temp > max && temp <= M)
						max = temp;
				}
			}
		}
		
		System.out.println(max);
	}

}
/*
브루트 포스 (a.k.a 노가다) 풀이
모든 경우의 수를 다 더해본 후 해당하는 값을 찾는 알고리즘

첫 번째 시도-> for 문의 3 장의 카드를 뽑는데 겹칠 수 없기 때문에
               배열로 저장해 둔 이전에 뽑은 카드 + 1, 이전에 뽑은 카드 + 1 번째를 뽑아야 함  (O)
               
두 번째 시도-> for 문의 arr.length 역시 3개를 뽑아야 하기 때문에 -2, -1 을 해줘야 오류가 발생하지 않음

두 번만에 성공
*/
