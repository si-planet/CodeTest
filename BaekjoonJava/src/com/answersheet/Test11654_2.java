package com.answersheet;

import java.io.IOException;

public class Test11654_2
{

	public static void main(String[] args)
	{
		int asc;
		try
		{
			asc = System.in.read();
			// System.in 의 read() 를 사용하여 아스키 코드 값으로 바로 받아오기
			// 단, 예외처리 필수 -- 여기에서는 try~catch 구문을 사용하였음
			System.out.println(asc);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
/*
한 글자만 읽어와서 아스키코드 출력하는 방법
1. Scanner 로 읽어와서 charAt() 사용
2. System.in 을 직접 사용하여 아스키코드로 받기

2번이 더 쉽고 간결하다

Scanner 의 경우 정규식을 남발함으로써 성능이 떨어진다
*/

