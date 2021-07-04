// 請寫出一段程式碼，使用字元變數ch1、ch2、ch3、ch4...印出你的英文名字，字元必須包含十進位、八進位、十六進位格式。

package c10301;

public class W3_class2 {
	public static void main(String[] args) {
		char ch1 = '\u0059';
		char ch2 = '\165';
		char ch3 = 109;
		char ch4 = 'e';
		System.out.println("My english name is " + ch1 + ch2 + ch3 + ch4 + ".");
	}
}