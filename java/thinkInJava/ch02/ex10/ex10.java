import java.util.*;
/**
 * This program outputs 3 inputs, it can't be Compiled.
 * @version 1.00 2016-10-12
 * @author F_B
 */
/*
public class ex10
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner();
	System.out.println("Enter 3 parameter");
	String[] a;
	
	int i = 0;
	do
	    {
		a[i] = sc.nextChar();
		i++;
	    }while(i < 3);
	while ( i < 7 )
	    {
		System.out.println(a[i-3]);
	    };
    }
}
*/

/**
 * This program outputs 3 inputs
 * @version 1.10 2016-10-13
 * @author F_B
 */
public class ex10
{
    public static void main(String[] args)
    {
        int index;

        for (index = 0; index < args.length; ++index)
        {
            System.out.println("args[" + index + "]: " + args[index]);
        }
    }
}

/**
 * This program outputs 3 inputs
 * @version 1.20 2016-10-13
 * @author F_B
 */
/*
public class ex10
{
    public static void main(String[] args)
    {
	System.out.println("args[0] = " + args[0]);
	System.out.println("args[1] = " + args[1]);
	System.out.println("args[2] = " + args[2]);	
    }
}
*/
