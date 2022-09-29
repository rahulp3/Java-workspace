package com.testCodes.algorithms;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};
		int temp;
		for(int i = 0; i < a.length ; i++) {
			int comp = a[i];
			for(int j = 0 ; j < a.length ; j++) {
				if(comp < a[j]) {
					temp = a[j];
					a[j] = comp;
					a[i] = temp;
				}
			}
		}
		for(int k = 0; k < a.length ; k++) {
		System.out.println(a[k]);
		}
	}
	

}
