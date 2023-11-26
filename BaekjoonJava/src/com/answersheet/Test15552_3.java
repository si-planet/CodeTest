package com.answersheet;

import java.util.*;
import java.io.*;
public class Test15552_3
{

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();	// StringBuilder 객체 생성
        
    	for (int i = 0; i < t; i++)
		{
			st = new StringTokenizer(br.readLine(), " "); // 한 줄 입력 공백기준 자르기
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
			// nextToken()으로 가져와서 String 형태를 int로 형 변환(덧셈) 
			// 한 것을 append()로 StringBuilder 에 기록
			// 개행 문자 추가 StringBuilder 에 append()로 기록
		}

        br.close();	// 다 읽어왔을 때 닫아주기
        
        System.out.println(sb);	// StringBuilder 문자열 결과 출력하기
	}

}
/*
빠른 출력을 위해서는
BufferedReader + BufferedWriter 
BufferedReader + StringBuilder
방법을 사용해야 한다

_3 에서는 StringBuilder 를 사용
*/