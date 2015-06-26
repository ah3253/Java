import java.util.Scanner;
public class Investment{
	public static void main(String args[]){
		System.out.println("Please input the investment amount");
		Scanner read = new Scanner(System.in);
		double investmentAmount = read.nextDouble();
		
		System.out.println("Please input the annually interest rate");
		double annuallyInterestRate = read.nextDouble();
	
		System.out.println("Please input number of years");
		int numberOfYears = read.nextInt();
		
		System.out.println("future investment value = " + investmentAmount * Math.pow(1 + annuallyInterestRate , numberOfYears ));
				
		
	}
}