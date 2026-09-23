import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int floor=arr.length/3;
        // code here
        
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(freq.containsKey(arr[i]))
            {
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else
            {
                freq.put(arr[i],1);

            }
        }
        ArrayList<Integer> majority=new ArrayList<Integer>();
        
        for(Integer key: freq.keySet())
        {
            if(freq.get(key)>floor)
            {
                majority.add(key);
            }
        }
        Collections.sort(majority);
        return majority;
        
    }
}