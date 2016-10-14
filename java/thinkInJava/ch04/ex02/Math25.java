/**
 * sort 25 random numbers.
 * @version 1.00 2013-10-14
 * @author F_B
 */
import java.util.*;

public class Math25
{
    static Random r = new Random(47);
    public static void compareRand()
    {
	int a = r.nextInt();
	int b = r.nextInt();
	System.out.print("a = " + a + ", b = " + b);
	if(a < b)
	    System.out.println(" a < b");
	else if(a > b)
	    System.out.println(" a > b");
	else
	    System.out.println(" a = b");
    }
    public static void main(String[] args)
    {
	
	for(int k = 0; k < 25; k++)
	    {
		compareRand();
	    }
    }
}
