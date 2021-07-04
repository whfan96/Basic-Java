// 請建立一個陣列，設置10個學生成績，並求出10位學生的分數平均。(分數任意設定)

public class W10_class1 {
	public static void main(String[] args) {
		double[] score = { 85, 20, 43, 65, 78, 39, 91, 32, 55, 100 };
		double sum = 0;
		for (double a : score) {
			sum += a;
		}
		System.out.print("平均成績為：" + sum / score.length);
	}
}