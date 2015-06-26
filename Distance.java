import java.util.Scanner;
public class Distance{
	public static void main(String args[]){
		Scanner read = new Scanner (System.in);
		
		System.out.println("Please input x1");
		double x1 = read.nextDouble();
		
		System.out.println("Please input x2");
		double x2 = read.nextDouble();
		
		System.out.println("Please input y1");
		double y1 = read.nextDouble();
		
		System.out.println("Please input y2");
		double y2 = read.nextDouble();
		
	    System.out.println("The distance of the two points is: " + Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5)); 
	}
}