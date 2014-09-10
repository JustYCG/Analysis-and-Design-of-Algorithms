package recursion;

import java.util.Scanner;

public class Factorial {

	public int Factorial(int n) {
		if (n > 0) {
			return Factorial(n - 1) * n;
		} else {
			return 1;
		}
	}

	public static void main(String args[]) {
		System.out.println("请输入需要递归的正整数:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Factorial factorial = new Factorial();
		int result = factorial.Factorial(number);
		System.out.println("递归结果："+result);
	}

}