// 試寫一程式, 讓使用者輸入任意正整數 N, 並利用 for 迴圈在螢幕上輸出 1 * 1、2 * 2、...、N * N 之結果。

import java.util.*;

public class W7_class1 {
	public static void main(String[] args) {
		System.out.println("請輸入任意正整數：");
		Scanner sc = new Scanner(System.in);
		/*
		 * for(int i=sc.nextInt();i>0;i--){ System.out.println(i+"*"+i+"="+(i*i)); }
		 */
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println(i + "*" + i + "=" + (i * i));
		}
	}
}