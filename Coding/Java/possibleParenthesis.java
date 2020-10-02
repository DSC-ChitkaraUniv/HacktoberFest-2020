package Recursion;

import java.util.Scanner;

public class possibleParenthesis {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		parenthesis(n, 0, 0, "");
		scn.close();
	}

	public static void parenthesis(int n, int open, int close, String str) {
		if (open == n && close == n) {
			System.out.println(str);
			return;
		}

		if (open > n || close > n || close > open) {
			return;
		}

		parenthesis(n, open + 1, close, str + '(');
		parenthesis(n, open, close + 1, str + ')');
	}

}
