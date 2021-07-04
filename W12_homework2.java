// 請修改課本範例題ParkFeeArray.java, 並改用一個 2 維陣列來計算停車費。

import java.io.*;

public class W12_homework2 {
	public static void main(String[] argv) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int[][] hf = { { 0, 2, 4, 6 }, { 30, 50, 80, 100 } };
		System.out.print("請輸入停車時數:");
		String s = b.readLine();
		int hours = Integer.parseInt(s);
		int fee = 0;
		int i = hf[0].length - 1;
		while (i > 0) {
			if (hf[0][i] < hours)
				break;
			i--;
		}
		while (i >= 0) {
			fee += (hours - hf[0][i]) * hf[1][i];
			hours = hf[0][i];
			i--;
		}
		System.out.println("停車時數：" + s + "小時");
		System.out.println("應繳費用：" + fee + "元整");
	}
}