/* 假設某個籠子裡有雞、兔若干隻, 共有 26 隻腳、8 個頭, 請撰寫程式分別算出雞與兔各有幾隻？

Output:
雞有 3隻
兔有 5隻
*/

package c10301;

public class W4_class2 {
	public static void main(String[] args) {
		int chickens, rabbits;
		int heads = 8, legs = 26;
		rabbits = (legs - 2 * heads) / 2;
		chickens = heads - rabbits;
		System.out.println("雞有" + chickens + "隻");
		System.out.println("兔有" + rabbits + "隻");
	}
}