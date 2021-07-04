/* 試寫一個程式, 讓使用者可以輸入密碼, 
密碼錯誤時, 系統會輸出"您的密碼錯誤", 
密碼正確時輸出"您的密碼正確"。密碼為數字所組成, 範圍介於 1000~9999之間,密碼由程式設計者自行定義。
*/

import java.util.*;

public class W6_homework3 {
	public static void main(String[] args) {
		System.out.print("請輸入密碼（範圍介於1000~9999）：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), password = 3501;
		if (password == a) {
			System.out.println("您輸入的密碼正確。");
		} else {
			System.out.println("您輸入的密碼錯誤。");
		}
	}
}