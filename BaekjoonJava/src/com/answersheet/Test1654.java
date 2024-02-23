package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1654 {

	public static void main(String[] args) throws IOException	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());	// 가지고 있는 랜선 개수
		int N = Integer.parseInt(st.nextToken());	// 필요한 랜선 개수
		
		long[] lines = new long[K];	// 랜선 길이 저장
		long maxLen = Integer.MAX_VALUE;	// 랜선이 가장 길 수 있는 길이 = 가장 짧은 랜선의 길이
		for(int i=0; i<K; i++) {
			lines[i] = Long.parseLong(br.readLine());
			Math.max(maxLen, lines[i]);
		}
		br.close();

		long start = 1;
		long end = maxLen; 
		
		// 이진 탐색
		while(start<=end) {
			long mid = (start + end)/2;
			long cnt = 0;	// 랜선 개수 비교용 count
			
			for(int i=0; i<lines.length; i++) {
				cnt += lines[i]/mid;
			}
			
			// 필요 갯수보다 작으면 -> 길이 줄이기
			// 필요 갯수보다 같거나 많으면 -> 길이 늘이기
			if(cnt < N) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		
		// start 가 end 를 넘을 때까지 반복 후 나오는 end 값이 최대 값을 의미
		System.out.println(end);
		
	}// end main()


}
