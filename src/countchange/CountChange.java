package countchange;

import java.util.Scanner;
import java.text.DecimalFormat;


public class CountChange {    
       public static void main(String[] args) {
    	   
    	   Scanner input = new Scanner(System.in);
       
    	   int quarters;   
    	   int dimes;      
    	   int nickels;    
          
    	   double dollars;
                    
    	   System.out.println("Enter the number of quarters: ");
    	   quarters = input.nextInt();
           
    	   System.out.println("Enter the number of dimes:     ");
    	   dimes = input.nextInt();
           
           System.out.println("Enter the number of nickels:   ");
           nickels = input.nextInt();
          
           dollars = (0.25 * quarters) + (0.10 * dimes) 
                              + (0.05 * nickels); 
           
           DecimalFormat df = new DecimalFormat(".00");

           System.out.print("$" + df.format(dollars));
       }
    } 
