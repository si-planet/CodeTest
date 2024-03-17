package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Test2178 {

	static int[][] maze;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; //x방향배열-상하
	static int[] dy = { 0, 0, -1, 1 }; //y방향배열-좌우
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// N x M 배열
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		maze = new int[n+1][m+1];
		// maze 배열 채우기
		for(int i=1; i<=n; i++) {
			String str = br.readLine();
			for(int j=1; j<=m; j++) {
				maze[i][j] = (int)(str.charAt(j-1)-'0');
			}
		}
		
		visited = new boolean[n+1][m+1];
		visited[1][1] = true;	// 시작점 방문 표시
		
		bfs(1,1);
		System.out.println(maze[n][m]);	// 마지막 값 까지 연결 되었을 때의 값
		
	}// end main()

	private static void bfs(int x, int y) {
		// bfs 탐색 시 사용할 Queue
		// x,y 좌표 형태로 입력
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
	
		// Queue 가 빌 때까지 탐색
		while (!q.isEmpty()) {
			// 현재 좌표, x 값, y 값
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			// 탐색 -> 저장해둔 dx, dy 만큼 움직이기 위함
			for (int i=0; i<4; i++) {
				// dx : -1 1 
				// dy :      -1 1
				// 상, 하, 좌, 우 로 움직일 수 있게함
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				// 좌표의 값이 maze 의 범위를 벗어나면 무시하고 계속
				if(nextX<0 || nextY<0 || nextX >= maze.length || nextY >= maze[x].length ) {
					continue;
				}
				
				// 이미 방문 또는 해당 좌표가 0(이어져있지 않음)이면 무시하고 계속
				if(visited[nextX][nextY] || maze[nextX][nextY]==0) {
					continue;
				}
				
				// 연결된 길 좌표 값 추가
				q.add(new int[] {nextX,nextY});
				// maze 의 연결된 값 증가(마지막 값이 출력 값이 될 수 있도록)
				maze[nextX][nextY] = maze[nowX][nowY] + 1;
				// 추가 된 좌표들 방문 true 로 바꿔주기
				visited[nextX][nextY] = true;
				
			}
			
			
		}
		
	}
	
}
