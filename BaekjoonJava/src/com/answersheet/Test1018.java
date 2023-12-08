package com.answersheet;

import java.io.*;
import java.util.StringTokenizer;
public class Test1018
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		char[][] origin;
		
		// 입력된 원본
		origin = new char[M][N];
		String str = "";
		for (int i=0; i<origin.length; i++)
		{
			str = br.readLine();
			for (int j=0; j<origin[i].length; j++)
			{
				origin[i][j] = str.charAt(j);
			}
		}
		
		int min_count = -1;
		for (int i=0; i<origin.length-7; i++)
		{
			int cntB=-1, cntW=-1;
			for (int j=0; j<origin[i].length-7; j++)
			{
				cntB = checkCnt(makeSquare(origin, 8, 8, i, j), 'B');
				cntW = checkCnt(makeSquare(origin, 8, 8, i, j), 'W');
				
				if (i==0 && j==0)
					min_count = (cntB>=cntW) ? cntW : cntB;
				else if (cntB >= cntW)
					min_count = (min_count>=cntW) ? cntW : min_count;
				else
					min_count = (min_count>=cntB) ? cntB : min_count;
			}
				
		}
		
		System.out.println(min_count);
		
	}// end main()
	
	// 원본 -> x, y 사이즈 (시작하는 X, Y 좌표)로 잘려진 배열 반환
	private static char[][] makeSquare(char[][] origin, int x, int y, int startX, int startY)
	{
		char[][] square = new char[x][y];
		
		for (int i=0; i<x; i++)
		{
			for (int j=0; j<y; j++)
			{
				square[i][j] = origin[startX+i][startY+j];
			}
		}
		
		return square;
	}// end makeSquare()
	
	
	// square 에서 count 탐색
	// 시작 옵션 B or W
	private static int checkCnt(char[][] square, char ch)
	{
		int cnt = 0;
		
		// 맨 처음 시작이 ch 와 다르면 ch 로 변경 후 cnt+1
		if (square[0][0] != ch)
		{
			square[0][0] = ch;
			cnt++;
		}
		
		for (int i=0; i<square.length; i++)
		{
			for (int j=0; j<square[i].length; j++)
			{
				// 맨 첫 글자는 비교할 이전 대상이 없어 넘어감
				if (i==0 && j==0)
					continue;
				// 두 번째 이후 맨 첫글자 일 때
				if (i>0 && j==0)
				{
					// 이전 시작과 비교해서 같다면 칠하고 카운트 +1
					if (square[i-1][j]==square[i][j])
					{
						if (square[i][j]=='B')
						{
							square[i][j] = 'W';
							cnt++;
						}
						else
						{
							square[i][j] = 'B';
							cnt++;
						}
					}
					
					continue;
				}
				
				// 줄의 첫 글자를 제외한 나머지 글자들
				if (j>0)
				{
					if (square[i][j-1] == square[i][j])
					{
						if (square[i][j]=='B')
						{
							square[i][j] = 'W';
							cnt++;
						}
						else
						{
							square[i][j] = 'B';
							cnt++;
						}
					}
				}
				
			}
		}
		
		return cnt;
	}// end chkecCnt()

} // class end