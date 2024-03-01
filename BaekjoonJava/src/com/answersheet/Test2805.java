package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2805 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 나무 수
		int M = Integer.parseInt(st.nextToken()); // 가져가려는 길이
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] heights = new int[N];	// 나무 길이
		int max = 0;
		for(int i=0; i<N; i++) {
			heights[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, heights[i]);
		}
        br.close();        

        
        
		int start = 0;
		int end = max;

		// 이분탐색
		while(start<=end) {
			int mid = start + (end-start)/2;
            long answer = 0;

			for(int i=0; i<N; i++) {
				int temp = heights[i];
                if(temp > mid)
                    answer += temp-mid;
			}

            // 필요 길이보다 작으면 -> 길이 늘이기
            // 필요 길이보다 길면 -> 길이 줄이기
            if( answer >= M ) {
                start = mid+1;
            } else {
                end = mid-1;
            }
		}
		
		System.out.println(end);
		
	}
}
