import java.util.Random;

public class ArrayTest4
{
    public static void main(String[] args)
    {
	int[] a = new int[20];
	Random ra = new Random(10);
	for (int i = 0; i < a.length; i++)
	    {
		a[i] = ra.nextInt(100);
		System.out.print(a[i] + " ");
	    }

	System.out.println();

	
	int N = a.length;
	for (int i = 0; i < N/2; i++)
	    {
		int temp = a[i];
		a[i] = a[N-1-i];
		a[N-1-i] = temp;
	    }
	for (int i = 0; i < N; i++)
	    System.out.print(a[i] + " ");

	System.out.println();
    }
}
	     
       
