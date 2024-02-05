package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Test12847{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long max = -1;
        
        int[] day_pay = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<day_pay.length; i++){
            day_pay[i] = Integer.parseInt(st.nextToken());
        }

        long money = 0;
        for(int i=0; i<day_pay.length-m+1; i++){
            if(i==0){
                for(int j=i; j<i+m; j++)
                    money+=day_pay[j];
            }else{
                money-=day_pay[i-1];
                money+=day_pay[i+m-1];
            }
            if(max < money)
                max = money;
            System.out.println("i :" + i + " , money : " + money + ", max : " + max);
        }
        
        System.out.println(max);
    }
}