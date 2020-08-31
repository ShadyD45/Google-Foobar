class Solution 
{
    public static String solution(String x) 
    {
        // Your code here
        int i, j = 25;
        char[] sentence = x.toCharArray();
        String decipheredStr = "";
        final String alphabets = "abcdefghijklmnopqrstuvwxyz";
        
        for(char s : sentence)
        {
            if(Character.isLowerCase(s))
            {
                decipheredStr += alphabets.charAt(getLetterPosition(s) + 1);
            }
            else
            {
                decipheredStr += s;
            }
        }
        
        return decipheredStr;
    }
    
    private static int getLetterPosition(char ch)
    {
        final String alpha = "zyxwvutsrqponmlkjihgfedcba";
        int res = 0;
        for(int i=0;i<alpha.length();i++)
        {
            if(alpha.charAt(i) == ch)
            {
                res = i;
        	break;
            }
        }
        return res;
    }
}


//Driver Class
public class Main
{
	public static void main(String args[])
	{
		Solution obj = new Solution();
		
		System.out.println(obj.solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
		
	}
}
