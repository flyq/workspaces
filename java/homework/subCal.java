import java.util.*;
import java.text.*;

/**
 * This program counts the gratuity and total
 * @version 1.0 2016-10-10
 * @author F_B
 */

public class subCal
{
    public static void main(String[] args)
    {
	double subtotal, graRate, gratuity, total;
	Scanner sc = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("##.#");

	System.out.print("Enter the subtotal and a gratuity rate: ");
	subtotal = sc.nextFloat();
	graRate = sc.nextFloat();

	gratuity = subtotal * graRate/100.0;
	total = subtotal + gratuity;

	//df.applyPattern("\u00A4");
	
	System.out.println("The gratuity is $" + df.format(gratuity)  + " and total is $" + df.format(total));
    }
}
	
