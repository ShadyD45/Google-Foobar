// This Solution works too but fails some test cases mostly because of exceeding time limit when the input number is very big 
// As we have to mod and divide very large numbers these operation become very expensive in terms of time
// The Python solution works and passed all test cases plus it was easy to implement than using BigInteger in Java

import java.math.BigInteger; 
class Solution
{
	public int solution(String strNum)
	{
		BigInteger iPallets = new BigInteger(strNum);
		BigInteger rem;
		BigInteger ZERO = BigInteger.ZERO;
		BigInteger ONE = BigInteger.ONE;
		BigInteger TWO  = BigInteger.valueOf(2);
		
		int iTransformationCnt = 0;
		
		while(iPallets.compareTo(ONE) == 1)
		{
			rem = iPallets.remainder(TWO);
			if(rem.compareTo(ZERO) == 0)
			{
				iPallets = iPallets.divide(TWO);
			}
			else
			{
				iPallets = iPallets.add(ONE);
			}
			iTransformationCnt++;
		}
		
		return iTransformationCnt;
	}
}

// Driver class with funtion main()
public class FuelInjectionPerfection
{
	public static void main(String[] args)
	{
		Solution obj = new Solution();
		
		// Change the inputs 
		System.out.println(obj.solution("9"));	
	}
}
