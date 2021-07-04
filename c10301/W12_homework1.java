// 請將陣列{5.3.6.7.8.1.12.9}使用泡沫排序法排序，並列印出排序後的元素。

package c10301;

public class W12_homework1 {
	public static void main(String[] args) {
		int[] array = { 5, 3, 6, 7, 8, 1, 12, 9 };
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int change = 0; change < array.length - 1 - i; change++) {
				if (array[change] > array[change + 1]) {
					temp = array[change];
					array[change] = array[change + 1];
					array[change + 1] = temp;
				}
			}
		}
		for (int k : array) {
			System.out.print(" " + k);
		}
	}
}