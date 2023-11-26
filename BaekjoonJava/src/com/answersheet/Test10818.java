package com.test;

import java.io.*;
import java.util.StringTokenizer;
public class Test10818
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int min=0, max=0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<num; i++)
		{
			int temp = Integer.parseInt(st.nextToken());
			if (min==0 && max==0)
				min = max =temp;
			else
			{
				if (temp > max)
					max =temp;
				else if (temp < min)
					min = temp;
				else
					continue;
			}
		}
		System.out.printf("%d %d", min, max);
		
	}
	
	

}
/*
// 정렬 사용시 -> 시간초과
for (int i=0; i<arr.length; i++)
{
	for (int j=i+1; j<arr.length; j++)
	{
		if (arr[i]>arr[j])
		{
			arr[i] = arr[j]^arr[i];
			arr[j] = arr[i]^arr[j];
			arr[i] = arr[j]^arr[i];
		}
	}
}
System.out.printf("%d %d", arr[0], arr[num-1]);
 */
