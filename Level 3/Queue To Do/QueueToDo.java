class Solution 
{
    public static int solution(int start, int length)
    {
        //Your code goes here
        int iChecksum = 0;	// XOR of a number with 0 results the number itself
        int j = 0;
        for(int i = 0; i <= length ; ++i)
        {	
            if(i != length)
            {
            	//Compute XOR of current worker id with the checksum
            	iChecksum = iChecksum ^ start;
            	++start;
            }
            else
            { 
                start += j;	//Skip the next "j" workers
                length = length - 1;
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
