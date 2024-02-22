package com.retry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test1966
{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test = Integer.parseInt(br.readLine());	// 테스트 케이스 수
		Queue<Integer[]> q;
		Integer[][] arr;	// 현재 인덱스, 중요도
		StringTokenizer st;
		int N, M; // 문서 개수, 중요한 문서 인덱스
		
		while(test-- > 0) {
			q = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			arr = new Integer[N][2];
			
			int max = 0;	// 가장 높은 중요도 파악
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<N; i++) {
				arr[i][0] = i;
				arr[i][1] = Integer.parseInt(st.nextToken());

				if(max < arr[i][1]) max = arr[i][1];
					
				q.offer(arr[i]);
			}
			
			// 넣어 둔 값들을 비교하며 제거
			for(int i=1; i<=N; i++) { // i 값을 통해 제거한 count 확인
				// 문서의 중요도가 max 값과 같다면
				if(q.peek()[1]==max) {
					
					// 해당 문서의 인덱스가 중요한 문서 인덱스와 같다면
					if(q.peek()[0]==M) {
						bw.append(String.valueOf(i)).append("\n");
						break;
					} else { 
						// 중요한 문서 인덱스가 아니라면
						q.poll();	// 제거
						// max 값 재 설정 필요
						// 임의의 max 값(다음 인수의 중요도) 재 설정 후 max 값 찾기
						max = q.peek()[1];
						for(Integer[] num : q) {
							if(max < num[1]) max = num[1];
						}
					}
					
				} else { // 문서의 중요도가 max 값이 아닐 때
					i--; // 제거 카운트가 올라가지 않도록 설정
					q.offer(q.poll());	// 해당 값을 뽑아서 맨 뒤로 넣기
				}
				
			}
			
		}//end while
		
		br.close();
		bw.flush();
		bw.close();
		
	}// end main

}
