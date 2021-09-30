package sinequation;

import java.util.Scanner;


public class SinEqu {

	public static void main(String[] args) {
		
		
		//sin x = x^1/1! + x^3 /3! + x^5 /5! - ......
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the angle in degrees: ");
		
		double theta = input.nextDouble();      //input
		double x = theta *(3.14/180);       // convert from degree to pi 
		double sum = 0 ; 
		int i;
		
		for(i =0 ; i <=10 ; i++)
		{
				double power = 2 * i + 1;                
				
				double power2 = Math.pow(x,power);
				

				double factorial = 1;       
				
					
					for(int j =1 ; j<=power ; j++)
					{
						factorial = j *factorial ; 
						
					}
					
					if (i%2 == 0) {
								
					sum = sum + (power2/ factorial);
						
					}
					else
					{
						
						sum = sum - (power2/ factorial);
						
						
					}
				
						input.close();
					
		
		}
		
		System.out.println("Sin "+ theta + " = "+ sum);
		System.out.println("Sin "+ theta +" = " +Math.sin(x));
		
	}
		
	
}


