class Solution11 
{
    public int maxArea(int[] height) 
    {
        int maxin=0;
        for( int i=0;i<height.length-1;i++)
        {  
            for(int j=i+1;j<height.length;j++)
            { 
                int a=Math.min(height[i],height[j]);
                if((a*(Math.abs(i-j)))>maxin)
                { 
                    maxin=a*(Math.abs(i-j));
                }
                else{continue;}
            }
        }
        return maxin;
    }
}