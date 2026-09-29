class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int pre=1;
        int suff=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(suff==0)
            {
                suff=1;
            }
            
            pre=pre*arr[i];
            suff=suff*arr[n-i-1];
            
            max=Math.max(max,Math.max(pre,suff));
        }
        
        // int max=Integer.MIN_VALUE;
        // int cur_max;
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i;j<n;j++)
        //     {
        //         cur_max=1;
        //         for(int k=i;k<j;k++)
        //         {
        //             cur_max*=arr[k];
        //         }
        //         max=Math.max(max,cur_max);
        //     }
        // }
        return max;
    }
}