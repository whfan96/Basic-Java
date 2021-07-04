/* 請使用switch多條件完成程式，試由程式中直接設定一個1~7之間的整數day，代表星期一到星期日。
若day的值是1~5，則印出 "今天要上班"，若day的值是6~7，則印出 "今天休息"，若day的值不是1~7，則印出 "輸入錯誤"。
*/

import java.util.*;

public class W6_class1 {
	public static void main(String[] args) {
		System.out.print("請輸入1~7之間的整數day，代表星期一到星期日：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("今天要上班。");
				break;
			case 6:
			case 7:
				System.out.println("今天休息。");
				break;
			default:
				System.out.println("輸入錯誤。");
				break;
		}
	}
}