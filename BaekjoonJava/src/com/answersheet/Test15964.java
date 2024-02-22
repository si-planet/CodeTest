package com.answersheet;

import java.util.*;
public class Test15964
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		long a, b;
		
		a = sc.nextLong();
		b = sc.nextLong();
		
		sc.close();
		System.out.println((a+b)*(a-b));
	}
}
/*
int 로 계산시 -> 30 점
long 으로 계산시 -> 100 점

결과 값이 int(4Byte)에 담기지 않을 수 있기 때문에
long(8Byte)로 타입을 지정해주어야한다
*/
