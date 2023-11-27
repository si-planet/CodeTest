package com.answersheet;

import java.io.*;
import java.util.Arrays;
public class Test10989_3
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int[] cnt = new int[10001];	// 범위 1 ~ 10000 (0 번방 미사용)
		for (int i=0; i<N; i++)
			cnt[Integer.parseInt(br.readLine())]++;
		br.close();

		
		for (int i=1; i<cnt.length; i++)
		{
			while(cnt[i]>0)	// 카운트 0 인 방은 필요X (not 사용보다 다른 조건을 이용할 것)
			{
				bw.write(i + "\n");
				cnt[i]--;
			}
		}
		bw.flush();
		bw.close();
	}

}
// 빠른입출력 BufferedReader 와 BufferedWriter(혹은 StringBuilder) 사용 필수
// 방법 2 : 입력 범위 전체에 대해 배열 방을 만들어 Count 하고
//          해당 배열의 방을 차례로 count 가 0 이 될 때까지 출력

// 시간복잡도는 O(N + K) 이다. K는 자릿수를 의미하는데 입력데이터가 K 보다 훨 씬 큰경우. 
// 즉 데이터가 많으면 많을 수록 O(N) 에 가깝기 때문에 이상적으로는 O(N) 이라고 보아도 무방

/*
 *  위 출력과 동일한 방법으로 while 대신에 String 의 repeat() 사용하는 방법 
 *  (단, 자바 11 버전 이후 지원하는 새로운 기능)
        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i] != 0)
            {
                String str = String.valueOf(i)+"\n";
                bw.write(str.repeat(arr[i]));
            }
        }
*/
