package Arrays;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {2,3,1};
		for (int k = 0; k <i.length; k ++) {
			int comp = i[k];
			for(int l = 0; l < i.length ; l++) {
				if(comp > i[l]) {
					int temp = comp;
					i[k] = i[l];
					i[l] = temp;
				}
			}
		}
		
		for(int n = 0; n < i.length; n++) {
			System.out.println(i[n]);
		}
	}

}
