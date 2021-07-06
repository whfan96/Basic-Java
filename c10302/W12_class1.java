/* 假設有一Car類別，用來表示車子的顏色，其資料成員及成員函數如下：

class Car
{
   public String color;

   public Car(String str)
   {
      color=str;
   }

   public void show()
   {
      System.out.println("車身顏色:"+color);
   }

}

(a)	試定義一個類別Truck，它繼承自Car類別，並改寫父類別的show() method，使得show() method可以印出Truck類別裡的資料成員id、owner及父類別裡的color成員。id、owner資料成員的型態皆為String。
(b)	試在Turck類別裡加入一個有引數的建構元Truck(String s1, String s2, String s3)，它可用來把color設值為s1，把id設值為s2，把owner設值為s3。
(c)	請於main() method裡加入下列敘述：

Car t1=new Truck("Blue","C2-5678","Ariel");      
t1.show();

Output:
車主姓名   車牌號碼    車身顏色
Ariel     C2-5678     Blue
*/

package c10302;

class Car {
	public String color;

	public Car() {
	}

	public Car(String str) {
		color = str;
	}

	public void show() {
		System.out.print("車身顏色：" + color);
	}
}

class Truck extends Car {
	public String id, ower;

	public Truck() {
	}

	public Truck(String s1, String s2, String s3) {
		color = s1;
		id = s2;
		ower = s3;
	}

	public void show() {
		super.show();
		System.out.println("，車主姓名 ：" + ower + "，車牌號碼：" + id);
	}
}

public class W12_class1 {
	public static void main(String[] args) {
		Car t1 = new Truck("Blue", "C2-5678", "Ariel");
		t1.show();
	}
}