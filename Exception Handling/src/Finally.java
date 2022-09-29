
public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		try {
			a = 20;
			a = 30/1;
		}catch(ArithmeticException e) {
			System.out.println(a);
		}finally {
			System.out.println(a);
		}
	}

}
