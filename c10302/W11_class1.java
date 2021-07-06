/* 請完成下面的程式設計(改寫)：
(a)	在父類別CVolume裡加入一個show() method，它可顯示出 "printed from class CVolume" 字串。
(b)	在父類別CVolume裡加入一個int vol() method，直接傳回1。
(c)	在子類別CBox裡加入show() method，用來改寫父類別的show()。子類別的show() method可用來顯示CBox類別的資料成員length、width及height之值。
(d)	在子類別CBox裡加入vol() method，用來改寫父類別的vol()。子類別的vol() method可用來傳回面積length*width*height之值。
(e)	在子類別CBox裡建立無引數的建構元，直接將length、width及height之值設定為1。再建立有引數的建構元CBox(int l, int w, int h)，它可用來把length設值為l，把width設值為w，height設值為h。
(f)	如果我們以下面的敘述建立物件box1、box2

CBox box1=new CBox(2,3,4);
CBox box2=new CBox();
則以物件box1、box2呼叫show()及vol() method時，則是父類別的show()及vol() method會被呼叫，還是子類別的show()及vol() method會被呼叫？
*/

package c10302;

class CVolume {
	// (b)
	public int vol() {
		return 1;
	}

	// (a)
	public void show() {
		System.out.println("printed from class CVolume");
		System.out.println("Vol = " + vol());
	}
}

class CBox_W11 extends CVolume {
	protected int length, width, height;

	// (e)
	public CBox_W11() {
		length = 1;
		width = 1;
		height = 1;
	}

	public CBox_W11(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	// (d)
	public int vol() {
		return (length * width * height);
	}

	// (c)
	public void show() {
		System.out.println("lengrh = " + length + " , width = " + width + " , height = " + height);
		System.out.println("Vol = " + vol());
	}

}

public class W11_class1 {
	public static void main(String[] args) {
		// (f) Ans:子類別的show()及vol() method會被呼叫，父類別被遮蔽。
		CBox_W11 box1 = new CBox_W11(2, 3, 4);
		CBox_W11 box2 = new CBox_W11();
		box1.show();
		box2.show();
	}
}