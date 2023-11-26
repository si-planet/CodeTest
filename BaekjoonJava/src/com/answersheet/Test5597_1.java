package com.answersheet;

import java.io.*;
public class Test5597_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int arr[] = new int[30];
		for (int i=0; i<(arr.length-2); i++)
		{
			int result = Integer.parseInt(br.readLine());
			arr[result-1] = 1;	// 배열이 0 부터 시작하니까 방 번호는 숫자 -1
		}
		
		for (int i=0; i < arr.length; i++)
		{
			if (arr[i]==1)
				continue;
			System.out.println(i+1);	// 0 값을 담고 있는 방번호 + 1 
		}
		
	}

}
