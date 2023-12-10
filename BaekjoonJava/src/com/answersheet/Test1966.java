package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test1966
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0)
		{
			st = new StringTokenizer(br.readLine(), " ");
				
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int i=0; i<n; i++)
			{
				// 초기 위치, 중요도
				q.add(new int[] {i, Integer.parseInt(st.nextToken()) });
			}
			
			int count = 0;
			
			while (q.isEmpty())	// 한 케이스에 대한 반복문
			{
				int[] front = q.poll();
				boolean isMax = true;	// front 가 가장 큰 원소인지 판단
				
				// 큐에 남아있는 요소들과 중요도 비교
				for (int i=0; i<q.size(); i++)
				{
					// 처음 뽑은 요소보다 큐에 있는 i 번째 원소가 중요도가 클 경우
					if (front[1] < q.get(i)[1])
					{
						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보냄
						q.offer(front);
						for (int j=0; j<i; j++)
						{
							q.offer(q.poll());
						}
						
						// front 요소가 가장 큰 요소가 아니었으므로 false 를 하고 탐색 종료
						isMax = false;
						break;
					}
					
				}
				
				// front 원소가 가장 큰 원소가 아니었으므로 다음으로 넘어감
				if (isMax==false)
					continue;
				
				// front 원소가 가장 큰 원소 -> 출력
				count++;
				// 찾고자 하면 문서라면 종료
				if (front[0] == m)
					break;
			}
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb);
		
	}// end main()

}
