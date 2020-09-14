class J
{
    public static void main(String args[])
    {
        int rows = 4, cols = 5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {
                if(i==1 || i==4 || j==1 ||j==5)
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
00000
01110
01110
00000
*/