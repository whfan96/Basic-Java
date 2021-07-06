package c10302.W15;

import c10302.W15.utility.*;

public class QuickSort {
	public static void main(String[] argv) {

		int[] data = new int[argv.length]; // argv傳入要排序的資料

		// 將傳入的資料轉為整數
		for (int i = 0; i < data.length; i++) {
			data[i] = java.lang.Integer.parseInt(argv[i]);
		}
		// 排序
		Sorter s = new Sorter();
		s.sort(data);
	}
}