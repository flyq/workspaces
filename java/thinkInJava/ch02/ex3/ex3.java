/**
 * This pragram prints "Hello, World"
 * @version 1.00 2016-10-11
 * @author F_B
 */
class ATypeName
{
    /* Class body goes here */
    String string;
}

public class ex3
{
    public static void main(String[] args)
    {
	ATypeName a = new ATypeName();
	a.string = "It's me";
	System.out.println(a.string);
    }
}
