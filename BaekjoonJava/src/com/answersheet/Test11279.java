package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test11279 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); 
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			
			int x = Integer.parseInt(br.readLine());
			if(x > 0) {
				q.offer(x);
			} else {
				if(q.size()>0) {
					sb.append(q.poll());
				} else {
					sb.append(0);
				}
				sb.append("\n");
			}
		}
		
		br.close();
		System.out.println(sb);
	}

}
