package OOPS;

class A {
	int a = 30;
}

class B extends A {
	int a = 40;
}

public class Abstraction {
	public static void main(String[] args) {
		A v = new B();
		B v1 = new B();
		System.out.println(v.a);
		System.out.println(v1.a);
	}
}
