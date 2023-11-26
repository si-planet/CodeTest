package com.answersheet;

import java.util.*;
public class Test10250
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i=0; i<t; i++)
		{
			int h, w, n; 
			h = sc.nextInt();	// 층 6
			w = sc.nextInt();	// 방 10
			n = sc.nextInt();	// 손님 60 -> 
			
			int x,y;
			// y 층 구하기
			// x 호 구하기
			if (n%h==0)
			{
				y = h*100;
				x = n / h;
			}
			else
			{
				y = (n%h)*100;
				x = ( n / h ) + 1;
			}
			
			System.out.println(x+y);
			
			
		}
	}

}
