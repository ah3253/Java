import java.util.Scanner;
public class Hexagon{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter the side");
		
		double s = read.nextDouble();
		System.out.println(Math.sqrt(3));
		System.out.println("The area of the hexagon is: " + 3 * Math.sqrt(3) / 2 *s * s);
	}
}