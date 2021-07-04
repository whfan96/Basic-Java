/* 已知梯形面積為
(upper+base)*height/2
試在程式碼裡完成下列各敘述：
(a)    試建立一個名為CTrapezoid的類別，其資料成員及型態如下：
int upper;
int base;
int height;
(b)    試在CTrapezoid類別裡定義成員函數area()，用來計算並傳回梯形面積。
(c)    試在main() method裡建立一個CTrapezoid類別型態的物件obj。
(d)    將obj物件的upper設值為4，base設值為9，height設值為5。
(e)    試在CTrapezoid類別裡定義成員函數show()，印出各個資料成員之值。
(f)    在main() method裡呼叫show()及area () method。

Output:
upper=4
base=9
height=5
*/

package c10301;

//(a) 
class CTrapezoid {
	int upper, base, height, x;
	double a;

	// (b)
	void area() {
		a = ((upper + base) * height / 2);
		System.out.print("梯形面積為" + a);
	}

	void show() {
		System.out.print(" = " + x);
	}
}

public class W13_class2 {
	public static void main(String[] args) {
		// (c)
		CTrapezoid obj = new CTrapezoid();
		// (d)
		obj.upper = 4;
		obj.base = 9;
		obj.height = 5;
		// (e)
		CTrapezoid a, b, c;
		a = new CTrapezoid();
		b = new CTrapezoid();
		c = new CTrapezoid();
		a.x = obj.upper;
		b.x = obj.base;
		c.x = obj.height;
		// (f)
		System.out.print("upper");
		a.show();
		System.out.println();
		System.out.print("base");
		b.show();
		System.out.println();
		System.out.print("height");
		c.show();
		System.out.println();
		obj.area();
	}
}