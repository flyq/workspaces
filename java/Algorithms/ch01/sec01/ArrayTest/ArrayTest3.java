public class ArrayTest3
{
    public static void main(String[] args)
    {
	int[] a = new int[20];
	for (int i = 0; i < a.length; i++)
	    {
		a[i] = (int)(Math.random()*100);
		System.out.print(a[i] + " ");
	    }
	System.out.println();
	
	int N = a.length;
	int[] b = new int[N];
	for (int i = 0; i < N; i++)
	    {
		b[i] = a[i];
		System.out.print(b[i] + " ");
	    }
	System.out.println();

    }
}
      
