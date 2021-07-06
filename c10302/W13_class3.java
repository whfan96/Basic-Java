/* class CWin_W13
{
   protected String id;       // 學號
   protected String name;     // 姓名
   protected int mid;         // 期中考成績
   protected int finl;        // 期末考成績
   protected int common;      // 平時成績
}

下面的程式中，在介面 Data_W13裡已定義好一個showData_W13()，用來顯示學生的學號及姓名。介面 Test_W13裡已定義好showScore()，用來顯示學生的各項成績；calcu() method則是將學期成績以期中、期末考佔30%，平時成績佔40%的方式計算。試完成下面的程式，使得輸出的項目，除了該生的資料之外，還要顯示學期成績。

01   // hw11_11, 多重繼承的練習
02   interface Data_W13
03   {  
04      public void showData_W13();  
05   }
06   interface Test_W13
07   {
08      public void showScore();
09      public double calcu();
10   }
11   
12   // 請完成這個部分的程式
13   
14   public class hw11_11
15   {
16      public static void main(String args[])
17      {
18         CWin_W13 stu=new CWin_W13("940001","Fiona",90,92,85);
19         stu.show();
20      }
21   }

Output:
學號:940001
姓名:Fiona
期中考成績:90
期末考成績:92
平時成績:85
學期成績:88.6
*/

package c10302;

interface Data_W13 {
	public void showData_W13();
}

interface Test_W13 {
	public void showScore();
	public double calcu();
}

class CWin_W13 implements Data_W13, Test_W13 {
	protected String id; // 學號
	protected String name; // 姓名
	protected int mid; // 期中考成績
	protected int finl; // 期末考成績
	protected int common; // 平時成績

	public CWin_W13(String id, String name, int mid, int finl, int common) {
		this.id = id;
		this.name = name;
		this.mid = mid;
		this.finl = finl;
		this.common = common;
	}

	public void show() {
		showData_W13();
		showScore();
	}

	public void showData_W13() {
		System.out.println("學號：" + id + "\n姓名：" + name);
	}

	public void showScore() {
		System.out.println("期中考成績：" + mid + "\n期末考成績：" + finl + "\n平時成績" + common + "\n學期成績" + calcu());
	}

	public double calcu() {
		return (mid * 0.3 + finl * 0.3 + common * 0.4);
	}
}

public class W13_class3 {
	public static void main(String[] args) {
		CWin_W13 stu = new CWin_W13("940001", "Fiona", 90, 92, 85);
		stu.show();
	}
}