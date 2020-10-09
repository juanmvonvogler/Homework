  
import java.util.Scanner; 

public class LabProgram{
	
public static void main(String[] args){
	
	System.out.println("enter a non negative number");
	System.out.println("then enter a negatiive number to stop the program and display the average and max of the numbers inputed.");
	
	Scanner keyboard = new Scanner (System.in); 

		int count = 0;
		int num = 0;
		int max = 0;
        int avg = 0;
        int total = 0;

        
        do {
        	/*calculate the total and count while 
        	taking the users input to initialize number*/	
        	total += num;
        	num = keyboard.nextInt();
        	count += 1;
        	
        	/*if the number is inputed is grater than the current 
        	 * max it then gets stored as the new max 
        	 */
        	if (num >= max) {
        		max = num;
        	}
        } while (num >= 0);
        
        
        avg= total/(count);
       
        System.out.println("the average is: " + avg + " and your max number is  " + max); 
       
        //done
}
}

       
