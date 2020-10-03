import java.util.*;
 public class Main {
 	static int precedence(char ch) {
 	if(ch=='+' || ch=='-')return 1;
 	else if(ch=='*' || ch=='/')return 2;
 	else if(ch=='^')return 3;
 	else return -1;
 	}
 	public static void main(String[] args) {
 		String exp = "a+b*(c^d-e)^(f+g*h)-i";
 		String result = new String("");
 		int error=0;
 		Stack < Character > stack = new Stack < > ();
 		for (int i = 0; i < exp.length(); ++i) {
 			char c = exp.charAt(i);
 			if (Character.isLetterOrDigit(c)) result += c;
 			else if (c == '(') stack.push(c);
 			else if (c == ')') {
 				while (!stack.isEmpty() && stack.peek() != '(') result += stack.pop();
 				if (!stack.isEmpty() && stack.peek() != '(') error=1;
 				else stack.pop();
 			} else {
 				while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
 					if (stack.peek() == '(') error=1;
 					result += stack.pop();
 				}
 				stack.push(c);
 			}
 		}
 		while (!stack.isEmpty()) {
 			if (stack.peek() == '(') error=1;
 			result += stack.pop();
 		}
 		if(error==1) System.out.println("Invalid Expression");
 		else System.out.println(result);
 	}
 }