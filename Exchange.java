import java.util.Scanner;
public class Exchange{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a = read.nextInt();
		
		System.out.println("Please enter the value of b");
		int b = read.nextInt();
		
		//int c = b;
		//int b = a;
		//int a = c;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}