import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the year:");
		int year = read.nextInt();
		
		if (year % 400 == 0){
			System.out.println("The year is a leap year");
			}
			
		else{
			if (year % 4 == 0){					
			    if(year % 100 != 0){
			    System.out.println("The year is a leap year");
						}					
			
				if(year % 100 == 0){
				System.out.println("The year is not a leap year");
					};
									};
									
			if (year % 4 != 0){
			System.out.println("The year is not a leap year");
				}			
				}
			}
		}
	

	
