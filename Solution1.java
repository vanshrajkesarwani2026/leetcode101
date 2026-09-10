class Solution1 
{
    public int[] twoSum(int[] nums, int target) 
    {
       int a=0;
       int b=0;
       for(int x=0;x<nums.length-1;x++)
       {
        for(int y=x+1;y<nums.length;y++)
        {
            if(target==(nums[x]+nums[y]))
            {
                a=x;
                b=y;
                break;
            }
        }
       }
       int newnum[]={a,b};
       return newnum;  
    }
}