package NonAccessModifiers;

public class challenge {
	int var1 =10;
	static int var2=20;
	
	void method1() {
		var1++;
		System.out.println(var1);
	}
	
	void method2() {
		var2++;
		System.out.println(var2);
	}
	
	public static void main(String[] args) {
		challenge obj1 = new challenge();
		challenge obj2 = new challenge();
		challenge obj3 = new challenge();
		obj1.method1();
		obj2.method1();
		obj3.method1();
		obj1.method2();
		obj2.method2();
		obj3.method2();
		
	}
}
