
public class odd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1 ; i <=10 ; i++) {
			if(i%2 != 0) System.out.println(i);
		}
		
		int i = 10;
		while(i != 0) {
			System.out.println(i);
			i--;
		}
		
		i = 5;
		for(i=1;i<=5;i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


