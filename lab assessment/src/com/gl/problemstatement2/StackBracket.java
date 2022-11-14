package com.gl.problemstatement2;

import java.util.Scanner;
import java.util.Stack;

public class StackBracket {

	private static boolean checkBracket(String input) {
		Stack<Character> set = new Stack<>();
		char k, z;
		for (int i = 0; i < input.length(); i++) {
			k = input.charAt(i);

			if (k == '[' || k == '{' || k == '(') {
				set.add(k);
			}

			if (set.isEmpty()) {
				return false;
			}

			switch (k) {
			case ')':
				z = set.pop();
				if (z == '{' || z == '[')
					return false;
				break;
			case '}':
				z = set.pop();
				if (z == '(' || z == '[')
					return false;
				break;
			case ']':
				z = set.pop();
				if (z == '{' || z == '(')
					return false;
				break;

			}
		}
		return (set.isEmpty());
	}

	public static void main(String[] args) {

		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean result = checkBracket(input);

		if (result) {
			System.out.println("The entered string contains balanced brackets");
		} else {
			System.out.println("The entered string does not contain balances brackets");
		}
	}

}
