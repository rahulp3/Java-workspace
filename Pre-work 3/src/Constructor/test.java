package Constructor;

class cons{
	void fun() {
		System.out.println("It works!");
	}
	
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cons c,k;
		c = k = new cons();
		System.out.println(k);
		System.out.println(c);
		thisKeywordExample l = new thisKeywordExample(3);
		
	}

}
