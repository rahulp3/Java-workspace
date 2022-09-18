package NonAccessModifiers;

public class StaticKeyword {
	static int a = 20;
	final int b = 30;
	
	 int test() {
		return a;
	}
	
public static void main(String[] args) {
	StaticKeyword k = new StaticKeyword();
	k.a = 10;
	System.out.println(k.a);
	
	StaticKeyword l = new StaticKeyword();
	System.out.println(l.a);
	
}
}
