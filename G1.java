class G1
{
    public static void main(String args[])
    {
		int rows = 5, cols = 5;
        for(int i=rows;i>=1;i--)
        {
            for(int j=cols;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/