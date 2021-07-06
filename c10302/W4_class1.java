/* 試依題意回答下列各題：
(a)	試設計類別CWin，內含cnt變數（初值設為0）與count() method，只要每建立一個物件，cnt的值便加1。也就是說，cnt可用來追蹤CWin物件建立的個數。
(b)	試設計一個建構元Cwin(String str,int w, int h)，當此建構元呼叫時，便會自動設定color=str，width=w，height=h。
(c)	請接續 (a) 的部份，請再設計一個沒有引數的建構元CWin()，使得當此建構元呼叫時，便會自動設定color="Red"，width=2，height=2。
(d)	試設計setZero() method，當此method呼叫時，cnt的值會被歸零。
(e)	試設計setValue(int n) method，當此method呼叫時，cnt的值會被設為n。
(f)	於本例中，cnt變數應該利用「實例變數」還是「類別變數」？為什麼？
(g)	於本例中，count() method應該定義成「實例函數」還是「類別函數」？或者是兩者都可以？

Output:
cnt=2 //第一次呼叫時加了一次，第二次呼叫時變成2
using setZero()...
cnt=0
using setValue(10)...
cnt=10
cnt=11
*/

package c10302;

class CWin {
	static int cnt = 0;
	String color;
	int width, height;

	// (a)
	public static void count() {
		cnt++;
	}

	// (b)
	public CWin(String str, int w, int h) {
		this.color = str;
		this.width = w;
		this.height = h;
		cnt++;
	}

	// (c)
	public CWin() {
		color = "Red";
		width = 2;
		height = 2;
		cnt++;
	}

	// (d)
	public void setZero() {
		this.cnt = 0;
		System.out.println("using setZero()...");
	}

	// (e)
	public void setValue(int n) {
		this.cnt = n;
		System.out.println("using setValue("+n+")...");
	}
}

public class W4_class1 {
	public static void main(String[] args) {
		CWin Cwin1 = new CWin();
		System.out.println("cnt = " + CWin.cnt + "  =>  color = " + Cwin1.color + ",  width = " + Cwin1.width
				+ ",  height = " + Cwin1.height);
		CWin Cwin2 = new CWin("green", 5, 10);
		System.out.println("cnt = " + CWin.cnt + "  =>  color = " + Cwin2.color + ",  width = " + Cwin2.width
				+ ",  height = " + Cwin2.height);
		Cwin1.setZero();
		System.out.println("cnt = " + CWin.cnt);
		Cwin1.setValue(10);
		System.out.println("cnt = " + CWin.cnt);
		Cwin1.count();
		System.out.println("cnt = " + CWin.cnt);
		CWin.count();
		System.out.println("cnt = " + CWin.cnt);
	}
}