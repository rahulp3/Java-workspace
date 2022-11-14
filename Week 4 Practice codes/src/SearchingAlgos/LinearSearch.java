package SearchingAlgos;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number elements to be added to the array : ");
		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter the elements : ");

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the element to search :");
		int element = sc.nextInt();

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == element) {
				System.out.println("Element is found at index " + j);
				break;
			}
		}

	}

}
