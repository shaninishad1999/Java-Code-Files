// Q6. Write a Java program that takes a year from the user and prints
// whether it is a leap year or not.

import java.util.Scanner;
class Q_4{

	public static void main(String args[]){
	int year,n;
	Scanner shani=new Scanner(System.in);
	System.out.printf("Input the Month: ");
	n=shani.nextInt();
	System.out.printf("Input the year: ");
	year=shani.nextInt();
	
	 switch(n) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("February " + year + " has 29 days");
                } else {
                    System.out.println("February " + year + " has 28 days");
                }
                break;
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
                break;
	
	 default:
	{
                System.out.println("Please enter a valid month .");
             }
}
	
}
}
	