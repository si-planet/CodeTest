package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2579
{
	static int[] scores;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 계단 개수
		int N = Integer.parseInt(br.readLine());
		// 계단 점수 데이터
		int[] stair = new int[N+1];	// 0 은 시작점 , 1 ~ N 까지 계단 점수로 활용
		for (int i=1; i<stair.length; i++)
			stair[i] = Integer.parseInt(br.readLine());
		br.close();

		// 최대 점수 배열
		scores = new int[N+1];
		
		if(N==1) {
			scores[1] = stair[1];	// 첫 칸에 올라가는 최대 점수
		} else if(N==2) {
			scores[2] = stair[2]+stair[1];	// 둘째 칸에 올라가는 최대 점수
		} else {
			scores[1] = stair[1];
			scores[2] = stair[2]+stair[1];
			// 셋째 칸에 올라가는 최대 점수 = -1칸 + 자기 값 또는 -2칸 + 자기 값
			scores[3] = Math.max(stair[1]+stair[3], stair[2]+stair[3]);	

			for(int i=4; i<scores.length; i++) {
				// 1. 두칸 + 한칸 올라온 경우 = 두칸 시작점까지 최대 값 + 두번째 칸 값 + 도착한 값 
				// 2. 두칸 올라온 경우 = 두 칸전 까지의 최대 값 + 도착한 값
				scores[i] = Math.max( (scores[i-3] + stair[i-1] + stair[i]) , (scores[i-2] + stair[i]) );
				//System.out.println(i + " : " + scores[i]);
			}
		}
		
		// 출력
		System.out.println(scores[N]);
		
	}// end main()
	
}