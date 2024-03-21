package com.answersheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Test9095 {
    
    static Integer dp[] = new Integer[11]; // 0 미사용, 정수는 11 보다 작은 양수

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();        
        
        // 1 2 4 7 14 28 
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            
            if(dp[n]==null){
                for(int i=4; i<=n; i++){
                    if(dp[i]!=null)
                        continue;
                    else {
                        dp[i]=0;
                        for(int j=1; j<=3; j++){
                            dp[i] += dp[i-j];
                        }
                    }
                }
            }
            
            result.append(dp[n]+"\n");
        }
        br.close();

        System.out.println(result.toString());

    }
}