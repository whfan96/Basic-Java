// 請寫出一段程式，印出Long、Short、Int、Byte的最大值、最小值。

public class W3_class1 {
	public static void main(String[] args) {
		long lmax = java.lang.Long.MAX_VALUE, lmin = java.lang.Long.MIN_VALUE;
		int imax = java.lang.Integer.MAX_VALUE, imin = java.lang.Integer.MIN_VALUE;
		short smax = Short.MAX_VALUE, smin = Short.MIN_VALUE;
		byte bmax = Byte.MAX_VALUE, bmin = Byte.MIN_VALUE;

		System.out.println("Max value of long : " + lmax);
		System.out.println("Min value of long : " + lmin);
		System.out.println("Max value of int : " + imax);
		System.out.println("Min value of int : " + imin);
		System.out.println("Max value of short : " + smax);
		System.out.println("Min value of short : " + smin);
		System.out.println("Max value of byte : " + bmax);
		System.out.println("Min value of byte : " + bmin);
	}
}