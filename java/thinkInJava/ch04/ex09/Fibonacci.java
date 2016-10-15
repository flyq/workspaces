/**
 * print Fibonacci
 * @version 1.00 2016-10-14
 * @author FB
 */
/*
public class Fibonacci
{
    static void printfibonacci(int a)
    {
	int[] b;
	b = new int[a];
	b[0] = b[1] = 1;
	
	for(int i = 0; i < a; i++)
	    {
		b[i+2] = b[i+1] + b[i];
		System.out.print(b[i] + " ");
	    }
    }
    public static void main(String[] args)
    {
	int k;
	
	printfibonacci(8);
    }
}
*/

public class Fibonacci
{
    static int fib(int n)
    {
	if (n <= 2)
	    return 1;
	return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args)
    {
	// Get the max value from the command line:
	int n = Integer.parseInt(args[0]);
	if(n < 0)
	    {
		System.out.println("Cannot use negative numbers");
		return;
	    }
	for(int i = 1; i <= n; i++)
	    System.out.print(fib(i) + ", ");
    }
}
