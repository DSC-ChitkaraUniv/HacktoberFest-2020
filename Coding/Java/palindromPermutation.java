import java.util.Scanner;

public class palindromePermutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		boolean ans = checkValidity(str);
		System.out.println(ans);
		scn.close();
	}

	public static boolean checkValidity(String str) {
		int arr[] = new int[128];
		for (int i = 0; i < str.length(); i++) {
			int ch = (int) str.charAt(i);
			arr[ch] = (arr[ch] + 1) % 2;
		}

		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				c++;
			}
		}

		if (c <= 1) {
			return true;
		}
		return false;
	}

}