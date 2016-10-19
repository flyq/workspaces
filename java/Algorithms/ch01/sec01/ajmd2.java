public class ajmd2
{
    public static void main(String[] args)
    {
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);

	System.out.println(gcd(a,b));
    }
    public static int gcd(int p, int q)
    {
	if ( q == 0) return p;
	int r = p % q;
	return gcd(q, r);
    }
}
   
