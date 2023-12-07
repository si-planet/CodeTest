package com.answersheet;

import java.io.*;
import java.util.*;
public class Test10814_2
{
	private static class Person implements Comparable<Person>
	{
		int age; 
		String name; 
		int index;
		
		Person (int age, String name, int index)
		{
			this.age = age;
			this.name = name;
			this.index = index;
		}
		
		public int compareTo(Person o)
		{
			if (this.age != o.age)
				return this.age-o.age;
			return index - o.index;
		}
			
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		Person[] people = new Person[N];
		
		for (int i=0; i<N; i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			people[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken(), i);
		}
		br.close();
		
		Arrays.sort(people);
		
		for (Person person : people)
			sb.append(person.age + " " + person.name + "\n");

		System.out.println(sb);
		
	}// end main()

}
