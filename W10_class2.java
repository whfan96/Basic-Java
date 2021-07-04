/* 請設定一個一維陣列，並設定任意8個數字，最後求出陣列裡面的最大值與最小值，以及兩者之差。
例如: a={1,2,3,4,5,6,7,8}
最大值為:8
最小值為:1
兩者之差為:7
*/

public class W10_class2 {
	public static void main(String[] args) {
		int i, min, max;
		int[] a = { 50, 18, 37, 90, 25, 42, 63, 78 };

		max = min = a[0];
		System.out.print("陣列的元素有 ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "　");
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("\n最大值為：" + max);
		System.out.println("最小值為：" + min);
		System.out.print("最大值與最小值的差為：" + max + " - " + min + " = " + (max - min));
	}
}