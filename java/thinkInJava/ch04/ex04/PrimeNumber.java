/**
 * print prime number 
 * @version 1.00 2016-10-14
 * @author FB
 */
/*
public class PrimeNumber
{
    public static void main(String[] args)
    {
	int i = 0;
	int j = 0;

	for(i = 2; i < 100; i++)
	    {
		boolean prime = true;
		for(j = 2; j < i; j++)
		    {
			if(i % j == 0)
			    prime = false;
		    }
		if (prime = true)
		    System.out.print(i + " ");
	    }
    }
}

*/


public class PrimeNumber
{
    public static void main(String[] args)
    {
	int max = 100;
	// Get the max value from the command line,
	// if the argument has been provided:
	if(args.length != 0)
	    max = Integer.parseInt(args[0]);
	for(int i = 1; i < max; i++)
	    {
		boolean prime = true;
		for(int j = 2; j < i; j++)
		    if(i % j == 0)
			prime = false;
		if(prime)
		    System.out.print(i + " ");
	    }
    }
}
