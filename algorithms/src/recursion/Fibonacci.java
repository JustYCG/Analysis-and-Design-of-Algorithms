package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {

	public int fibonacci(int pos) {
		if (pos > 1) {
			// a.add(fibonacci(pos-1)+fibonacci(pos-2));
			return fibonacci(pos - 1) + fibonacci(pos - 2);
		} else if (pos == 1) {
			return 1;
		} else if (pos == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String args[]) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		Fibonacci fb = new Fibonacci();
		System.out.println("请输入第n位斐波那契数:");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt() - 1;
		int result = fb.fibonacci(pos);
		System.out.println("递归结果：" + result);
		// 输出n位斐波那契数列
		for (int i = 0; i < pos; i++) {
			a.add(fb.fibonacci(i));
		}
		Iterator<Integer> it = a.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
