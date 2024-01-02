package com.answersheet;

import java.math.BigInteger;

public class Solution120840
{
	class Solution {
		public int solution(int balls, int share)
		{
			int answer = 0;

			// 조합
            // 분자
            BigInteger numerator = factorial(BigInteger.valueOf(balls));
            //분모
            BigInteger denominator = factorial(BigInteger.valueOf(balls - share)).multiply(factorial(BigInteger.valueOf(share)));
            // 나누기 ( zero divide 피하기 위해서)
            answer = numerator.divide(denominator).intValue();

			return answer;
		}

		private BigInteger factorial(BigInteger a)
		{
			if (a.equals(BigInteger.ZERO) || a.equals(BigInteger.ONE))
				return BigInteger.ONE;

			return a.multiply(factorial(a.subtract(BigInteger.ONE)));
		}
}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
