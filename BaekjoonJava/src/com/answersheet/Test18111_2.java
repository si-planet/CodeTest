package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test18111_2
{
	static int time = Integer.MAX_VALUE;
	static int height = 0;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[][] map = new int[N][M];
		for (int i=0; i<map.length; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<map[i].length; j++)
			{
				int temp = Integer.parseInt(st.nextToken());
				map[i][j] = temp;
				
				max = Math.max(max, temp);
				min = Math.min(min, temp);
			}
		}
		
		// 높이가 높은 것 부터 탐색하는 방법
		for (int k=max; k>=min; k--)
		{
			int t = 0;	// 해당 높이에서 걸리는 시간
			int item = B; // 블록 갯수
			
			for (int i = 0; i<map.length; i++)
			{
				for (int j=0; j<map[i].length; j++)
				{
					
					if (map[i][j] > k)
					{
						t += 2*(map[i][j]-k);
						item += (map[i][j]-k);
					}
					else if (map[i][j] < k)
					{
						t += (k-map[i][j]);
						item -= (k-map[i][j]);
					}
					
				}
				
			}

			if ((item>=0) && (t<time))
			{
				height = k;
				time = t;
			}
			
		}
		
		System.out.println(time + " " + height);
		
	}//  end main()
	
}
