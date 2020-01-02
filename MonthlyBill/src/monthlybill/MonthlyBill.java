//Sabrina Turney
//Feb 6, 2019
//COP 2800 - Programming with Java
//Week Four Assignment - Monthly Bill Calculator
//In this program, we use a single array along with input from the user to 
//calculate their monthly utility bill costs for six months, in two classes.

package monthlybill;

public class MonthlyBill {
     private String Months; // number of months this utility bill covers
       private int[] MonthlyBills; // array of utility costs
 
       // constructor
       public MonthlyBill(String Months, int[] MonthlyBills) {
         this.Months = Months;
         this.MonthlyBills = MonthlyBills;
      }

      // method to set the Months string
      public void setMonths(String Months) {
         this.Months = Months;
      }

      // method to retrieve the Months string
      public String getMonths() {
         return Months;
      }

      // perform various operations on the data
      public void processUtility() {
        // output utility array
         outputUtility();

         // call method getAverage to calculate the average utility bill cost
         System.out.printf("%nAverage utility cost is %.2f%n", getAverage());

         // call methods getMinimum and getMaximum
         System.out.printf("Lowest bill is %d%nHighest bill is %d%n%n",
            getMinimum(), getMaximum());
      }

      // find minimum bill
      public int getMinimum() {
         int lowBill = MonthlyBills[0]; // assume MonthlyBills[0] is smallest

         // loop through MonthlyBills array
         for (int utility : MonthlyBills) {
            // if utility bill lower than lowBill, assign it to lowBill
            if (utility < lowBill) {
               lowBill = utility; // new lowest utility bill
            }
         }

         return lowBill;
      }

      // find maximum grade
      public int getMaximum() {
         int highBill = MonthlyBills[0]; // assume MonthlyBills[0] is largest

         // loop through MonthlyBills array
         for (int utility : MonthlyBills) {
            // if utility bill greater than highBill, assign it to highBill
            if (utility > highBill) {
               highBill = utility; // new highest bill
            }
         }

         return highBill;
      }

      // determine average cost for six month time span
      public double getAverage() {
         int total = 0;

         // sum bill for one month
         for (int bill : MonthlyBills) {
            total += bill;
         }

         // return average of bills over 6 months
         return (double) total / MonthlyBills.length;
      }

      // output bar chart displaying grades was removed. User doesn't need
      //to know the distribution of their bills if they already know the values
      //over a six month period.


      // output the contents of the MonthlyBills array
     public void outputUtility() {
         System.out.printf("Your utility bills are:%n%n");

         // output each month's cost
         for (int month = 0; month < MonthlyBills.length; month++) {
            System.out.printf("Month %2d: %3d%n",
               month + 1, MonthlyBills[month]);
         }
      }
   }
