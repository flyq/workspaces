/**
 * use while instead of ex02
 * @version 1.00 2016-10-14
 * @author F_B
 */
import java.util.*;

public class UseWhile
{
    static Random r = new Random(47);
    
    public static void IntCompare()
    {
	int a = r.nextInt();
	int b = r.nextInt();
	System.out.print("a = " + a + ", b = " + b);
	if(a < b)
	    System.out.println("\t\t a < b");
	else if(a > b)
	    System.out.println("\t\t a > b");
	else
	    System.out.println("\t\t a = b");
    }
    
    public static void main(String[] args)
    {
	while(true)
	    {
		IntCompare();
	    }
    }
}
