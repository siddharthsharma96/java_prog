class O
{
    public static void main(String args[])
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(j<=i)
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
011111
001111
000111
000011
000001
000000
*/