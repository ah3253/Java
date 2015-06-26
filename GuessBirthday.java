import java.util.Scanner;

public class GuessBirthday {
  public static void main(String[] args) {
	  Scanner  read = new java.util.Scanner(System.in);
	  
	  int month = 0;
	  
	  String setA = 
	  "1 3 5 7 9 11";
	  
	  String setB = 
	  "2,3,6,7,10,11";
	  
	  String setC =
	  "4,5,6,7,12";
	  
	  String setD = 
	  "8,9,10,11,12";
	  
	  System.out.println(setA);
	 System.out.println("please input 1 if the month of your birthday is in the set, 0 if not");
	 if( 1 == read.nextInt()){
		 month += 1;
	 }
	  
	  System.out.println(setB);
	 System.out.println("please input 1 if the month of your birthday is in the set, 0 if not");
	 if( 1 == read.nextInt()){
		 month += 2;
	 }
	  
	   System.out.println(setC);
	 System.out.println("please input 1 if the month of your birthday is in the set, 0 if not");
	 if( 1 == read.nextInt()){
		 month += 4;
	 }
	 
	  System.out.println(setD);
	 System.out.println("please input 1 if the month of your birthday is in the set, 0 if not");
	 if( 1 == read.nextInt()){
		 month += 8;
	 }
	  
	  
	  
    String set1 =
      " 1  3  5  7\n" +
      " 9 11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";

    String set2 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";

    String set3 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";

    String set4 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";

    String set5 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";
	  
	 
	 int days = 0;
	 
	 
	 System.out.println(set1);
	 System.out.println("please input 1 if the day of your birthday is in the set, 0 if not");
	 if( 1 == read.nextInt()){
		 days  += 1;
	 }
	 
	 System.out.println(set2);
	 System.out.println("please input 1 if the day of your birthday is in the set, 0 if not");
	 if (1==read.nextInt()){
		 days += 2;
	 }
	 
	 
		 System.out.println(set3);
	 System.out.println("please input 1 if the day of your birthday is in the set, 0 if not");
	 if (1==read.nextInt()){
		 days += 4;
	 }


		 System.out.println(set4);
	 System.out.println("please input 1 if the day of your birthday is in the set, 0 if not");
	 if (1==read.nextInt()){
		 days += 8;
	 }
	 
	 System.out.println(set5);
	 System.out.println("please input 1 if the day of your birthday is in the set, 0 if not");
	 if (1==read.nextInt()){
		 days += 16;
		 
	
	 }

       	 System.out.println("Your birthday is: " + month + " " + days);

  }
}
