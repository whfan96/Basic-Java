/* 於下面的程式碼中，請設計一子類別Cbbb_W8_1，繼承自Caaa_W8_1類別，並加入set_num() 與show() method，可用來設定從父類別繼承而來的成員x與y，及顯示x和y的值，並測試您的程式：
01   //hw10_1, 繼承的練習
02   class Caaa_W8_1
03   {
04      public int x;
05      public int y;  
06     
07      public void sub()
08      {
09          System.out.println(x+"*"+y+"="+x*y);
10      }
11   }
12   //請於此處設計子類別Cbbb_W8_1
13   public class hw10_1
14   {
15      public static void main(String args[])
16      {
17         Cbbb_W8_1 bb=new Cbbb_W8_1();
18         bb.set_num(5,10);
19         bb.show();
20         bb.sub();
21      }
22   }

Output:
x=5, y=10
5*10=50
*/

package c10302;

class Caaa_W8_1 {

   public int x;
   public int y;

   public Caaa_W8_1(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public Caaa_W8_1() {
   }

   public void sub() {
      System.out.println(x + "*" + y + "=" + x * y);
   }
}

// 請於此處設計子類別Cbbb_W8_1
class Cbbb_W8_1 extends Caaa_W8_1 {

   public Cbbb_W8_1() {
   }

   public Cbbb_W8_1(int a, int b) {
      super(a, b);
   }

   public void set_num(int a, int b) {
      this.x = a;
      this.y = b;
   }

   public void show() {
      System.out.println("x=" + x + " ,y=" + y);
   }
}

public class W8_class1 {
   public static void main(String args[]) {
      Cbbb_W8_1 bb = new Cbbb_W8_1();
      bb.set_num(5, 10);
      bb.show();
      bb.sub();
   }
}