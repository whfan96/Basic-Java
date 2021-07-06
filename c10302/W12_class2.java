/* 下面的程式碼定義了CAdd父類別，請先閱讀它，然後完成題目的要求：
01   class CAdd
02   {   
03      public int sum=0;
04     
05      public void add()
06      {
07         for(int i=1;i<=10;i++)
08            sum+=i;
09         System.out.println("1+2+...+10="+sum);
10      }       
11   }

(a)     試定義一個類別CAddto，它繼承自CAdd類別，並改寫了父類別的add() method，可用來計算並印出1+2+…+n的結果。
(b)     如果我們以下面的敘述建立物件ad1、ad2

CAddto ad1=new CAddto();
CAddto ad2=new CAddto(15);
並以物件ad1、ad2呼叫add() method時，希望能出現如下程式的執行結果，請將完整程式寫出。

1+2+...+10=55
1+2+...+15=120

Output:
1+2+...+10=55
1+2+...+15=120
*/

package c10302;

class CAdd {
	public int sum = 0;

	public CAdd() {
	}

	public void add() {
		for (int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("1+2+...+10=" + sum);
	}

}

// (a)
class CAddto extends CAdd {
	protected int n, sum = 0;

	public CAddto() {
		this.n = 10;
	}

	public CAddto(int n) {
		this.n = n;
	}

	public void add() {
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1+2+...+" + n + "=" + sum);
	}
}

public class W12_class2 {

	public static void main(String[] args) {
		// (b)
		CAddto ad1 = new CAddto();
		CAddto ad2 = new CAddto(15);
		ad1.add();
		ad2.add();
	}

}
