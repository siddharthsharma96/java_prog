class K
{
    public static void main(String args[])
    {
		int rows = 5, cols = 5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(j==i)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
/*
01111
10111
11011
11101
11110
*/