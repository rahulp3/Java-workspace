package OOPS;

class A1 {
	void car() {
		System.out.println(" I am method A");
	}
}

class B1 extends A1 {
	void car() {
		System.out.println("I am method B");
	}
}

public class PolyTest {

	public static void main(String[] args) {
		A1 obj = new A1();
		obj.car();
		A1 obj1 = new B1();
		obj1.car();

	}

}
