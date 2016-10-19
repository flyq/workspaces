import java.util.*;

public class ajmd
{
    public static void main(String[] args)
    {
	int p, q;
	p = Integer.parseInt(args[0]);
	q = Integer.parseInt(args[1]);

	while(q != 0)
	    {
		int r;
		r = p % q;
		p = q;
		q = r;
	    }
	System.out.println(p);
    }
}
