package com.answersheet;

import java.io.*;
public class Test1157_1
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String str = br.readLine().toUpperCase();
		
		int arr[] = new int[26];	// 영문자는 26 개
        if(str.length()!=1)
        {
    		for (int i=0; i<str.length(); i++)
    			arr[str.charAt(i)-65]++;
    		
    		int max = 0;
    		int num=0 , cnt=1;
    		for (int i=0; i<arr.length; i++)
    		{
    			if (arr[i]>max)
    			{
    				max = arr[i];
    				num = i;
    			}
    			else if (arr[i]==max)
    				cnt++;
    			else
    				continue;
    		}
    		
    		if (cnt > 1)
    			System.out.println("?");
    		else
    			System.out.printf("%c", (num+65));
        }
        
        else if(str.length()==1)
            System.out.printf("%c", str.charAt(0));
	}

}
/*
1. 입력받은 문장(단어)를 모두 대문자로 바꾸어 줌
-> 대소문자 관계없이 카운트 + 출력 대문자
 
2. arr[] 로 영문자 알파벳 갯수만큼 방을 만들어
-> 단어 길이만큼 반복문을 돌려서 해당 (대문자-65)==(ASCII Code 숫자) 배열 방의 값을 증가 시킨다
-> 값의 갯수 만큼 숫자가 들어있는 배열 완성

3. 가장 큰 값, 그리고 그 해당 값의 방 번호, 같은 값이 존재하는지 확인
-> 큰 값이 나올때마다 갱신
-> 갱신될 때 같이 번호 갱신 (+65 하면 알파벳이 될 숫자)
-> 같은 값이 되면 카운트 증가

4. 마지막에 cnt 확인하여 1 이상일 경우 ? 반환 1일 경우 해당 알파벳 반환

5. 1글자 일 경우 인식하지 못하는 상황이 확인되어 한 글자일 경우는 해당 알파벳 바로 출력 할 수 있게 함

 */
