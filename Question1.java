import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prompt the user with a welcome message 
		
		System.out.println("Lets calculate your weekly pay");
		
		// use the scanner object to read the users input data 
		Scanner keyboard = new Scanner(System.in);
		
		// prompt the user for hourlyWage
		// store the user input
		System.out.print("Enter your hourly wage");
		final double HOURLY_WAGE = keyboard.nextDouble();
		
		// prompt the user for hoursWorked
		// store the user input
		System.out.print("Please enter the number of hours you worked this week, you can enter fractions too: ");
		final double HOURS_WORKED = keyboard.nextDouble();
		
		// declare variables and set to 0 
		double payAmount = 0;
		double otPayAmount = 0;
		double totalPay = 0;
		
		// write if else statement to calculate include overtime pay
		if (HOURS_WORKED > 40){ 
					payAmount = HOURS_WORKED * 40 ;
					otPayAmount = (HOURS_WORKED - 40 ) * (HOURLY_WAGE * 1.5) ;
					totalPay = payAmount + otPayAmount ;
				}
		else{
					totalPay = HOURLY_WAGE * HOURS_WORKED ;
				}
		System.out.printf("You worked %5.2f hours and your normal rate of pay is $%4.2f ", HOURS_WORKED, HOURLY_WAGE );
		System.out.printf("\nYour overtime pay is $%5.2f and your total paycheck is $%10.2f ", otPayAmount, totalPay );
			}
		}//done
	


