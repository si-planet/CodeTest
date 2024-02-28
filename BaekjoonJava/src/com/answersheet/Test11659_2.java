package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test11659_2 {

	public static void main(String[] args) throws IOException	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N, M;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	// 개수
		M = Integer.parseInt(st.nextToken());	// 횟수
		
		st = new StringTokenizer(br.readLine());
		int[][] nSum = new int[N+1][N+1];	// 0 번 미사용
		for(int i=1; i<N+1; i++) {
			nSum[i][i] = Integer.parseInt(st.nextToken());
			int temp = nSum[i][i];
			if(i>1) {
				for(int j=i-1; j>0; j--) {
					temp += nSum[j][j];
					nSum[j][i] = temp;
				}
			}			
		}
		
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			bw.append(nSum[start][end] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
		
	}

}
/*
	메모리 초과
*/
