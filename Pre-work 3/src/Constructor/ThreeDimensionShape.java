package Constructor;

class Volume{
	double w,h,l;
	Volume(){
		l = 0;
		h = 0;
		w = 0;
	}
	
	Volume(int value){
		l = value;
		w = value;
		h = value;
	}
	
	Volume(int length,int width,int height){
		l = length;
		w = width;
		h = height;
	}
	
	double calculate() {
		return l * w * h ;
	}
	
}
public class ThreeDimensionShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v1 = new Volume();
		v1.calculate();
				
	}

}
