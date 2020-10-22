import java.util.Scanner;

public class checkPermutation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String key = scn.next();
		boolean ans = permutation(str, key);
		System.out.println(ans);
		scn.close();
	}

	public static boolean permutation(String str, String key) {
		return permutation(str, key, "");
	}

	public static boolean permutation(String str, String key, String ans) {
		if (str.length() == 0 && ans.equals(key)) {
			return true;
		}

		if (str.length() == 0) {
			return false;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		int c = 0;

		for (int i = 0; i <= ans.length(); i++) {
			boolean flag = permutation(ros, key, ans.substring(0, i) + ch + ans.substring(i));
			if (flag) {
				c++;
			}
		}

		if (c != 0) {
			return true;
		} else {
			return false;
		}
	}

}