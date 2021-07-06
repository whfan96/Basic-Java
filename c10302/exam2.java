package c10302;

class cul {
	int getMax(int[][] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	double calAvg(int[][] a) {
		double ave = 0, total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				ave = total / (a[i].length * a.length);
			}
		}
		return ave;
	}
}

public class exam2 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		cul test = new cul();

		System.out.println("此二維陣列的最大值：" + test.getMax(a));
		System.out.println("此二維陣列所有元素的平均值：" + test.calAvg(a));
	}
}