package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test9372 {
	
	public static void main(String[] args) throws IOException	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());// 테스트 케이스 수
		
		int N;	// 국가 수
		int M;	// 비행기 종류
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			// N 개의 국가 중에서 a 와 b 를 왕복하는 비행기 정보
			while(M-- > 0) {
				br.readLine();
			}

			bw.write(N-1 + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
