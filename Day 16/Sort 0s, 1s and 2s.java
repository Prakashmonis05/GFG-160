class Solution {
    public void sort012(int[] arr) {
        // code here
        int zero=0;
        int one=0;
        int two=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else if(arr[i]==2)
            {
                two++;
            }
            
        }
        
        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
        }
        for(int i=zero;i<one+zero;i++)
        {
            arr[i]=1;
        }
        for(int i=zero+one;i<arr.length;i++)
        {
            arr[i]=2;
        }
    }
}