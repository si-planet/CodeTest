package com.answersheet;

import java.io.*;
public class Test8958
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int re = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();	// 결과 출력할 변수
		
		for (int i=0; i<re; i++)	// re 로 받은 문자열 갯수 만큼 반복
		{
			String temp = br.readLine(); // 문자열 입력
			int ck = 1;		// 연속으로 맞췄을 때 사용할 변수
			int sum = 0;	// 총 합계 변수 
			
			for (int j=0; j<temp.length(); j++) // 문자열 길이만큼 한 문자씩 인식
			{
				char ch = temp.charAt(j);	// 가져온 문자 하나

				if (ch =='O')	// O 일 때
				{
					sum += ck;	// 누적된 ck 값 증가 (처음이거나 이전 값이 X 이면 1)
					ck++;		// 다음 O 를 위해서 ck 값 1 증가
				}
				else
					ck = 1;		// 만약 X 가 나오면 ck 값을 1로 초기화 (0점은 안더해도 0)
				
			}
			sb.append(sum).append("\n");	// 문자열 하나의 결과 값 sum 과 개행문자 입력
		}
		
		System.out.println(sb);
	}

}
