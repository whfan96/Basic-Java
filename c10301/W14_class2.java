// 請撰寫一個方法, 可以傳入一個整數陣列(8個任意數值), 並將陣列內各元素的平均值傳回。

package c10301;

class inter {
	public double aveg(int[] elements) {
		double sum = 0, total = 0;
		for (int i : elements) {
			sum += i;
			total = sum / i;
		}
		return total;
	}
}

public class W14_class2 {
	public static void main(String[] args) {
		int[] elements = { 1, 2, 3, 4, 5, 6, 7, 8 };
		inter math = new inter();
		System.out.print("陣列內容：");
		for (int i : elements) {
			System.out.print(i + ", ");
		}
		System.out.print("\n加總平均值為：" + math.aveg(elements));
	}
}