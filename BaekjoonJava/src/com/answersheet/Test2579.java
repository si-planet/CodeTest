package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2579
{
	static int[] stair;	// 다이나믹 프로그래밍 다시 확인
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		stair = new int[N+1];	// 0 은 시작점 , 1 ~ N 까지 계단 점수로 활용
		
		for (int i=1; i<stair.length; i++)
			stair[i] = Integer.parseInt(br.readLine());
		br.close();

		// 게임
		int max = getScore(N+1, 0, 0);
		System.out.println(max);
		
		
	}// end main()

	// 시작하는 지점을 마지막 계단으로 설정(필수)
	// 1칸 or 2칸 이동 : end-1 , end-2
	// 1칸을 연속으로 간 횟수가 2가 되면 무조건 2 칸 움직임 + count 초기화
	private static int getScore(int end, int sum, int count)
	{
		if (end < 1)
			return sum;
		else
		{
			// 계단 점수 더하기
			sum += stair[end];
			
			// count 에 따라 1 또는 2칸 내려가기
			// 주의 : end 의 값은 0 또는 자연수여야함
			if (count==2)
			{
				if (end > 2)
				{
					return getScore(end-2, sum, 0);
				}
				else
				{
					return -1;
				}
			}
			else
			{
				if (end > 2)
				{
					return Math.max(getScore(end-1, sum, count+1), getScore(end-2, sum, 0));
				}
				else 
				{
					return getScore(end-1, sum, count+1);
				}
					
			}
		}
		
	}// end getScore()
	
}
