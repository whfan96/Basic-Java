/* 試由程式中直接設定一個1~12數值，如果超出此範圍，則印出 "月份不存在"，否則利用

switch印出相對應的季節：
3~5：春天
6~8：夏天
9~11：秋天
1、2、12：冬天

Output:
月份=11
秋天
*/

import java.util.*;

public class W6_homework1 {
	public static void main(String[] args) {
		System.out.print("請輸入月份(1~12月)：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
			case 3:
			case 4:
			case 5:
				System.out.println("您輸入的月份為" + a + "月是春天。");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("您輸入的月份為" + a + "月是夏天。");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("您輸入的月份為" + a + "月是秋天。");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("您輸入的月份為" + a + "月是冬天。");
				break;
			default:
				System.out.println("您輸入的月份為" + a + "月不存在。");
				break;
		}
	}
}