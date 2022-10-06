package com.testCodes.algorithms;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,4,3,2,1};
		int temp;
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0 ; j < a.length -1 - i ; j++) {
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		int[][] arr = {{1,2,3,4},{2,3,4,5}};
//		for(int k = 0; k < a.length ; k++) {
//		System.out.println(a[k]);
//		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(arr));
	}
	

}
