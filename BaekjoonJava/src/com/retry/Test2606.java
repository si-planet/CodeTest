package com.retry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

class Test2606 {
    static int computer;
    static Integer[][] network; 
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st;
        computer = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());

        // 0 번 미사용
        network = new Integer[computer+1][computer+1];
        visited = new boolean[computer+1];
        
        while(line-->0){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network[a][b] = network[b][a] = 1;
        }
        br.close();

        Stack<Integer> stack = new Stack<>();
        // 시작 번호 1번
        stack.add(1);
        visited[1]=true;

        while(!stack.isEmpty()){
            
            int now = stack.pop();
            for(int i=1; i<network.length; i++){
                if(network[now][i]!=null && !visited[i]){
                    stack.add(i);
                    visited[i]=true;
                }
            }
        }
        
        int sum=0;
        for(boolean b : visited){
            if(b) sum+=1;
        }
        
        System.out.println(sum-1);
    }



}