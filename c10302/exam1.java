package c10302;

public class exam1 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 6; j >= (i * 2); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}