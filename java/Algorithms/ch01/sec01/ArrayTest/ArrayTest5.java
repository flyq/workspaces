import java.util.Random;

public class ArrayTest5
{
    public static void main(String[] args)
    {
	int[][] a = new int[4][4];
	int[][] b = new int[4][4];
	Random ra = new Random(10);
	for (int i = 0; i < 4; i++)
	    for (int j = 0; j < 4; j++)
	    {
		a[i][j] = ra.nextInt(100);
		b[i][j] = ra.nextInt(100);
		System.out.print(b[i][j] + "\t");
		if (j == 3)
		    System.out.println();
	    }

	int N = 4;
	int[][] c = new int[N][N];
	for (int i = 0; i < N; i++)
	    for (int j = 0; j < N; j++)
		{
		    for (int k = 0; k < N; k++)
			c[i][j] += a[i][k]*b[k][j];//initialization is 0;
		}


	for (int i = 0; i < 4; i++)
	    for (int j = 0; j < 4; j++)
	    {
		System.out.print(c[i][j] + "\t");
		if (j == 3)
		    System.out.println();
	    }       
    }
}
