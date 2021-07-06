package c10302.W15.utility;

public class Sorter {
	int[] data;

	void quickSort(int start, int end) {
		// 如果只有一個元素，直接返回
		if (start >= end) {
			return;
		}

		// 取得中間元素的值
		int mid = data[(start + end) / 2];

		int left = start;
		int right = end;
		while (left < right) { // 還未相遇
			// 往尾端搜尋
			while ((left < end) && (data[left] < mid)) {
				left++;
			}

			// 往前端搜尋
			while ((right > start) && (data[right] > mid)) {
				right--;
			}

			// 還未交錯
			if (left <= right) {
				int temp = data[left]; // 交換元素
				data[left] = data[right];
				data[right] = temp;
				left++; // 往尾端移動
				right--; // 往前端移動
				show();
			}
		}

		// 遞迴排序前後兩段
		quickSort(start, right);
		quickSort(left, end);
	}

	void show() {
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

	public void sort(int[] data) {
		this.data = data;
		show();
		quickSort(0, data.length - 1); // 排序整個陣列
	}
}