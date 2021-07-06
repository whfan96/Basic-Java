/* 假設我們想設計一類別CSphere，可用來處理圓球的一些相關事務。CSphere類別初步的撰寫如下：
01   // hw9_10,
02   class CSphere
03   {
04      public double radius;
05      private int x;
06      private int y;
07      private int z;
08      
09      public void setX(int n)
10      {
11         x=n;
12      }
13      public void setY(int n)
14      {
15         y=n;
16      }
17      public void setZ(int n)
18      {
19         z=n;
20      }
21      public void setRadius(double r)
22      {
23         radius=r;
24      }
25      public void show()
26      {
27         System.out.print("x="+x+", y="+y+", z="+z);
28         System.out.println(", radius="+radius);
29      }
30   }
31  

32   public class hw9_10
33   {
34      public static void main(String args[])
35      {
36         CSphere sph=new CSphere();
37        
38         sph.setX(3);
39         sph.setY(6);
40         sph.setZ(8);
41         sph.setRadius(2.0);
42         sph.show();
43      }
44   }

上面的程式碼初步定義了CSphere類別，它具有五個資料成員，分別為圓周率pi、半徑radius與圓心座標x、y、z，以及五個method，分別為用來設定球心座標x、y、z的setX()、setY()、setZ()，設定半徑的setRadius()，和用來顯示圓球成員資訊的show()。
在main() 裡，我們設定了球心座標x為3，y為6，z為8，半徑為2.0。最後並利用show() 顯示各項資料內容。如果執行此一程式，可得到如下的執行結果：

x=3, y=6, z=8, radius=2.0

試依題意回答下列各題：

(1) 在CSphere類別裡，setX()、setY()與setZ() method分別是用來設定球心座標x、y、z。試撰寫另一method，public void setCenter(int num, int den)，可用來同時設定球心座標和半徑radius值。

Output:
x=3, y=6, z=8, radius=2.0
x=5, y=9, z=7, radius=3.0
*/

package c10302;

class CSphere_W5_1 {

   public double radius;
   private int x;
   private int y;
   private int z;

   public void setX(int n) {
      x = n;
   }

   public void setY(int n) {
      y = n;
   }

   public void setZ(int n) {
      z = n;
   }

   public void setRadius(double r) {
      radius = r;
   }

   public void show() {
      System.out.print("x=" + x + ", y=" + y + ", z=" + z);
      System.out.println(", radius=" + radius);
   }

   public void setCenter(int a, int b, int c, double r) {
      this.x = a;
      this.y = b;
      this.z = c;
      this.radius = r;
   }
}

public class W5_class1 {
   public static void main(String args[]) {
      CSphere_W5_1 sph = new CSphere_W5_1();
      sph.setX(3);
      sph.setY(6);
      sph.setZ(8);
      sph.setRadius(2.0);
      sph.show();
      sph.setCenter(5, 9, 7, 3);
      sph.show();
   }
}