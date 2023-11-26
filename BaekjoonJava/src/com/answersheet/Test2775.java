package com.answersheet;

import java.io.*;
public class Test2775
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr;
		int k, n, result;
		
		while (T!=0)
		{
			T--;
			
			k = Integer.parseInt(br.readLine()); // 층 : 0 부터 시작
			n = Integer.parseInt(br.readLine()); // 호 : 1 부터 시작
			
			arr = new int[k][n+1];
			
			for (int i=0; i<arr.length; i++)
			{
				result = 0;	// 새로운 층이 될 때마다 다시 계산
				for (int j=1; j<arr[i].length; j++)
				{
					if (i==0)	// 0 층 n 호까지 순차적 채우기
						arr[i][j] = j;
					else	// 1층 ~ 해당 층 까지 이전층의 해당호까지 누적
					{
						result += arr[i-1][j];
						arr[i][j] = result;
					}
				}
			}

			result = arr[k-1][n];
			
			System.out.println(result);
		}
	}

}
