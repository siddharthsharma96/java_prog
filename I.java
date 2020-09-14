class I
{
    public static void main(String args[])
    {
		int rows = 4;
        for(int i=1;i<=rows;i++)
        {
            for(int j=rows+i;j>=i;j--)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
/*
5 4 3 2 1 
6 5 4 3 2 
7 6 5 4 3 
8 7 6 5 4 
*/