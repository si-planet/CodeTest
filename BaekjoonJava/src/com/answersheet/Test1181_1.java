package com.answersheet;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class Test1181_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] word = new String[n];
		
		for (int i=0; i<word.length; i++)
			word[i] = br.readLine();
		
		Arrays.sort(word, new Comparator<String>(){
			// Comparator 의 영역
			@Override
			// 받은 String[] 배열의 0,1 / 1,2 / 2,3 ... 
			public int compare(String s1, String s2)
			{
				// ※ 해당 메소드의 반환 값은 음수, 0, 양수로 판단하여 정렬을 한다
				// 양수 : 위치 바꿈
				// 음수, 0 : 위치 바꾸지 않음
				
				if (s1.length() == s2.length())	// 여기서 0 일 때는 사전 순 정렬이 필요
				{
					// compareTo() (Comparator 내부의 메서드) 로 사전순 정렬
					return s1.compareTo(s2);
				}
				else
				{
					// 양수 혹은 음수를 반환하여 정렬
					return s1.length() - s2.length();
				}
			}
			
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<word.length; i++)
		{
			if (i==0)
				sb.append(word[0]).append("\n");
			else
			{
				if (!word[i].equals(word[i-1]))
					sb.append(word[i]).append("\n");
			}
				
		}
		
		System.out.println(sb);

	}

}
