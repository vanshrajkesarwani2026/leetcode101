class Solution6
{
    public String convert(String s, int numRows) 
    {
        if (numRows == 1 || numRows >= s.length())
        {
            return s;
        }
        int cycleLen = 2 * numRows - 2;                 // chars used per full down+diagonal cycle
        int numCycles = (int) Math.ceil((double) s.length() / cycleLen);
        int numCols = numCycles * (numRows - 1);
        char arr[][]=new char[numRows][numCols];
        int count=0;
        int count1=0;
        String neww="";
            for(int x=0;x<numCols;x++)
            {
                for(int y=0;y<numRows;y++)
                {
                    if(count1<s.length())
                    {
                        if(((x%(numRows-1)))==0)
                        {
                            arr[y][x]=s.charAt(count1);
                            count+=1;
                            count1+=1;
                        }
                        else if((x+y)%(numRows-1)==0)
                        {
                            arr[y][x]=s.charAt(count1);
                            count+=1;
                            count1+=1;
                        }
                        else
                        {
                            arr[y][x]=' ';
                            count+=1;
                        }
                    } 
                    else
                    {
                        break;
                    }
                }
            }
        for(int x=0;x<numRows;x++)
        {
            for(int y=0;y<numCols;y++)
            {
                System.out.print(arr[x][y]+" ");
                if(Character.isWhitespace(arr[x][y]) == false)
                {
                    neww=neww+arr[x][y];
                }
            }
            System.out.println();
        }
        System.out.println(neww);
        String result =neww.replace("\u0000", "");
        return result;
    }
}