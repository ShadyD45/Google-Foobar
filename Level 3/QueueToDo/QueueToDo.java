import java.util.ArrayList;
class Solution 
{
    public static int solution(int start, int length)
    {
        //Your code goes here
        int iChecksum = 0;
        int n = length;
        int j = 0;
        for(int i = 0; i <= n ; ++i)
        {	
            if(i != n)
            {
            	//Compute XOR for current worker
            	iChecksum = iChecksum ^ start;
            	++start;
            }
            else
            { 
                start += j;	//Skip the next "j" workers
                n = n - 1;
                i = -1;
                ++j;
            }
        }
        return iChecksum;
    }
}

public class QueueToDo
{
	public static void main(String args[])
	{
		Solution obj = new Solution();
		
		//Change the parameters to function solution for different test cases
		System.out.println("\tOutput: "+ obj.solution(17,4));
	}
}
