package com.answersheet;

import java.io.*;
public class Test1157_2
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String str = br.readLine().toUpperCase();
		
		int arr[] = new int[26];	// 영문자는 26 개
		for (int i=0; i<str.length(); i++)
			arr[str.charAt(i)-65]++;
		
		int max = -1;
		char ch= '?';
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>max)
			{
				max = arr[i];
				ch = (char)(i+65);	// i 번째 방 + 65 -> 대문자 ASCII code
			}
			else if (arr[i]==max)
				ch = '?';
		}
		System.out.println(ch);
		
	}

}
/*
1번의 풀이에서 3~5 번을 재구성

3. 출력 문자를 ? 로 초기화 후, max 값 갱신마다 해당 문자를 +65 한 대문자로 갱신
   또한, max 값 갱신 중에 똑같은 값을 발견하면 다시 출력문자를 ? 로 갱신
   전체 배열을 전부 확인해야하는 이유는
   -> 현재 저장된 max 값 이상으로 들어가있는 값이 있는지 전체 확인해야하기 때문
*/
