package com.retry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

class Test2178 {
    
    static int n; // 행
    static int m; // 열
    // 미로
    static int[][] maze;
    // 좌표 방문 여부
    static boolean[][] visited;
    // 탐색 범위 :      상 하  좌 우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];        

        // 미로 값 채우기
        for(int i=1; i<=n; i++){
            String str = br.readLine();
            for(int j=1; j<=m; j++){
                maze[i][j] = (str.charAt(j-1)-'0');
            }
        }
        br.close();

        // 미로 탐색 수행        
        bfs(1, 1);

        // n, m출력        
        System.out.println(maze[n][m]);

    }// end main()

    static void bfs(int x, int y){
        // bfs 탐색을 위한 Queue 생성
        Queue<int[]> q = new LinkedList<>();
        
        // 시작 노드 추가 -> 방문 여부 true
        q.add(new int[] {x,y});
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            // 현재 좌표
            int[] now = q.poll();
            int nowX = now[0]; // 현재 X 좌표
            int nowY = now[1]; // 현재 Y 좌표

            // 상, 하, 좌, 우 확인하기 위함 => dx, dy의 크기
            for(int i=0; i<4; i++){
                // 확인할 다음 좌표 x, y 값 구하기
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 좌표의 범위를 벗어날 때 => 현재 좌표 무시하고 넘기기
                if(nextX<1 || nextY<1 || nextX>n || nextY>m)
                    continue;

                // 이미 방문한 좌표 또는 0 일 때 => 현재 좌표 무시하고 넘기기
                if(visited[nextX][nextY]==true || maze[nextX][nextY]==0)
                    continue;
                
                // 다음 좌표 Queue 에 추가
                q.add(new int[] {nextX, nextY});
                // 방문 여부 true
                visited[nextX][nextY] = true;
                // 추가하는 좌표의 값 1 증가
                maze[nextX][nextY] = maze[nowX][nowY] + 1;
            }
        }


    }// end dfs()


}// end Test2178
