/* 假設您步行的速度為每秒 1 公尺, 而您的朋友小華步行的速度則為每秒 0.762公尺, 如果你們兩人在距離 200 公尺的操場面對面前進, 請撰寫程式計算出多久會相遇？ (請將所有變數都設為double型態)

Output:
113.50737797956867秒後相遇
*/

package c10301;

public class W4_homework2 {
	public static void main(String[] args) {
		double distance = 200; // 操場距離
		double time = distance / (0.762 + 1);
		System.out.print(time + "秒後相遇");
	}
}