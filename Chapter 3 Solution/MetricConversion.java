// MetricConversion.java
// Chapter 3,Exercise 7
import java.util.Scanner;
public class MetricConversion
{
  public static void main (String args[])
  {
     int aValue;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an integer >> ");
     aValue = input.nextInt();
     convertToCentimeters(aValue);
     convertToLiters(aValue);
  }

  public static void convertToCentimeters(int inches)
  {
     double centimeters;
     final double CENT_FACTOR = 2.54;
     centimeters = inches * CENT_FACTOR;
     System.out.println(inches + " inches is " + centimeters + " centimeters");
  }

    public static void convertToLiters(int gallon)
    {
        double litre;
        final double LITRE_FACTOR = 3.7854;
        litre = gallon * LITRE_FACTOR;
        System.out.println(gallon + " gallon is " + litre + " Litre");
    }
}
