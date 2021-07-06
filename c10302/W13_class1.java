/* 下面的程式中，在抽象類別 CShape裡已定義好一個show()，以及一個abstract method。請在CWin類別裡撰寫area() method的定義，使得我們可以利用CWin類別來顯示物件的width、height與面積。例如，在第24行建立CWin類別的物件win後，便可利用它來執行第25行的呼叫。
01   // hw11_2, 抽象類別
02   abstract class CShape
03   {
04      protected int width;
05      protected int height;
06      
07      public void show()
08      {
09         System.out.println("width="+width);
10         System.out.println("height="+height);
11         System.out.println("area="+area());
12      }
13      public abstract int area();    // 計算面積 
14   }
15   class CWin extends CShape
16   {     
17      // 請完成這個部分的程式碼
18   }
19   
20   public class hw11_2
21   {
22      public static void main(String args[])
23      {
24         CWin win=new CWin(5,7);      // 建立CWin類別的物件
25         win.show();
26      }
27   }

Output:
width=5
height=7
area=35
*/

package c10302;

abstract class CShape {
	protected int width;
	protected int height;

	public CShape() {
	}

	public CShape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
		System.out.println("area=" + area());
	}

	public abstract int area(); // 計算面積
}

class CWin_W13_1 extends CShape {
	public CWin_W13_1() {
	}

	public CWin_W13_1(int width, int height) {
		super(width, height);
	}

	public int area() {
		return (width * height);
	}
}

public class W13_class1 {
	public static void main(String[] args) {
		CWin_W13_1 win = new CWin_W13_1(5, 7); // 建立CWin_W13_1類別的物件
		win.show();
	}
}