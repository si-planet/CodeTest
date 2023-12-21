package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test18111_1
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] check = new int[257];	// 중복되는 높이 체크
		int[][] origin = new int[N][M];
		for (int i=0; i<origin.length; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			for (int j=0; j<origin[i].length; j++)
			{
				int temp = Integer.parseInt(st.nextToken());
				origin[i][j] = temp;
				
				if (check[temp]==0)
					check[temp]++;
			}
		}
		
		int[][] timeHeight = new int[257][2];
		int num = 0;
		for (int i=0; i<origin.length; i++)
		{
			for (int j=0; j<origin[i].length; j++)
			{
				int standard = origin[i][j];
				
				if (check[standard]>0)
				{
					check[standard]--;
					timeHeight[num][0] = checkTime(standard, origin, B);
					timeHeight[num][1] = standard;
					
					System.out.println("origin["+i+"]["+j+"] : height : " + standard + ", time : " + timeHeight[num][0]);
					num++;
				}
			}
		}
		
		int minTime = Integer.MAX_VALUE;
		int largeHeight = 0;
		for (int i=0; i<num; i++)
		{
            if(timeHeight[i][0]==-1)
                continue;
			
			if (timeHeight[i][0] < minTime)
			{
				minTime = timeHeight[i][0];
				largeHeight = timeHeight[i][1];
			}
			else if (timeHeight[i][0] == minTime) 
			{
				if (timeHeight[i][1] > largeHeight)
				{
					largeHeight = timeHeight[i][1];
				}
			}
		}
		
		System.out.println(minTime + " " + largeHeight);
		
		
	}// end main()
    
	private static int checkTime(int standard, int[][] origin, int B)
	{
		int time = 0;
		
		for (int i=0; i<origin.length; i++)
		{
			for (int j=0; j<origin[i].length; j++)
			{
				int now = origin[i][j];
				
				if (now==standard)
				{
					continue;
				}
				else if (now>standard)
				{
					while (now>standard)
					{
                        now--;
						time += 2;	// 파내는 작업 2초
						B++;	// 블럭 갯수 +1
					}
				}
				else
				{
					while (now<standard)
					{
						if (B>0)
						{
							B--; // 블럭 갯수 -1
							time += 1; // 올리는 작업 1초
							now ++;
						}
						else
						{
							return -1;
						}
					}
				}
				
			}// j for 문
			
		}// i for 문
		
		return time;
	}// end checkTime()
	
}
