class Solution {
    public int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        // code here
        int n=arr.length;
        int min=arr[0];
        int max=arr[n-1];
        
        int ans=max-min;
        
        for(int i=0;i<n-1;i++)
        {
            int newMin=Math.min(arr[0]+k,arr[i+1]-k);
            int newMax=Math.max(arr[i]+k,arr[n-1]-k);
            if(newMin<0)
            {
                continue;
            }
            ans=Math.min(ans,newMax-newMin);
        }
        return ans;
    }
}
