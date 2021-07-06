/* 下面的程式碼是修改自上一題作業，其中把抽象類別 CShape改以介面來宣告。請在CWin類別裡撰寫show() 及area() method的定義，使得我們可以利用CWin類別來顯示物件的width、height與面積。
01   // hw11_5, 介面實作
02   interface iShape
03   {
04      public void show();
05      public int area();             // 計算面積 
06   }
07   class CWin implements iShape
08   {
09      protected int width;
10      protected int height;
11   
12      // 請完成這個部分的程式碼
13   }
14   
15   public class hw11_5
16   {
17      public static void main(String args[])
18      {
19         CWin win=new CWin(5,7);    // 建立CWin類別的物件
20         win.show();
21      }
22   }

Output:
width=5
height=7
area=35
*/

package c10302;

interface iShape {
	public void show();
	public int area(); // 計算面積
}

class CWin_W13_2 implements iShape {
	protected int width;
	protected int height;

	public CWin_W13_2(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
		System.out.println("area=" + area());
	}

	public int area() {
		return (width * height);
	}
}

public class W13_class2 {
	public static void main(String[] args) {
		CWin_W13_2 win = new CWin_W13_2(5, 7); // 建立CWin_W13_2類別的物件
		win.show();
	}
}