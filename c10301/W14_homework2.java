// 請撰寫一個程式, 由鍵盤輸入一個數值 n, 傳入一個方法, 並由該方法顯示出 1 ~ n 中可以被 13 除的數值。

package c10301;

import java.util.*;

public class W14_homework2 {
	public static void main(String[] args) {
		a m = new a();
		System.out.print("請輸入n值：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("1 ~ " + n + " 之間可被 13 整除的數字為 ");
		num(n);
	}

	public static void num(int n) {

		for (int i = 1; i <= n; i++) {
			if ((i % 13) == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}