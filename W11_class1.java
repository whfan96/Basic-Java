/* 假設某一商店有五種水果A、B、C、D與E，一顆的單價分別為5、8、10、12與15元；該商店分為三個時段早上、下午和晚上，這三個時段在某日的銷售量如下所示：

		水果A	水果B	水果C	水果D		水果E
1(早上)		68		45		56		85		76
2(下午)		77		63		65		45		23
3(晚上)		43		55		97		78		61

試寫一程式使用多維陣列印出上表的內容：
*/

public class W11_class1 {
	public static void main(String[] args) {
		String[] f = { "水果A", "水果B", "水果C", "水果D", "水果E" };
		for (int k = 0; k < 5; k++) {
			System.out.print("\t" + f[k]);
		}
		System.out.println();
		int[][] a = { { 68, 45, 56, 85, 76 }, { 77, 63, 65, 45, 23 }, { 43, 55, 97, 78, 61 } };
		for (int i = 0; i < 3; i++) {
			System.out.print("時段" + (i + 1) + "\t");
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}