package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;

public class Test11047 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] coin = new int[N]; 
        int count = 0;
        
        for(int i=0; i<coin.length; i++)
            coin[i] = Integer.parseInt(br.readLine());
        
        int i = N-1;
        
        while(K>0)
        {
            
            if(coin[i]<=K)
            {
                count += (K/coin[i]);
                K -= coin[i]*(K/coin[i]);
            }
            
            if(K==0)
                break;
                
            i--;
        
        }
        
        System.out.println(count);
        
    }
}