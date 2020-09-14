class H
{
    public static void main(String args[])
    {
		int rows = 4, cols = 5; 
        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<=(rows+i);j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
*/
