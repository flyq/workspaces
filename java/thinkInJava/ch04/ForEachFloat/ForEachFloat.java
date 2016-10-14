/**
 * foreach example
 * @version 1.00 2016-10-14
 * @author FB
 */
import java.util.*;

public class ForEachFloat
{
    public static void main(String[] args)
    {
	Random r = new Random(47);
	float f[] = new float[10];
	for(int i = 0; i < 10; i++)
	    f[i] = r.nextFloat();
	for(float x: f)
	    System.out.println(x);
    }
}
