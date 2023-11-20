package com.test;

import java.util.*;
public class Test2744
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int arr[] = new int[word.length()]; // 문자길이만큼 방 생성
		
		for (int i=0; i<arr.length; i++)
			arr[i] = word.charAt(i);	// ASCII 코드로 문자를 저장

		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>=65 && arr[i]<=90)	// 대문자
				arr[i] = arr[i]+32;			// ASCII 코드로 대문자 + 32 -> 소문자
			else if (arr[i]>=97 && arr[i]<=122)	// 소문자
				arr[i] = arr[i]-32;				// ASCII 코드로 소문자 -32 -> 대문자
		}
		
		for (int i : arr)
			System.out.printf("%c", i);
	}

}
