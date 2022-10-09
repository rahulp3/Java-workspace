package OOPS;

public class method {
	int performLeftShift() {
		int k = 10, y = k << 2;
		return y;
	}
   void performRightShift(int val, int digitsToShift) {
	   int s = val >> digitsToShift;
		System.out.println(s);
   }
   
public static void main(String[] args) {
	method n = new method();
	System.out.println(n.performLeftShift());
	n.performRightShift(4, 2);
}
}
