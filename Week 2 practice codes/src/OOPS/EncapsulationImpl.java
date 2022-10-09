package OOPS;
/**testing inheritance with different scenarios 
 * even if the subclass reference is used for the object the constructor of the parent class is
 * called by default and then the constructor of the subclass is called
 * @author rahul
 *
 */

class Encapsulation {
	int a;
	public Encapsulation() {
		a = 20;
		System.out.println(a);
	}
}

class encapsExtend extends Encapsulation{
	int a;
	public encapsExtend() {
		this.a = 40;
		System.out.println(a);
	}
}

class EncapsulationImpl{
	public static void main(String[] args) {
		Encapsulation t1 = new Encapsulation();
		encapsExtend t2 = new encapsExtend();
	}
}
