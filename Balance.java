import java.util.Scanner;
public class Balance{
	public static void main(String[] args){
	System.out.println("Please input the balance");
	Scanner read = new Scanner(System.in);
	double balance = read.nextDouble();
	
	System.out.println("Please input the interest rate");
	Scanner input = new Scanner(System.in);
	double interestrate = input.nextDouble();
	
	System.out.println("The interest is: " + balance * (interestrate / 1200));
	}
}