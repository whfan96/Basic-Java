/* 請設定一個一維陣列a，陣列裡面包含{35,26,5,7,17,9,4,20,68,75,24,69,42,48,32,15}

1.請將a[]陣列所有內容列印出來
2.請將a[]陣列所有總和加總，並求出平均數，印出sum=__,average=__
3.請顯示最大值與最小值 max=? , min=?
4.請顯示a[4]為何? (請另行找方法)
*/

public class W10_homework {
	public static void main(String[] args) {
		int i, f, min, max, sum = 0;
		int[] a = { 35, 26, 5, 7, 17, 9, 4, 20, 68, 75, 24, 69, 42, 48, 32, 15 };
		f = max = min = a[0];
		System.out.print("(1)\t陣列的元素有 ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + "　");
			sum += a[i];

			if (i == 4) {
				f = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.print("\n(2)\t陣列的總合為：" + sum + "\n\t陣列總合的平均為：" + sum / a.length);
		System.out.print("\n(3)\t最大值為：" + max + "\n\t最小值為：" + min);
		System.out.println("\n(4)\t陣列a[4]為：" + f);
	}
}