class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length()-1;
        int j=s2.length()-1;
        
        int carry=0;
        
        StringBuilder s=new StringBuilder();
        
        while(j>=0 || i>=0 || carry!=0)
        {
            int sum=carry;
            
            if(i>=0)
            {
                sum+=s1.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                sum+=s2.charAt(j)-'0';
                j--;
            }
            s.append(sum%2);
            carry=sum/2;
        }
        s.reverse();
        
        int start=0;
        
        while(start<s.length()-1 && s.charAt(start)=='0')
        {
            start++;
        }
        return s.substring(start);
    }
}