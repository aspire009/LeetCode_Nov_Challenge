class Solution {
    public int maxPower(String s) {
           
        if(s==""||s==null)
            return 0;
        int len=s.length();
        int max_pow=1;  \\ Minimum value of max power would be 1 if string is not empty 
        int curr_pow=1;
        for(int i=1;i<len;i++)
        {
		   \\ check if the current character is same as the previous character
           curr_pow=(s.charAt(i)==s.charAt(i-1))?curr_pow+1 : 1;
		   
		   \\Maintain the max power achieved till now
           max_pow=Math.max(max_pow,curr_pow); 
        }
        return max_pow;
        
    }
}