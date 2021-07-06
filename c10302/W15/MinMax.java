package c10302.W15;

import c10302.W15.math.*;

public class MinMax {
	public static void main(String[] argv) {
		int[] data = { 9, 10, 37, 3, 29, 44, 9 };
		System.out.println("最小值：" + Utility.min(data));
		System.out.println("最大值：" + Utility.max(data));
	}
}
