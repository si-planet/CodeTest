package com.answersheet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Test1927 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> q = new PriorityQueue<>();	// 최소 힙으로 사용
		 
		int N = Integer.parseInt(br.readLine());	// 입력받을 개수
		int x;
		for(int i=0; i<N; i++) {
			x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				if(q.size() > 0) bw.append(String.valueOf(q.poll()));
				else bw.append("0");
				
				bw.append("\n");
			} else {
				q.offer(x);
			}
			
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}
