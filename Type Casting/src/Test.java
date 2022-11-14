

public class Test {

	public static void main(String[] args) throws UserDefinedException {
		try {
			int a = 20/0;
		}catch(ArithmeticException e) {
//			System.out.println("Test code");
			throw new UserDefinedException("User defined exception is thrown");
			
		}

	}

}
