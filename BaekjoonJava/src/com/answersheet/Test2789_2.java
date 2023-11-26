package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test2789_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N,M; // N: 카드 갯수 N개(입력받을 숫자) , M: 최댓값 기준
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		// 가져온 값을 배열에 저장
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		// 필요한 값을 넘겨주고 메소드로 반환받은 max 값 출력
		System.out.println(search(arr, N, M));
	}
	
	static int search(int arr[], int N, int M)
	{
		int max = 0;
		
		// 받아온 카드 중 3장을 뽑아서 최댓값을 넘지 않는 최대값 만들기
		for (int i=0; i < arr.length-2; i++)
		{
			int temp = arr[i];
			if (temp>M)
				continue;
			else
			{
				for (int j= i+1; j < arr.length-1; j++)
				{
					temp = arr[i] + arr[j];
					
					if (temp>M)
						continue;
					else
					{
						for (int k = j+1; k < arr.length; k++)
						{
							temp = arr[i]+arr[j]+arr[k];
							
							if (temp > max && temp < M)
								max = temp;
							else if (temp == M)	// 최대 값과 동일한 값이 나오면 더이상 탐색할 필요X
								return temp;
						}
					}
				}
			}
		}
		
		return max;
	}

}
/*
효율적으로 탐색하기 위해서...
1. 탐색 알고리즘 구성을 main 메소드와 별도의 메소드로 구현
2. 메소드 내에서 최댓값 확인 구성
   - 이전과 다른 점 : 첫 한 장의 값이 max 값을 넘으면 넘어가기
                      첫 번째 장 + 두 번째 장이 max 값을 넘으면 넘어가기
                      세 장의 합이 max 값과 동일하면 return (더 이상의 탐색 X)
*/
