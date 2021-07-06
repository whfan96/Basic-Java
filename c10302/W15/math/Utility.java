package c10302.W15.math;

public class Utility {
	public static int min(int[] data) {
		int min = data[0]; // 先將元素 0 當成最小值

		// 逐一檢查陣列元素, 有無比 min 更小的值
		for (int i = 1; i < data.length; i++) {
			min = (min <= data[i]) ? min : data[i];
		}
		return min;
	}

	public static int max(int[] data) {
		int max = data[0]; // 先將元素 0 當成最大值
		// 逐一檢查陣列元素, 有無比 max 更大的值
		for (int i = 1; i < data.length; i++) {
			max = (max >= data[i]) ? max : data[i];
		}
		return max;
	}
}