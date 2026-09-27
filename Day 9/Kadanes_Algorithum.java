class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int max_sum=arr[0];
        int cur_sum=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            cur_sum=Math.max(arr[i],cur_sum+arr[i]);
            max_sum=Math.max(cur_sum,max_sum);
        }
        return max_sum;
    }
}
