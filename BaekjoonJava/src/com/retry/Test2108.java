package com.retry;

import java.io.*;
import java.util.*;
public class Test2108 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] origin = new int[n];
		for (int i=0; i<origin.length; i++)
		{
			origin[i] = Integer.parseInt(br.readLine());
		}
		
		// 산술 평균
		int sum = 0;
		for (int i=0; i<origin.length; i++)
		{
			sum += origin[i];
		}
		System.out.printf("%d\n", Math.round((double)sum/n));
		
		// 중앙값
	    // 먼저 origin 정렬
		Arrays.sort(origin);
		System.out.println(origin[n/2]);
		
		// 최빈값
		
		int[] arr = new int[8001];
		for (int i=0; i<origin.length; i++)
		{
			arr[origin[i]+4000]++;
		}
		
		int maxCnt = 0;
		int sameCount = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>maxCnt)
			{
				maxCnt = arr[i];
				sameCount=0;
			}
			else if (arr[i]==maxCnt)
				sameCount++;
			
		}
		
		// 동일한 빈도 2개 이상 존재
		if (sameCount>0)
		{
	        int cnt = 0;
			for (int i=0; i<arr.length; i++) 
	        {
			    if (maxCnt == arr[i])
	                cnt++;
	
	            if (cnt==2)
	            {
	                System.out.println(i-4000);
	                break;
	            }
			} // 두번째로 작은 수
		}
		else
		{
			for (int i=0; i<arr.length; i++)
			{
				if (maxCnt==arr[i])
				{
					System.out.println(i-4000);
				}
			}
		}
		
		
		// 범위
		System.out.println(origin[n-1] - origin[0]);
		
		
	}
}
