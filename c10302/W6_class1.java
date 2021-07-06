// 請撰寫一個程式，以使用規則表示法的方式，要求使用者輸入正確格式的電子郵件信箱(假設使用者名稱及網域中都只有小寫英文字母)。

package c10302;

import java.io.*;

public class W6_class1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		boolean istrue;
		do {
			istrue = true;
			System.out.print("請輸入正確格式的電子郵件信箱：");
			str = br.readLine();

			if (!str.matches("[a-z]+@[a-z]+(\\.[a-z]+)+")) {
				System.out.println("輸入格式錯誤，請重新輸入xxxx@xxxx.xxxx的格式！");
				istrue = false;
			} else {
				System.out.println("輸入正確，您輸入的電子郵件信箱為：" + str);
			}
		} while (!istrue);
	}
}