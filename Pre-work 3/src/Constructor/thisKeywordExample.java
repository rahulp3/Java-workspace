package Constructor;

public class thisKeywordExample {
	int a;
	thisKeywordExample(int i){
		a = i;
		validate(a);
	}
	
	public void validate(int i) {
		if( i%2 == 0 ) System.out.println("even");
	}
}
