/* 請寫出一段程式，宣告變數 n=8
並在印出的地方使用變數n來印出以下內容。
8+8=16
8*5=40
*/

package c10301;

public class W2_class3 {
	public static void main(String[] args) {
		int n = 8;
		System.out.println(n + " + " + n + " = " + (n + n));
		System.out.println(n + " * 5" + " = " + (n * 5));
	}
}