/* 請於正課所練習之下述題目，為各類別重新定義 toString() 方法, 以便能夠利用 System.out.println() 顯示學生或老師的個人資訊。

提示要件:
Personel[] persons = {
new Student("John",88,"940001",1),
new Student("Mary",87,"930001",2),
new Teacher("Mike",60,"英文"),
new Teacher("Jean",62,"國文")
};

Output:
Jean(62年次)：國文老師
John(88年次)：1年級學生 (學號：940001)
Mary(87年次)：2年級學生 (學號：930001)
Mike(60年次)：英文老師
 */

package c10302;

class Personel {
	protected String name;
	protected int birth;

	public Personel() {
	}

	public Personel(String n, int b) {
		name = n;
		birth = b;
	}

	public void show() {
		System.out.print(name + "(" + birth + "年次) ：");
	}
}

class Student extends Personel {
	protected String stuNo;
	protected int classNo;

	public Student() {
	}

	public Student(String n, int b, String sn, int cn) {
		super(n, b);
		stuNo = sn;
		classNo = cn;
	}

	public void show() {
		super.show();
		System.out.println(classNo + "年級學生（學號：" + stuNo + "）");
	}
}

class Teacher extends Personel {
	protected String subject;

	public Teacher() {
	}

	public Teacher(String n, int b, String sub) {
		super(n, b);
		subject = sub;
	}

	public void show() {
		super.show();
		System.out.println(subject + "老師");
	}
}

public class W11_class2 {
	public static void main(String[] args) {
		Personel[] persons = { new Teacher("Jean", 62, "國文"), new Student("John", 88, "940001", 1),
				new Student("Mary", 87, "930001", 2), new Teacher("Mike", 60, "英文") };
		for (int i = 0; i < persons.length; i++) {
			persons[i].show();
		}
	}
}