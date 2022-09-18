package Constructor;

class Constructor{
	Constructor(){
		System.out.println("Hi, I'm default constructor");
	}
	Constructor(String name,int n){
		System.out.println("Hi, I'm "+ name);
		System.out.println(n*n);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor("Parameterized constructor",2);
	}

}
