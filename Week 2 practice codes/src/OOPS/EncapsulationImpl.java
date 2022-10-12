package OOPS;
/**testing inheritance with different scenarios 
 * even if the subclass reference is used for the object the constructor of the parent class is
 * called by default and then the constructor of the subclass is called
 * @author rahul
 *
 */

class TestEncapsulation {
	int a;
	public TestEncapsulation() {
		a = 20;
		System.out.println(a);
	}
}

class encapsExtend extends TestEncapsulation{
	int a;
	public encapsExtend() {
		this.a = 40;
		System.out.println(a);
	}
}

class TestEncapsulationImpl{
	public static void main(String[] args) {
		TestEncapsulation t1 = new TestEncapsulation();
		encapsExtend t2 = new encapsExtend();
	}
}
