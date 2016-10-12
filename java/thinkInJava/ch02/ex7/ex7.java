/**
 * This program makes a static class.
 * @version 1.00 2016-10-12
 * @author F_B
 */
public class ex7
{
    public static void main(String[] args)
    {	
	Incrementable sf = new Incrementable();
	StaticTest st = new StaticTest();
	System.out.println(st.i);
	
	sf.increment();
      	System.out.println(StaticTest.i);

    }
}
class StaticTest
{
    static int i = 47;
}

class Incrementable
{
    static void increment()
    {
	StaticTest.i++;
    }
}
	    
