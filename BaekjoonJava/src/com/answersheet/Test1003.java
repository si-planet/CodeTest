package com.answersheet;

import java.util.*;
import java.io.*;

class Test1003 
{
    static Integer[][] fibonacci = new Integer[41][2]; // 0~41 의 자연수의 0 의 갯수와 1의 갯수;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());

        fibonacci[0][0] = 1; // N=0 , 0의 호출 갯수
        fibonacci[0][1] = 0; // N=0 , 1의 호출 갯수
        fibonacci[1][0] = 0; // N=1 , 0의 호출 갯수
        fibonacci[1][1] = 1; // N=1 , 1의 호출 갯수
        
        while (t-- > 0) 
        {
            int n = Integer.parseInt(br.readLine());
            getFibonacci(n);
            
            sb.append(fibonacci[n][0] + " " + fibonacci[n][1]).append("\n");
        }

        System.out.println(sb);
        
    }// end main()

    private static Integer[] getFibonacci(int num)
    {
        if (fibonacci[num][0]==null || fibonacci[num][1]==null)
        {
            fibonacci[num][0] = getFibonacci(num-1)[0] + getFibonacci(num-2)[0];
            fibonacci[num][1] = getFibonacci(num-1)[1] + getFibonacci(num-2)[1];
        }

        return fibonacci[num];
        
    }// end getFibonacci()

}
