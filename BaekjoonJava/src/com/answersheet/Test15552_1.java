package com.answersheet;

import java.util.*;
import java.io.*;
public class Test15552_1
{

	public static void main(String[] args) throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, a, b;

        t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
    	while (t!=0) 
    	{
    	    st = new StringTokenizer(br.readLine(), " ");
    	
    	    a = Integer.parseInt(st.nextToken());
    	    b = Integer.parseInt(st.nextToken());
    	    System.out.println(a+b);
    	
    	    t--;
    	}

        br.close();
	}

}
/*
빠른 출력
-> Scanner 는 regular expression(정규식) 남발 = Scanner 는 사용할 수 없음
-> BufferedReader 를 사용해야 함

// 첫 번째 풀이 실패 이유
BufferedReader 를 사용했음에도 불구하고 System.out.println 을 사용했기 때문
*/