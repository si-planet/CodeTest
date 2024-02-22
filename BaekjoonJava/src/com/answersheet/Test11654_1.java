package com.answersheet;

import java.util.*;
public class Test11654_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int asc = sc.next().charAt(0);
		// charAt() : String 에서 char 로 문자열을 잘라 문자로 반환
		// int 타입으로 문자를 받음으로 그에 대응하는 ASCII 코드 값이 저장 되는 형태
		sc.close();
		System.out.println(asc);
	}

}
/*
한 글자만 읽어와서 아스키코드 출력하는 방법
1. Scanner 로 읽어와서 charAt() 사용
2. System.in 을 직접 사용하여 아스키코드로 받기

2번이 더 쉽고 간결하다

Scanner 의 경우 정규식을 남발함으로써 성능이 떨어진다
*/

