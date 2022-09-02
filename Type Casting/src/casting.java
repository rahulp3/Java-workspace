import java.util.Scanner;

public class casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Example for implicit type casting
		float x;
		x = 8;
		System.out.println(x);
		
		// Example for explicit type casting
		int k;
		k = (int)8.47f;
		System.out.println(k);
		
		try (Scanner sc = new Scanner(System.in)) {
			String result = sc.nextInt()%2 == 0 ? "even" : "odd";
			System.out.println(result);
			int n = sc.nextInt();
			
			if(n%2 == 0)System.out.println("even");
			else System.out.println("odd");
		}
		catch(Exception e){
			System.out.println("enter a integer");
		}
	}
}
