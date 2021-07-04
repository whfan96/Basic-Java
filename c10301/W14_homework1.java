// 請撰寫一個類別, 提供 sum(int n) 方法, 此方法會計算並傳回1 + 2 + 3 + .... + n 的值。

package c10301;

import java.util.*;

class a {
	public int sum(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}
}

public class W14_homework1 {
	public static void main(String[] args) {
		a m = new a();
		System.out.print("請輸入n值：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("1 ~ " + n + " 的總和為 " + m.sum(n));
	}
}