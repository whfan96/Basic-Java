/* 已知圓的面積為:半徑x半徑x3.14
請建立一個Circle的類別，在類別裡面放入屬性與area()的方法，並於main方法的地方呼叫area()，再印出圓的面積。圓的半徑請自行設定。
*/

import java.util.*;

class Circle {
	double r;

	void area() {
		double PI = 3.14;
		System.out.print("圓面積為" + r * r * PI);
	}
}

public class W13_class1 {
	public static void main(String[] args) {
		System.out.print("請輸入圓的半徑:");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextInt();
		Circle a = new Circle();
		a.r = c;
		a.area();
	}
}