/**
 * This program about rainbow
 * @version 1.00 2016-10-13
 * @author F_B
 */
/*
public class ex11
{	
    public static void main(String[] args)
    {
	AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
	System.out.println("a.anIntegerRepresentingColors = " + a.anIntegerRepresentingColors);
	a.changeColor(7);
	a.changeTheHueOfTheColor(77);
	System.out.println("After color change, a.anIntegerRepresentingColors = " + a.anIntegerRepresentingColors);
	System.out.println("a.hue = " + a.hue);	


	    
    }
}

class AllTheColorsOfTheRainbow
{
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor(int newHue)
    {
	hue = newHue;
    }
    int changeColor(int newColor)
    {
	return anIntegerRepresentingColors = newColor;		
    }
}
*/


//: object/E11_AllTheColorsOfTheRainbow.java
/****************** Exercise 11 *****************
 * Turn the AllTheColorsOfTheRainbow example into
 * a program that compiles and runs.
 ************************************************/
package ex11;
public class ex11
{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue)
    {
	anIntegerRepresentingColors = newHue;
    }
    public static void main(String[] args)
    {
	ex11 all =
	    new ex11();
	all.changeTheHueOfTheColor(27);
    }
} ///:~

