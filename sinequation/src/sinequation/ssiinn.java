package sinequation;

		import java.util.Scanner;


		public class ssiinn {

			public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter the angle in degree: ");
				
				double x = input.nextDouble();      //input
				double sum = 0 ;
				int i;
				
				for(i =0 ; i <10 ;  i++)
				{
						int power = 2 * i + 1;
						System.out.println("i = "+i);
						System.out.println( "power ="+power );
						System.out.println("++++++++++++++++++++");
						double power1 = Math.pow(x,power);
						

						double factorial = 1;
						
						int j ;
							for(j=1 ; j<=power ; j++)
							{
								factorial = j *factorial ; 
								
							}
							switch (power)
							{
							case(1):
							case(5):
							case(9): sum = sum + (power1/ factorial); 
							System.out.println("------------------");
							break;
							default:
							sum = sum - (power1/ factorial);
							
								
							System.out.println("============");
					
							
							
								input.close();
								System.out.println("i = "+i);
							//	System.out.println("j = "+j);
								System.out.println("x = "+x);
								System.out.println( "power ="+power );
								System.out.println("factorial =" +factorial);

								System.out.println("power1 ="+power1);
								System.out.println("000000000000000000000000000000000000000000000");
								
				}
						
				}System.out.println(sum);
			}
		}
	
				
			
		




