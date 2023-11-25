package com.test;

import java.util.*;
public class Test2378_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		int x[][] = new int[n][m];
		for (int i=0; i<x.length; i++)
			for (int j=0; j< x[i].length; j++)
				x[i][j] = sc.nextInt(); 

		
		for (int i=0; i<x.length; i++)
			for (int j=0; j<x[i].length; j++)
				x[i][j] += sc.nextInt();
		
		for (int i=0; i<x.length; i++)
		{
			for (int j=0; j<x[i].length; j++)
				System.out.print(x[i][j] + " ");
			System.out.println();
		}
	}
}
