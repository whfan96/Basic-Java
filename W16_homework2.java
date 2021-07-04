/* 試求球型體積，公式:4/3.0*pi*radius*radius*radius 試在程式碼裡完成下列各敘述：
(a)    試建立一個名為CSphere的類別，其資料成員及型態如下：
double pi=3.14;
double radius;
(b)    試在CSphere類別裡定義成員函數volume()，用來計算並傳回球的體積。
(c)    試在main() method裡建立一個CSphere類別型態的物件sph。
(d)    將sph物件的radius之值設為2。
(e)    印出sph物件的radius與球體積之值。

Output:
radius=2.0
volume=33.49333333333333
 */

class CSphere {
	// (a)
	double pi = 3.14, radius;

	// (b)
	void volume() {
		double total = 0;
		total = (4 * pi * radius * radius * radius) / 3;
		System.out.print("volume = " + total);
	}
}

public class W16_homework2 {
	public static void main(String[] args) {
		// (c)
		CSphere sph = new CSphere();
		// (d)
		sph.radius = 2;
		// (e)
		System.out.println("radius = " + sph.radius);
		sph.volume();
	}
}