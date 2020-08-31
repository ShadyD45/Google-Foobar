import java.util.HashMap;
class Solution 
{
	private static HashMap<Character, Character> DecryptionMap = new HashMap<>();
	private static final String alphabets = "abcdefghijklmnopqrstuvwxyz";
    
    public static String solution(String x) 
    {
        // Your code here
        int i, j = 25;
        char[] sentence = x.toCharArray();
        String decipheredStr = "";
        
        createMap();
        
        for(char s : sentence)
        {
        	if(Character.isLowerCase(s))
            	{
                	decipheredStr += DecryptionMap.get(s);
            	}
            	else
            	{
                	decipheredStr += s;
            	}
        }
        return decipheredStr;
    }
    
    private static void createMap()
    {
    	for(int i=0, j=25; i < 26 && j >= 0; j--,i++)
    	{
    		DecryptionMap.put(alphabets.charAt(i), alphabets.charAt(j));
    	}
    }
}

public class DecryptMessage
{
	public static void main(String args[])
	{
		Solution obj = new Solution();
		
		System.out.println(obj.solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
		
	}
}
