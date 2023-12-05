package com.answersheet;

import java.io.*;
public class Test2751_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 최대 백만개
		
		int[][] arr = new int[1000001][2]; // 입력 가능 범위 만큼 뒤에 방은 양수 음수 표시
		int max = 0, min = 0;
		for (int i=0; i<n; i++) 
		{
			int temp = Integer.parseInt(br.readLine());
			// 해당 방 배열 증가 [][0] : 음수 [][1] : 양수
			if (temp >= 0)
				arr[temp][1]++;
			else
				arr[-temp][0]++;
			
			// max, min 으로 출력할 때 범위 제한 하기 위함
			if (temp > max)
				max = temp;
			else if (temp < min)
				min = temp;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for (int i=min; i<0 ; i++)
		{
			if (arr[-i][0]>0)
				sb.append( i + "\n");
		}
			
		for (int i=0; i<=max; i++)
		{
			if (arr[i][1]>0)
				sb.append( i + "\n");
		}
			
		System.out.println(sb);
	}
	
}