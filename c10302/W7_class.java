/* 請就上周作業第二題，加入一個mathAvg()函數，計算數學平均分數，並列印出來，列印結果如下。

Output:
Name    Math    English
Fiona    86       92
Ryan     95       79
Ariel    81       83

數學平均分數=87.33333333333333
*/

package c10302;

class CScore_W7 {
	private String name; // 姓名
	private int math; // 數學成績
	private int eng; // 英文成績

	CScore_W7() {
		this("", 0, 0);
	}

	// (a)
	CScore_W7(String str, int m, int e) {
		this.name = str;
		this.math = m;
		this.eng = e;
	}

	public String getName() {
		return this.name;
	}

	public int getMath() {
		return this.math;
	}

	public int getEng() {
		return this.eng;
	}

	public static double mathAvg(CScore_W7 c[]) {
		double total = 0;
		for (int i = 0; i < c.length; i++) {
			total += c[i].math;
		}
		return (total / c.length);
	}

	public static void show(CScore_W7 c[]) {
		System.out.println("Name \t Math \t English");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getName() + " \t " + c[i].getMath() + " \t " + c[i].getEng());
		}
	}
}

public class W7_class {
	public static void main(String[] args) {
		// (b)
		CScore_W7[] a = { new CScore_W7("Fiona", 86, 92), new CScore_W7("Ryan", 95, 79), new CScore_W7("Ariel", 81, 83) };
		System.out.println("Name \t Math \t English");
		show(a);
		System.out.println();
		CScore_W7.show(a);
		System.out.println();
		System.out.println("數學平均為：" + CScore_W7.mathAvg(a));
	}
	// (c)
	private static void show(CScore_W7 a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getName() + " \t " + a[i].getMath() + " \t " + a[i].getEng());
		}
	}
}