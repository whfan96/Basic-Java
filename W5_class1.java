/* 請寫一段程式，令使用者可以輸入一個數字，再判斷此數為奇數或偶數。
使用者輸入:32
Output: 您輸入的數字32為偶數
使用者輸入:31
Output: 您輸入的數字31為奇數
*/

import java.util.*;

public class W5_class1 {
	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("您輸入的數字為" + n + "是偶數。");
		} else {
			System.out.println("您輸入的數字為" + n + "是奇數。");
		}
	}
}