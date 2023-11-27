package com.answersheet;

import java.io.*;
public class Test10989_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
	
		int[] arr = new int[N];
		for (int i=0; i<N; i++)	// N번 만큼 입력
			arr[i] = Integer.parseInt(br.readLine());
		br.close();
		
		// 정렬하기 : 선택정렬
		for (int i=0; i<arr.length-1; i++)
		{
			int minIdx = i;
			
			for (int j=i+1; j<arr.length; j++)
				if (arr[j]< arr[minIdx])
					minIdx = j;
			
			swap(arr, i, minIdx);
		}
		
		for (int i= 0; i<arr.length; i++)
			bw.write(arr[i] + "\n");
		
		bw.flush();
		bw.close();
		
		
	}
	
	static void swap(int[] arr, int i , int minIdx)
	{
		int temp = arr[i]; 
		arr[i] = arr[minIdx];
		arr[minIdx] = temp;
	}

}
// 선택 정렬 -> 시간초과
