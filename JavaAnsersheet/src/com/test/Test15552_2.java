package com.test;

import java.util.*;
import java.io.*;
public class Test15552_2
{

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
    	for (int i = 0; i < t; i++)
		{
			st = new StringTokenizer(br.readLine(), " "); // 한 줄 입력 공백기준 자르기
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
			// nextToken()으로 가져와서 String 형태를 int로 형 변환(덧셈을 위해서) 
			// BufferedWriter 에 기록 (기록할 때, 개행 문자 추가)
		}

        br.close();	// 다 읽어왔을 때 닫아주기
        
        bw.flush();	// 버퍼에 담아둔 기록 내보내기
        bw.close(); // 버퍼에서 모두 내보냈으면 닫아주기
	}

}
/*
빠른 출력을 위해서는
BufferedReader + BufferedWriter 
BufferedReader + StringBuilder
방법을 사용해야 한다

_2 에서는 BufferedWriter 를 사용
*/