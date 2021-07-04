/* 使用 BufferedReader、if判斷、Switch條件分支試寫一個程式, 比較兩個使用者輸入的數字的大小, 並依使用者選擇輸出四則運算的結果。

Output:
請輸入第一個數值：
20
請輸入第二個數值：
10
20比10大
請選擇(1)加(2)減(3)乘(4)除
1
20 + 10 = 30
*/

import java.io.*;

public class W6_class2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		System.out.println("請輸入一個任意整數：");
		String str = br.readLine();
		a = Integer.parseInt(str);

		System.out.println("請再輸入一個任意整數：");
		str = br.readLine();
		b = Integer.parseInt(str);

		if (a > b) {
			System.out.println(a + " > " + b);
		} else if (a < b) {
			System.out.println(a + " < " + b);
		} else {
			System.out.println(a + " = " + b);
		}

		System.out.println("請選擇兩數的四則運算(1加法,2減法,3乘法,4除法)：");
		String x = br.readLine();
		int y = Integer.parseInt(x);

		switch (y) {
			case 1:
				System.out.println(a + " + " + b + " = " + (a + b));
				break;
			case 2:
				System.out.println(a + " - " + b + " = " + (a - b));
				break;
			case 3:
				System.out.println(a + " * " + b + " = " + (a * b));
				break;
			case 4:
				System.out.println(a + " / " + b + " = " + (a / b));
				break;
			default:
				System.out.println("您輸入錯誤。");
				break;
		}
	}
}