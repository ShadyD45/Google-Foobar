// Given a list of numbers and a key find the first sublist in the list that adds up to the given key and return the start and end index of the list.
// The start index must be always less than or equal to end index i.e. start <= end (The numbers should be contigous)
// If there is no sublist present then return [-1, -1]

import java.io.*;

class Solution 
{
    public static int[] solution(int[] iarrList, int iKey) 
    {
       // Your code here
       int iSum, iarrLen = iarrList.length;
       int[] iarrResult = {-1, -1};
	   
        for (int i = 0; i < iarrLen; i++)
        {
            iSum = iarrList[i];
            // Try all subarrays following starting point
            for (int j = i + 1; j <= iarrLen; j++) 
            {
            	//Found a sublist which adds up to the given key (iKey)
                if (iSum == iKey) 
                {
                	iarrResult[0] = i;
                	iarrResult[1] = j - 1;
                    	return iarrResult;
                }
                //iSum is bigger than given Key or index reached at end of array
                if (iSum > iKey || j == iarrLen) 
                {
                    break;
                }
                iSum = iSum + iarrList[j];
            }
        }
        return iarrResult;
    }
}

public class CodedMessages
{
	public static void main(String args[])
	{
		Solution obj = new Solution();
		int res[] = new int[2];
		//Change the values in the array for test inputs
		int input[] = {4,4,2,3,4,4};
		res = obj.solution(input, 8);
		for(int i=0;i<2;i++)
			System.out.print(res[i] + ", ");
	}
}
