/* 請撰寫一個程式, 宣告 2 個陣列變數 a 與 b, 分別指向擁有同樣個數元素的陣列, 並且將 a 中元素依據 b 中對應位置的元素值調換位置。舉例來說, 如果 a 與 b 的內容如下：
    陣列 a： 20,30,40,50
    陣列 b： 1,3,0,2
	
	您的程式必須將陣列 a 的內容更改為：
	40,20,50,30
*/

package c10301;

public class W12_class1 {
	public static void main(String[] args) {
		int[] a = { 20, 30, 40, 50 };
		int[] b = { 1, 3, 0, 2 };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[b[i]] + " ");
		}
		System.out.println();
	}
}