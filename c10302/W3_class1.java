/* 假設我們要設計一個CBox_W3類別，用來表示立體的箱子。此類別內含長（length）、寬（width）與高（height）三個資料成員，其部份程式碼撰寫如下：

01   // hw8_13, 箱子類別
02   class CBox_W3
03   {
04      int length=1;
05      int width=1;
06      int height=1;
07     
08      void setL(int l)  // 設定長度的method
09      {  
10         // 請在此處填上程式碼
11      }
12      void setW(int w)  // 設定寬度的method
13      {  
14         // 請在此處填上程式碼
15      }
16      void setH(int h)  // 設定高度的method
17      {   
18         height=h;
19      }
20        
21      public void show()
22      {
23          System.out.print("L="+length);
24          System.out.print(", W="+width);
25          System.out.println(", H="+height);
26      }   
27   }
28  
29   public class hw8_13
30   {
31      public static void main(String args[])
32      {
33         CBox_W3 box=new CBox_W3();
34         box.setL(6);     
35         box.setW(5);
36         box.setH(3);
37         box.show();
38      }
39   }

(a)     於上面的程式碼中，setL() 與setW() 兩個method並沒有填上程式碼。試將它們完成，使得它們可以分別用來設定CBox_W3物件的length與width成員的值。
(b)     試加入setBox(int w, int h) method，使得它可以同時設定CBox_W3物件的width與height。
(c)      接續上題，請多載setBox() method，使得它可以同時設定CBox_W3物件的length、width與height三個資料成員。

Output:
L=6, W=5, H=3
L=1, W=8, H=4
L=2, W=4, H=6
*/

package c10302;

class CBox_W3 {
	int length = 1;
	int width = 1;
	int height = 1;

	void setL(int l) { // 設定長度的method
		length = l;
	}

	void setW(int w) { // 設定寬度的method
		width = w;
	}

	void setH(int h) { // 設定高度的method
		height = h;
	}

	public void show() {
		System.out.print("L=" + length);
		System.out.print(", W=" + width);
		System.out.println(", H=" + height);
	}

	void setBox(int w, int h) {
		width = w;
		height = h;
	}

	void setBox(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
}

public class W3_class1 {
	public static void main(String[] args) {
		CBox_W3 box = new CBox_W3();

		box.setL(6);
		box.setW(5);
		box.setH(3);
		box.show();

		box.setL(1);
		box.setBox(8, 4);
		box.show();

		box.setBox(2, 4, 6);
		box.show();
	}
}