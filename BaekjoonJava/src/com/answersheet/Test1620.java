package com.answersheet

import java.util.*;
import java.io.*;


class Test1620
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer,String> num = new HashMap<>();
        HashMap<String,Integer> name = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++)
        {
            String str = br.readLine();
            num.put(i,str);
            name.put(str,i);
        }

        for(int i=0; i<m; i++)
        {
            String str = br.readLine();
            int first = str.charAt(0) - '0';
            if (first > 0 && first <= 9)
            {
                sb.append(num.get(Integer.parseInt(str))).append("\n");
            }
            else
            {
                sb.append(name.get(str)).append("\n");
            }
        }

        System.out.println(sb);
    }
}