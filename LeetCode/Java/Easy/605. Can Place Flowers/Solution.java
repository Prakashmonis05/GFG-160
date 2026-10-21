class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int point=0;
        int plant=0;
        while(point<len)
        {
            if(flowerbed[point]==1)
            {
                point+=2;
            }
            else if(point+1<len && flowerbed[point+1]==1)
            {
                point+=3;
            }
            else
            {
                plant+=1;
                point+=2;
            }
        }

        if(plant>=n)
            return true;
        else
            return false;
    }
}