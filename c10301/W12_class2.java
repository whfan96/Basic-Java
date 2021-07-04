// 請撰寫一個程式, 透過使用者傳入任意個數的數值, 將這些數值排序後顯示出來。

package c10301;

import java.io.*;

public class W12_class2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i, max = 0, o;
		System.out.print("請輸入你想要幾個數值：");
		String s = br.readLine();
		i = Integer.parseInt(s);
		int[] a = new int[i];
		for (int c = 0; c < a.length; c++) {
			System.out.print("第" + (c + 1) + "的數為");
			s = br.readLine();
			a[c] = Integer.parseInt(s);
		}
		System.out.print("\n");
		for (int d = 0; d < a.length; d++) {
			for (int e = 0; e < a.length - 1 - d; e++) {
				if (a[e] > a[e + 1]) {
					o = a[e];
					a[e] = a[e + 1];
					a[e + 1] = o;
				}
			}
		}
		System.out.print("數字由小到大為");
		for (int k : a) {
			System.out.print(" " + k);
		}
		System.out.println();
	}
}