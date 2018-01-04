/*Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

*/
import java.util.*;
import java.math.*;

public class Arithmetic {

   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       double mealCost;
       int tip,tax;
       mealCost = scan.nextDouble();
       tip = scan.nextInt();
       tax = scan.nextInt();
       
       double total = mealCost + tip * mealCost/100 + tax * mealCost/100;
       System.out.println("The total meal cost is " + (int)Math.round(total) + " dollars.");
   }
}
