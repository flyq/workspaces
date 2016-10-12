/**
 * This program makes a class.
 * @version 1.00 2016-10-11
 * @author F_B
 */
public class ex5
{
    public static void main(String[] args)
    {
	DataOnly dataonly = new DataOnly();
	dataonly.i = 47;
	dataonly.d = 1.1;
	dataonly.b = false;

	System.out.println("dataonly.i is " + dataonly.i + "\n" + "dataonly.d is " + dataonly.d + "\n" + "dataonly.b is " + dataonly.b);
    }
}

class DataOnly
{
    int i;
    double d;
    boolean b;
}
