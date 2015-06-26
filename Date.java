import java.util.Scanner;
public class Date{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the year");
		int year = read.nextInt();
		
		System.out.println("Please enter the month");
		int month = read.nextInt();
		
		System.out.println("Please enter the day");
		int day = read.nextInt();
		
		int numberOfDays = 0;
		
		for (int i = 1970; i < year; i++){
			if (year % 400 == 0){
			numberOfDays = numberOfDays + 366;
			}
			
			else{
				if (year % 4 == 0){					
					if(year % 100 != 0){
					numberOfDays = numberOfDays + 366;
						}					
			
					if(year % 100 == 0){
					numberOfDays = numberOfDays + 365;
						};
									};
									
			if (year % 4 != 0){
			numberOfDays = numberOfDays + 365;
				}			
				}
		}
		
		
			if (year % 400 == 0){
			
				for (int j= 1; j < month; j++){
						if (j == 1){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 2){
						numberOfDays = numberOfDays + 29;
						}
	
						if (j == 3){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 4){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 5){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 6){
						numberOfDays = numberOfDays + 30;
						}
		
						if (j == 7){
						numberOfDays = numberOfDays + 31;
						}
		
						if (j == 8){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 9){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 10){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 11){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 12){
						numberOfDays = numberOfDays + 31;
						}
				}
			}
			
		else{
			if (year % 4 == 0){					
			    if(year % 100 != 0){
			    
				for (int j= 1; j < month; j++){
						if (j == 1){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 2){
						numberOfDays = numberOfDays + 29;
						}
	
						if (j == 3){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 4){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 5){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 6){
						numberOfDays = numberOfDays + 30;
						}
		
						if (j == 7){
						numberOfDays = numberOfDays + 31;
						}
		
						if (j == 8){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 9){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 10){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 11){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 12){
						numberOfDays = numberOfDays + 31;
						}
				}
						}					
			
				if(year % 100 == 0){
				
				for (int j= 1; j < month; j++){
						if (j == 1){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 2){
						numberOfDays = numberOfDays + 28;
						}
	
						if (j == 3){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 4){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 5){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 6){
						numberOfDays = numberOfDays + 30;
						}
		
						if (j == 7){
						numberOfDays = numberOfDays + 31;
						}
		
						if (j == 8){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 9){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 10){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 11){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 12){
						numberOfDays = numberOfDays + 31;
						}
				}
					};
									};
									
			if (year % 4 != 0){
			
				for (int j= 1; j < month; j++){
						if (j == 1){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 2){
						numberOfDays = numberOfDays + 28;
						}
	
						if (j == 3){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 4){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 5){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 6){
						numberOfDays = numberOfDays + 30;
						}
		
						if (j == 7){
						numberOfDays = numberOfDays + 31;
						}
		
						if (j == 8){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 9){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 10){
						numberOfDays = numberOfDays + 31;
						}
	
						if (j == 11){
						numberOfDays = numberOfDays + 30;
						}
	
						if (j == 12){
						numberOfDays = numberOfDays + 31;
						}
				}
				}			
				}
				
				numberOfDays = numberOfDays + day;
				
				System.out.println("The number of days is: " + numberOfDays);
	}
}