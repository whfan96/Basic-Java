/* 請使用8-4-1多重定義的技巧, 撰寫不論是傳入整數陣列或是浮點數陣列, 都可以傳回陣列內所有元素平均值的方法。

int[] elements1 = {2,4,5,6,7};
double[] elements2 = {2.3,4.5,5.7,6.8,7.0};

Output:
陣列內容：2 4 5 6 7
平均值為：4.8
陣列內容：2.3 4.5 5.7 6.8 7.0
平均值為：5.26
*/

class Test {
	double method(int[] value) {
		double total = 0, ave = 0;
		for (int i = 0; i < value.length; i++) {
			total += value[i];
			ave = (total / value.length);
		}
		return ave;
	}

	double method(double[] value) {
		double total = 0, ave = 0;
		for (int i = 0; i < value.length; i++) {
			total += value[i];
			ave = (total / value.length);
		}
		return ave;
	}
}

public class W15_class2 {
	public static void main(String[] args) {
		int[] elements1 = { 2, 4, 5, 6, 7 };
		double[] elements2 = { 2.3, 4.5, 5.7, 6.8, 7.0 };
		Test A = new Test();
		System.out.print("陣列內容：");
		for (int i = 0; i < elements1.length; i++) {
			System.out.print(elements1[i] + "  ");
		}
		System.out.println();
		System.out.println("加總值平均為：" + A.method(elements1));
		System.out.print("陣列內容：");
		for (int i = 0; i < elements2.length; i++) {
			System.out.print(elements2[i] + "  ");
		}
		System.out.println();
		System.out.println("加總值平均為：" + A.method(elements2));
	}
}