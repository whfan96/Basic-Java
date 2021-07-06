/* 利用CScore_W6類別來記錄學生的資料，其類別的定義如下：
class CScore_W6{
private String name;    // 姓名
private int math;       // 數學成績
private int eng;        // 英文成績
}

    試依題意回答下列各題：

(a)     試設計一個建構元CScore_W6(String str,int m, int e)，當此建構元呼叫時，便會自動設定name=str，math=m，eng=e。

(b)     請利用CScore_W6類別型態的陣列儲存以下的資料：
Name    Math    English
Fiona    86       92
Ryan     95       79
Ariel    81       83

(c)      試撰寫show(CScore_W6 c[]) method，用來顯示類別物件陣列內所有的資料。傳入show() method的是一整個類別物件陣列。輸出的格式請參考(b)題中的表格。

Output: 
Name    Math    English
Fiona    86       92
Ryan     95       79
Ariel    81       83
*/

package c10302;

class CScore_W6 {

	private String name; // 姓名
	private int math; // 數學成績
	private int eng; // 英文成績

	CScore_W6() {
		this("", 0, 0);
	}

	// (a)
	CScore_W6(String str, int m, int e) {
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

	public static double mathAvg(CScore_W6 c[]) {
		double total = 0;
		for (int i = 0; i < c.length; i++) {
			total += c[i].math;
		}
		return (total / c.length);
	}

	public static void show(CScore_W6 c[]) {
		System.out.println("Name \t Math \t English");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getName() + " \t " + c[i].getMath() + " \t " + c[i].getEng());
		}
	}
}

public class W6_class2 {
	public static void main(String[] args) {
		// (b)
		CScore_W6[] a = { new CScore_W6("Fiona", 86, 92), new CScore_W6("Ryan", 95, 79), new CScore_W6("Ariel", 81, 83) };
		System.out.println("Name \t Math \t English");
		show(a);
		System.out.println();
		CScore_W6.show(a);
		System.out.println();
		System.out.println("數學平均為：" + CScore_W6.mathAvg(a));
	}

	// (c)
	private static void show(CScore_W6 a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].getName() + " \t " + a[i].getMath() + " \t " + a[i].getEng());
		}
	}
}