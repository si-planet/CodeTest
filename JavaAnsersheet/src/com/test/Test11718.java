package com.test;

import java.io.*;
public class Test11718
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = "";
	     
	    while ((str = br.readLine()) != null) 
	        System.out.println(str);
	    		
	}

}
/*
문자열에 br.readLine() 을 담아놓지 않고 사용하면
계속해서 첫 번째줄 인식 -> 있네! 하고 두번째 줄을 출력
해당 방식으로 홀수번째의 print 문을 건너뛰게 된다
*/