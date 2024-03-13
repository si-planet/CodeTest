package com.retry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test1260re {

	static StringBuilder sb = new StringBuilder();
	static int[][] lines;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// n : 정점의 개수, m :  간선의 개수, v : 시작 번호
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		// 간선 정보를 담은 배열
		lines = new int[n+1][n+1];
		for(int i=0; i<m ; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken()); 
			int num2 = Integer.parseInt(st.nextToken()); 
			
			lines[num1][num2] = lines[num2][num1] = 1;
		}
		br.close();
		
		// 방문 여부를 확인할 배열
		visited = new boolean[n+1];
		
		dfs(v);
		sb.append("\n");
		
		for(int i=1; i<visited.length; i++)
			visited[i]=false;
		
		bfs(v);
		
		System.out.println(sb.toString());
		
	}// end main()
	
	// 재귀함수로 dfs 구현
	static void dfs(int idx) {
	
		visited[idx] = true;
		sb.append(idx + " ");
		
	    for(int i=1; i<visited.length; i++) {
	    	if(i==idx)
	    		continue;
	    	
	        if(lines[idx][i]==1 && !visited[i]) {
	            dfs(i);
	        }
	    }
		
	}// end dfs()
	
	// Queue 로 bfs 구현
	static void bfs(int idx) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(idx);

		while(!queue.isEmpty()) {
			int temp = queue.poll();
			visited[temp] = true;
			
			for(int i=1; i<visited.length; i++) {
				if(i==temp)
					continue;
				
				if(lines[temp][i]==1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
				}
			}
			
			sb.append(temp + " ");
		}
		
	}// end bfs()

}
