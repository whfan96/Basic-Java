/* 考慮以下的程式片段，它會根據判斷式的結果，輸出變數s所儲存的分數是否及格：
if(s >59 ) {
System.out.println(s+"：及格") ;
}
if(s <60) {
System.out.println(s+"：不及格") ;
}
請利用if-else語法，改寫這段程式。
*/

import java.util.*;

public class W6_homework2 {
	public static void main(String[] args) {
		System.out.print("請輸入分數：");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		if (s < 60) {
			System.out.println(s + "：不及格");
		} else {
			System.out.println(s + "：及格");
		}
	}
}