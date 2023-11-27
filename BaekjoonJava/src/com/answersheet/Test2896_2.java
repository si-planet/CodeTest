package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test2896_2
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
		
		int day=0;
		if ((V-A)%(A-B)==0)
			day = (V-A)/(A-B) + 1;
		else
			day = (V-A)/(A-B) + 2;
		
		System.out.println(day);
				
	}

}
/*
틀린 풀이
	int day = (V-A)/(A-B) + 1;
	// V-A : 마지막날 한 번에 올라갈 수 있는 최대길이
	//       그 전날 까지 길이에 하루에 올라갈 수 있는 길이를 나누면 -> 일수
	//       마지막 날 하루를 더 올라가기 때문에 + 1

=> 하루씩 이동하는 거리를 나누었을 때 나머지가 생기는 경우와 생기지 않는 경우를 생각
(A-B) 씩 가는 날이 (V-A) 가 딱 나누어 떨어지면 A 만큼의 길이만 남아 + 1일이 되지만
(A-B) 씩 가는 날이 (V-A) 로 나누었을 때 나머지가 생기면 A + 나머지 가 생기기 때문에 하루만에 올라갈 수 없다
*/
