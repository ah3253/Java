import java.util.Scanner;
public class GCD{
	public static void main(String[]args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int x = read.nextInt();
		
		System.out.println("Please enter the second number:");
		int y = read.nextInt();
		
		int a = x;
		int b = y;
		
		if (b>a){
			while (b % a != 0){
				int c = b % a;
				b = a;
				a = c;
			};
			System.out.println("The greatest common divisor is: " + a);
			System.out.println("The least common multiple is: " + x * y / a);
		}
		
		else{
			while (a % b != 0){
				int c = a % b;
				a = b;
				b = c;
			};
			System.out.println("The greatest common divisor is: " + b);
			System.out.println("The least common multiple is: " + x * y / b);
		}
			
		
	
	}
}