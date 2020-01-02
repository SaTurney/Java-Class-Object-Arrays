//Sabrina Turney
//Feb 6, 2019
//COP 2800 - Programming with Java
//Week Four Assignment - Monthly Bill Calculator
//In this program, we use a single array along with input from the user to 
//calculate their monthly utility bill costs for six months, in two classes.


package monthlybill;
import java.util.Scanner;

public class MonthlyBillTest {
      public static void main(String[] args) {
         // array of monthly bills
   
         Scanner input = new Scanner(System.in);
         int[] MonthlyBills = new int[6];
         
         //Provide introduction and explain program to user.
         System.out.print("Welcome to my week four program!");
         System.out.println("In this program, I need six integers from you,");
         System.out.println("each representing one of six months of utility bills."); 
         System.out.println("Then I will display your utility bill for those six months!");

         
         for (int i = 0; i < MonthlyBills.length; i++)
         {
             System.out.print("\nPlease enter your utility bill cost for six months: "); 
             MonthlyBills[i] = input.nextInt();

}
         
         MonthlyBill Months = new MonthlyBill(
            "January through June (Six Months):", MonthlyBills);
         System.out.printf("\nThank you! Here is your utility bill cost for%n%s%n%n",
            Months.getMonths());
         Months.processUtility();
      }
   }