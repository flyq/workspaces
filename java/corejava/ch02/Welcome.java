/**
 * This program displays a greeting from the authors.
 * @version 1.20 2016-07-25
 * @author Liquan FENG
 */
public class Welcome
{
    public static void main(String[] args)
    {
	String[] greeting = new String[3];
	greeting[0] = "Welcome to Core Java";
	greeting[1] = "by Cal Horstmann";
	greeting[2] = "and Gary Cornell";

	for (String g : greeting)
	    System.out.println(g);
    }
}

	    
	    
