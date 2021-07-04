/* 設下列各運算式中，a的初值皆為10，b的初值皆為20，試寫出下列各式中，經運算過後的num、a與b之值：
(a) num=(a++)-b
(b) num=(-b)*a
(c) num=(a++)+(++b)
(d) num=(--a)+( b--)
(e) a+=a*(b++)
*/

package c10301;

public class W4_class3 {
	public static void main(String[] args) {
		int a = 10, b = 20, num;
		System.out.println("(a) num=(a++)-b");
		num = (a++) - b;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("The value of num is " + num);

		System.out.println("(b) num=(-b)*a");
		num = (-b) * a;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("The value of num is " + num);

		System.out.println("(c) num=(a++)+(++b)");
		num = (a++) + (++b);
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("The value of num is " + num);

		System.out.println("(d) num=(--a)+( b--)");
		num = (--a) + (b--);
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		System.out.println("The value of num is " + num);

		System.out.println("(e) a+=a*(b++)");
		a += a * (b++);
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	}
}