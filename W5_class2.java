// 試寫一個程式, 輸入學生的成績, 成績在 90~100 分之間為 A；成績在 80~89 分為 B；範圍在 70~79 分為 C;而範圍落在 60~69 為 D；未滿 60 為E (使用 if 條件運算式)。

import java.util.*;

public class W5_class2 {
	public static void main(String[] args) {
		System.out.print("請輸入學生的成績：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if ((n <= 100) && (n >= 90)) {
			System.out.println("您的成績為A。");
		} else if ((n <= 89) && (n >= 80)) {
			System.out.println("您的成績為B。");
		} else if ((n <= 79) && (n >= 70)) {
			System.out.println("您的成績為C。");
		} else if ((n <= 69) && (n >= 60)) {
			System.out.println("您的成績為D。");
		} else if (n <= 60) {
			System.out.println("您的成績為E。");
		}
	}
}