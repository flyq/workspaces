
//import java.util.*;

/**
 * Summary the random numbers
 * @version 1.00 2016-10-19
 * @author FB
 */


public class Random
{
    public static void main(String[] args)
	
    // 0 - 9; different results;
    /*
    {
	int[] a = new int[10];
	for(int i=0; i<10; i++)
	    {
		a[i] = (int)(Math.random() * 10);
		System.out.print(a[i] + " ");
	    }
	System.out.println();
    }
    */
    {
	//java.util.Random ra = new java.util.Random(); //different results
	java.util.Random ra = new java.util.Random(20); //same result
	int[] i = new int[10];
	for(int k = 0; k < 30; k++)
	    {
		System.out.print(ra.nextInt(10) + " ");
	    }
    }
}
