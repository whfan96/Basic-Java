/* 接續上一個習題，並逐步完成下面的程式設計：
(a)   試在Caaa_W8_2類別裡加入一個沒有引數的建構元Caaa_W8_2()，它可用來把x和y設定初值為5。
(b)   試在Caaa_W8_2類別裡加入另一個有引數的建構元Caaa_W8_2(int a, int b)，它可用來把x設值為a，把y設值為b。
(c)   試在Cbbb_W8_2類別內裡加入建構元Cbbb_W8_2(int a, int b)，可用來呼叫父類別的建構元Caaa_W8_2(int a, int b)。
(d)   在main() method裡撰寫程式碼，並測試 (a)~(c) 的結果。

 
Output:
x=3, y=8 ,3*8=24
x=5, y=5 ,5*5=25
*/
package c10302;

class Caaa_W8_2 {

   public int x;
   public int y;

   // (a)
   public Caaa_W8_2() {
      this.x = 5;
      this.y = 5;
   }

   // (b)
   public Caaa_W8_2(int a, int b) {
      this.x = a;
      this.y = b;
   }

   public void sub() {
      System.out.println(x + "*" + y + "=" + x * y);
   }
}

// 請於此處設計子類別Cbbb_W8_2
class Cbbb_W8_2 extends Caaa_W8_2 {

   public Cbbb_W8_2() {
   }

   // (c)
   public Cbbb_W8_2(int a, int b) {
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

public class W8_class2 {
   public static void main(String args[]) {
      Cbbb_W8_2 bb1 = new Cbbb_W8_2(3, 8);
      bb1.show();
      bb1.sub();

      Cbbb_W8_2 bb2 = new Cbbb_W8_2();
      bb2.show();
      bb2.sub();
      bb2.set_num(5, 10);
      bb2.show();
      bb2.sub();
   }
}