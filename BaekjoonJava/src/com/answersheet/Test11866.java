package com.answersheet;

import java.io.*;
import java.util.*;
public class Test11866
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();

		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		for (int i=1; i<=n; i++)
			arr.add(i);
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int pointer = k-1;	// index 0 부터 시작
        while (arr.size()>0)
		{
			result.add(arr.remove(pointer));
			// 제거와 동시에 순차대로 결과 list 에 입려 
			// 리스트에서 제거함으로써 size 줄어듦

            if (arr.size()==0)
                break;
         	pointer += (k-1);	// pointer (k-1) 칸 만큼 이동
         
            while (pointer >= arr.size()) 
                pointer -= arr.size();	
            
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<=n; i++)
		{
			if (i==0)
				sb.append("<");
			else if (i<n)
				sb.append(", ");
			else
			{
				sb.append(">");
				break;
			}
			
			sb.append(result.get(i));
		}
		
		System.out.println(sb);
		
	}// end main()

}
