package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test2606	// 그래프 탐색 다시
{
	static int[] bit; 

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int com = Integer.parseInt(br.readLine());
		bit = new int[com+1];
		bit[1] = 1;
		
		int repeat = Integer.parseInt(br.readLine());
		int[][] arr = new int[repeat][2];
		for (int i=0; i<repeat; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		Arrays.sort(arr, new Comparator<int[]>()
		{
			@Override
			public int compare(int[] o1, int[] o2)
			{
				return o1[0]-o2[0];
			}
		});
		
		// arr 확인구문
		/*
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		for (int i=0; i<arr.length; i++)
		{
			if(arr[i][0]==1)
			{
				bit[arr[i][1]]=1;
			}
			else
			{
				if (bit[arr[i][0]]==1 || bit[arr[i][1]]==1)
				{
					bit[arr[i][0]]=1; 
					bit[arr[i][1]]=1;
				}
			}
			
		}
		
		// bit 확인구문
		/*
		for (int num : bit)
		{
			System.out.println("num : " + num);
		}
		*/
		
		int count = 0;
		for (int i=2; i<bit.length; i++)
		{
			if (bit[i]>0)
				count += 1;
		}
		
		System.out.println(count);
		
	}// end main()

}
