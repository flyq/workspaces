import java.util.*;
import java.text.*;

/**
 * This program is to convert Celsius to Fahrenheit
 * @version 1.0 2016-10-10
 * @author F_B
 */

public class cel2fah
{
    public static void main(String[] args)
    {
      	double cel, fah;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a degree in Celsius:");
	cel = sc.nextDouble();
	fah = (double)((9.0/5) * cel + 32);

	DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
	df.setMaximumFractionDigits(0);
	
	System.out.println(df.format(cel) + " Celsius is " + fah + " Fahrenheit");
    }
}

