/* 已知男生標準體重 = (身高 - 80)*0.7；女生標準體重 = (身高 - 70)*0.6, 
試寫一程式可以計算男生女生的標準體重 (提示：先選擇性別, 再決定應套用哪一個公式)。
*/

package c10301;

import java.util.Scanner;

public class W6_homework4 {
	public static void main(String[] args) {
		System.out.println("請輸入性別(1)男(2)女：");
		Scanner sc = new Scanner(System.in);
		int sex = sc.nextInt();
		System.out.println("請輸入身高：");
		Scanner y = new Scanner(System.in);
		int h = y.nextInt();

		if (sex == 1) {
			System.out.println(h + " 公分的男生理想體重為 " + (h - 80) * 0.7 + "公斤");
		} else if (sex == 2) {
			System.out.println(h + " 公分的女生理想體重為 " + (h - 70) * 0.6 + "公斤");
		} else {
			System.out.println("此種性別尚無公式可計算");
		}
	}
}