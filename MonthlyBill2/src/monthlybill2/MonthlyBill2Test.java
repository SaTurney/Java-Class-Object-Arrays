//Sabrina Turney
//Feb 6, 2019
//COP 2800 - Programming with Java
//Week Four Assignment - Monthly Bill Calculator 2
//In this program, we use a double array along with input from the user to 
//calculate their monthly utility bill costs for months and years, in two classes.

package monthlybill2;
import java.util.Scanner;


public class MonthlyBill2Test {
         public static void main(String[] args) {
         // array of monthly bills
   
         Scanner input = new Scanner(System.in);
         int[][] MonthlyBills;
             MonthlyBills = new int[3][3];
         
         //Provide introduction and explain program to user.
         System.out.print("Welcome to my week four program!");
         System.out.println("In this program, I need 3 integers from you,");
         System.out.println("each representing one of 3 months of utility bills");
         System.out.println(" and 3 integers, for 3 years' worth of bills.");
         System.out.println("Then I will display your utility bill averages!");

         
         for (int i = 0; i < MonthlyBills.length; i++)
         {
             System.out.print("\nPlease enter your utility bill cost for 3 months: "); 
             MonthlyBills[i][i] = input.nextInt();

}
         
         MonthlyBill2 Months = new MonthlyBill2(
            "Utility Bill Costs:", MonthlyBills);
         System.out.printf("\nThank you! Here is your utility bill cost for%n%s%n%n",
            Months.getMonths());
         Months.processUtility();
      }
   }

