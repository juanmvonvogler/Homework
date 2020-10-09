import java.util.Scanner;

public class Questiuon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner keyboard = new Scanner(System.in);
     System.out.println("To calculate the amount of taxes you'd owe in 1913 enter your income: ");
     double income  = keyboard.nextDouble();
     double taxes   = 0;
     System.out.println(taxes);
     
     //provide the values for the max tax
     double maxTax0 = 50000.00 * .01;
     double maxTax1 = 25000.00 * .02 + maxTax0;
     double maxTax2 = 25000.00 * .03 + maxTax1;
     double maxTax3 = 150000.0 * .04 + maxTax2;
     double maxTax4 = 250000.0 * .05 + maxTax3;
     
     
     //calculate taxes owed for incomes over 50k
     if (income <= 50000){
       taxes = income * .01;
     }else if (income <= 75000){
       taxes = ((income - 50000.0) * .02 + maxTax0);
     }else if (income <= 100000){
       taxes = ((income - 75000.0) * .03 + maxTax1);
     }else if (income <= 250000){
       taxes = ((income - 100000.0) * .04 + maxTax2);
     }else if (income <= 500000){
       taxes = ((income - 250000.0) * .05 + maxTax3);
     }else if ( income > 500000){
       taxes = ((income - 500000.0) * .06 + maxTax4);
     }
     //print out the users taxes owed
     System.out.printf("you owe some %f in taxes.%n", taxes);
   }

 }