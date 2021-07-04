// 請利用課本8-15頁範例將陣列添加到5個空間。

package c10301;

class IcCard_W14 {
	long id;
	int money;

	void showInfo() {
		System.out.print("卡片卡號 " + id);
		System.out.println(" ，餘額 " + money + " 元");
	}
}

public class W14_class1 {
	public static void main(String[] args) {
		IcCard_W14[] manyCards = new IcCard_W14[5];
		for (int i = 0; i < manyCards.length; i++) {
			manyCards[i] = new IcCard_W14();
			manyCards[i].id = 0x336789AB + i;
			manyCards[i].money = 100 + i * 123;
		}

		for (IcCard_W14 c : manyCards) {
			c.showInfo();
		}
	}
}