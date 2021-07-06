/* 下面的程式中，我們先宣告一個介面 iVolume，再宣告一個抽象函數CSphere實作它。
01   
02   interface iVolume
03   {
04      public void showData();       // 顯示球體的資料
05      public double vol();           // 計算球體積
06   }
07   abstract class CSphere implements iVolume
08   {  
09      final double PI=3.14;
10      protected int x;
11      protected int y;
12   }
13   class CCircle extends CSphere
14   {   
15      // 請完成這個部分的程式碼
16   }
17   
18   public class hw11_13
19   {
20      public static void main(String args[])
21      {
22         CCircle cir=new CCircle(8,6,2);         
23         cir.showData();
24      }
25   }

(a).請在CCircle類別裡撰寫適當的程式，使得程式執行後的結果如下：
Output:
球心:(8,6)
半徑:2
球體積:33.49333333333333

(b)抽象函數CSphere雖然實作介面iVolume，可是在抽象函數CSphere裡卻沒有看到關於介面iVolume所宣告的showData() 與vol() method，為什麼可以編譯無誤？(請用附註寫在最後一段程式碼)
 */

package c10302;

interface iVolume {
	public void showData(); // 顯示球體的資料

	public double vol(); // 計算球體積
}

abstract class CSphere implements iVolume {
	final double PI = 3.14;
	protected int x;
	protected int y;

	public CSphere() {
	}

	public CSphere(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class CCircle extends CSphere {
	// (a).
	protected int radius; // 半徑

	public CCircle() {
	}

	public CCircle(int x, int y, int r) {
		super(x, y);
		this.radius = r;
	}

	public double vol() {
		return ((4.0 / 3) * PI * radius * radius * radius);
	}

	public void showData() {
		System.out.println("球心：(" + x + "," + y + ")");
		System.out.println("半徑：" + radius);
		System.out.println("球體積：" + vol());
	}

}

public class W14_class2 {
	public static void main(String[] args) {
		CCircle cir = new CCircle(8, 6, 2);
		cir.showData();
	}
}

/*
 * (b)抽象函數CSphere雖然實作介面iVolume，可是在抽象函數CSphere裡卻沒有看到關於介面iVolume所宣告的showData()
 * 與vol() method，為什麼可以編譯無誤？(請用附註//寫在最後一段程式碼) //
 * 因為CSphere為抽象類別，與介面相似，沒有實作會變為抽象函數，但在CCricle類別裡一定要實作才能執行，若在CCricle類別沒有實作，
 * 則CCricle類別會變為抽象類別。
 * 
 */