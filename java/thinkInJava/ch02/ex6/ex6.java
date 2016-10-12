/**
 * This program makes a function.
 * @version 1.00 2016-10-12
 * @author F_B
 */
public class ex6
{
    public static void main(String[] args)
    {
	class Test
	{
	    int storage(String s)
	    {
		return s.length() * 2;
	    }
	}
	
	Test i = new Test();	
	System.out.println(i.storage("hello, world"));
    }
}
