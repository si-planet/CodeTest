package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test11659_3 {

	public static void main(String[] args) throws IOException	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N, M;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	// 개수
		M = Integer.parseInt(st.nextToken());	// 횟수
		
		st = new StringTokenizer(br.readLine());
		int[] numbers = new int[N+1];	// 0 번 미사용
		for(int i=1; i<numbers.length; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			for(int i=start; i<=end; i++) {
				sum += numbers[i];
			}
			
			bw.append(sum + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}

}
/*
	시간 초과	
*/
