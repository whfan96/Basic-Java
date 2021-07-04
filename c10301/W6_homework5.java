/* 判斷下列程式是否正確, 若有錯誤該如何改正？

01 public class HW_06 {
02   public static void main(String[] argv) {
03     String str = "100";
04
05     switch(str) {
06       case 100:
07         System.out.println("終於考到 100 分了");
08         break;
09       default:
10         System.out.println("可惜沒考到 100 分。");
11     }
12   }
13 }
*/

package c10301;

public class W6_homework5 {

	public static void main(String[] args) {
		String str = "100";
		switch (str) {
			case "100":
				System.out.println("終於考到 100 分了");
				break;
			default:
				System.out.println("可惜沒考到 100 分。");
				break;
		}
	}
}