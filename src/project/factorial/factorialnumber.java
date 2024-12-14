package project.factorial;
	
import java.util.Scanner;

public class factorialnumber {
	public static long factorial(int num) {
		if (num<0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}
		long res =1;
		for(int i=2;i<=num;i++) {
			res *= i;
			
		}
		return(res);
	}	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Factorial Calculator");
		System.out.println("Enter a number to calculate its factorial, or type 'exit' to quit.");
		while(true) {
			System.out.print("Enter a number : ");
			String input = scanner.next();
			if(input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting program. Goodbye!");
				break;
			}
			try {
				int number = Integer.parseInt(input);
				long factorial = factorial(number);
				System.out.println("The factorial of "+ number +" is: " +factorial);
				
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input. Please enter a valid integer or 'exit' to quit.");
				
			}
			catch(IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
			scanner.close();
			}
		}



