package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test2896_1
{

	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A; // 낮에 올라가는 높이
		int B; // 밤에 내려가는 높이
		int V; // 나무 높이
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		int day = 0;	// 걸리는 날짜 계산
		while (V!=0)
		{
			day++;	// 날이 시작
			
			V -= A;	// A 만큼 올라감
			if (V<=0)	// 만약 올라갔을 때 정상에 도달했다면 끝!
				break;
			
			V += B;	// B 만큼 내려옴
		}
		
		System.out.println(day);
				
	}

}
// 풀이는 맞으나
// 시간 초과
