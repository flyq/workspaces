import java.util.Random;

public class ArrayTest2
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
	
	double sum = 0.0;
	for (int i = 0; i < a.length; i++)
	    sum += a[i];
	double average = sum / a.length;
	System.out.println(average);
    }
}
