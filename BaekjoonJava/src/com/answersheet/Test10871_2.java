package com.test;

import java.util.Scanner;
public class Test10871_2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N, X;
		
		N = sc.nextInt();
		X = sc.nextInt();
		
		int arr[] = new int[N];	// 배열 크기를 N 으로 초기화
		
		for (int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		sc.close(); // 입력을 다 받은 scanner 객체 반납
		
		for(int n : arr)
			if(n < X)
				System.out.print(n + " ");
	}

}
/*
배열 문제이기 때문에 배열 로 다시 풀이
*/