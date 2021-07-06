/* 下面的程式中，我們先宣告一個介面 Data_W14，再宣告另一個介面Test_W14繼承它。
01
02   interface Data_W14
03   {  
04      public void best();           // 判斷那一科成績較高
05      public void failed();         // 判斷那一科成績低於60分
06   }
07   interface Test_W14 extends Data_W14
08   {
09      public void showData_W14();       // 顯示學生的資料及平均成績
10      public double average();      // 計算數學和英文的平均成績
11   }
12   class CWin_W14 implements Test_W14
13   {
14      protected String name;        // 姓名
15      protected int math;           // 數學成績
16      protected int english;        // 英文成績
17          
18      // 請完成這個部分的程式
19   }
20   
21   public class hw11_12
22   {
23      public static void main(String args[])
24      {
25         CWin_W14 stu=new CWin_W14("Judy",58,91);         
26         stu.show();
27      }
28   }

請在CWin_W14類別裡撰寫所有method的定義，再於CWin_W14類別中加入一個show() method，用來呼叫best()、failed()、showData_W14()與average()等method。使得程式執行後的結果如下：

Output:
姓名:Judy
數學成績:58
英文成績:91
平均成績:74.5
Judy的英文比數學好
Judy的數學當掉了
 */

package c10302;

interface Data_W14 {
	public void best(); // 判斷那一科成績較高

	public void failed(); // 判斷那一科成績低於60分
}

interface Test_W14 extends Data_W14 {
	public void showData_W14(); // 顯示學生的資料及平均成績

	public double average(); // 計算數學和英文的平均成績
}

class CWin_W14 implements Test_W14 {
	protected String name; // 姓名
	protected int math; // 數學成績
	protected int english; // 英文成績

	public CWin_W14() {
	}

	public CWin_W14(String name, int math, int english) {
		this.name = name;
		this.math = math;
		this.english = english;
	}

	public void best() {
		if (math > english) {
			System.out.println(name + "的數學比英文好");
		} else if (math < english) {
			System.out.println(name + "的英文比數學好");
		} else {
			System.out.println(name + "的數學和英文一樣好");
		}
	}

	public void failed() {
		if (english < 60 & math < 60) {
			System.out.println(name + "的數學和英文都當掉了");
		} else if (math < 60) {
			System.out.println(name + "的數學當掉了");
		} else if (english < 60) {
			System.out.println(name + "的英文當掉了");
		}
		if (math >= 60 && english >= 60) {
			System.out.println(name + "的數學和英文都及格了");
		}
	}

	public void showData_W14() {
		System.out.println("姓名：" + name);
		System.out.println("數學成績：" + math);
		System.out.println("英文成績：" + english);
		System.out.println("平均成績：" + average());
	}

	public double average() {
		return (double) (math + english) / 2;
	}

	public void show() {
		showData_W14();
		best();
		failed();
	}
}

public class W14_class1 {
	public static void main(String[] args) {
		CWin_W14 stu = new CWin_W14("Judy", 58, 91);
		stu.show();
	}
}