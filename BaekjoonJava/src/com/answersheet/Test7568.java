package com.answersheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test7568
{

	static class Person
	{
		int xKg; 
		int yCm;
		
		public Person(int xKg, int yCm)
		{
			this.xKg = xKg;
			this.yCm = yCm;
		}
		
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] result = new int[n];
		for (int i=0; i<result.length; i++)
			result[i] = 1;
		
		Person[] people = new Person[n];
		for (int i=0; i<people.length; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			people[i] = new Person( Integer.parseInt(st.nextToken()) , Integer.parseInt(st.nextToken()) );
		}
		
		for (int i=0; i<people.length-1; i++)
		{
			for (int j=i+1; j<people.length; j++)
			{
				if (people[i].xKg > people[j].xKg && people[i].yCm > people[j].yCm)
				{
					result[j]++;
				}
				else if (people[i].xKg < people[j].xKg && people[i].yCm < people[j].yCm)
				{
					result[i]++;
				}
			}
		}
		
		for (int rank : result)
			System.out.print(rank+" ");
	}

}
