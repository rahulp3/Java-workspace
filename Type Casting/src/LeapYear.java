import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an input:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%400 == 0)System.out.println("leap year");
		else if(year%100 == 0 && year%400 != 0)System.out.println("Not a leap year");
		else if(year%4 == 0 && year%100 != 0)System.out.println("Leap year");
		else System.out.println("Not a leap year");
		}
}


