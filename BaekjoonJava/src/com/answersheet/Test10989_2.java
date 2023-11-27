package com.answersheet;

import java.io.*;
import java.util.Arrays;
public class Test10989_2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		for (int i=0; i<N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		br.close();

		
		for (int i= 0; i<arr.length; i++)
			bw.write(arr[i] + "\n");
		
		bw.flush();
		bw.close();
	}

}
// 빠른입출력 BufferedReader 와 BufferedWriter(혹은 StringBuilder) 사용 필수
// 방법 1 : Arrays 패키지 의 sort 를 사용하여 배열을 정렬한다
// dual-pivot Quick sort 알고리즘을 사용한다. 
// 평균 O(nlogn) 의 시간복잡도를 보이지만 최악의 경우 O(n2) 로 좋지 않은 성능이 될 수 있음