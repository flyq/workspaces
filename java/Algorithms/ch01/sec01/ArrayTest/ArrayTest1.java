public class ArrayTest1
{
    public static void main(String[] args)
    {
	int[] a = new int[20];
	for (int i = 0; i < 20; i++)
	    {
		a[i] = (int)(Math.random()*100);
		System.out.print(a[i] + " ");
	    }

	double max = a[0];
	for (int i = 1; i < a.length; i++)
	    if (a[i] > max)
		max = a[i];

	System.out.println(max);
    }
}
    
