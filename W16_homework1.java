/* 試設計一類別CTest，內含一test() method，可以用來判別傳入的值為是否大於0，如果大於0則印出 "此數為正數"，反之若為小於0的數則印出 "此數為負數"；若輸入的數為0，則印出 "此數為 0"。

Output:
n= -4, 此數為負數
n= 8, 此數為正數
n= 0, 此數為 0
*/

import java.util.*;

class CTest {
	String zero(int k) {
		String str = "，此數為 0 ";
		return str;
	}

	Boolean integer(int n) {
		if (n > 0) {
			return true;
		}
		return false;
	}
}

public class W16_homework1 {
	public static void main(String[] args) {
		CTest A = new CTest();
		System.out.println("n = -4" + (A.integer(-4) ? "，此數為正數" : "，此數為負數"));
		System.out.println("n = 8" + (A.integer(8) ? "，此數為正數" : "，此數為負數"));
		System.out.println("n = 0" + A.zero(0));
		System.out.print("請輸入一整數：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("n = " + n);
		if (n == 0) {
			System.out.println(A.zero(0));
		}
		if (n != 0) {
			System.out.print((A.integer(n) ? "，此數為正數" : "，此數為負數"));
		}
	}
}