package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test2920_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String result = "mixed";
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int first = Integer.parseInt(st.nextToken());  
		if (first == 1)
		{
			result = "ascending";
			while (st.hasMoreElements())
			{
				first++;
				if (first != Integer.parseInt(st.nextToken()))
				{
					result = "mixed";
					break;
				}
				
			}
		}
		else if (first == 8)
		{
			result = "descending";
			while (st.hasMoreElements())
			{
				first--;
				if (first != Integer.parseInt(st.nextToken()))
				{
					result = "mixed";
					break;
				}
			}
		}
		
		System.out.println(result);
			
	}

}
/*
첫 번째 풀이 -> 오답

- ascending 이나 descending 에서 한 번이라도 다음 번호가 맞으면
  result 값이 변해 버리기 때문에 break 만 써서는 안되고
  다시 mixed 로 재정의 해주어야 함
*/
