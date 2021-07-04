/* 假設火車站的自動售票機只能接受 10 元、5 元、以及 1 元的硬幣, 請撰寫一個程式, 算出購買票價 137 元的車票時, 所需投入各種幣值硬幣最少的數量？

Output:
共需 13 枚 10 元硬幣
1 枚 5 元硬幣
2 枚 1 元硬幣
*/

package c10301;

import java.util.Scanner;

public class W4_homework1 {
	public static void main(String[] args) {
		System.out.print("請輸入火車票價：");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = s / 10;
		int b = (s % 10) / 5;
		int c = (s % 10) % 5;
		System.out.println("十元硬幣：" + a + "個");
		System.out.println("五元硬幣：" + b + "個");
		System.out.println("一元硬幣：" + c + "個");
		System.out.println("硬幣的最少數量為：" + (a + b + c) + "個");
	}
}