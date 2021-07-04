/* 請為 AddMoney2.java 範例中的  IcCard 類別設計 1 個扣款方法, 方法會在卡片餘額足夠時扣款, 並傳回 true；餘額不足時停止扣款, 並傳回 false。

提示1:新增兩個方法
Boolean add(int value) {  // 加值方法：參數為要加值的金額
Boolean substract(int value) {  // 扣款方法：參數為要扣款的金額

提示2: Boolean add(int value) {  // 加值方法：參數為要加值的金額
    if (value>0 && value+money <= 10000) { // 儲值上限一萬
      money += value;
      return true;   // 加值成功
    }
    return false;    // 加值失敗
  }

指定條件:
1.加值 300 元
2.扣款 109 元
3.扣款 109 元

Output:
加值 300 元成功
卡片卡號 862423467, 餘額 600 元
扣款 109 元成功
卡片卡號 862423467, 餘額 491 元
扣款 209 元成功
卡片卡號 862423467, 餘額 282 元
*/

class IcCard_W15 {
	long id;
	int money;

	void show() {
		System.out.print("卡片卡號  " + id);
		System.out.print(" ,餘額  " + money + " 元 \n");
	}

	Boolean add(int value) {
		if (value > 0 && (value + money) <= 10000) {
			money += value;
			return true;
		}
		return false;
	}

	Boolean substract(int value) {
		if ((money - value) > 0 && (value + money) <= 10000) {
			money -= value;
			return true;
		}
		return false;
	}
}

public class W15_class1 {
	public static void main(String[] args) {
		IcCard_W15 Card = new IcCard_W15();
		Card.id = 0x336789A;
		Card.money = 0;

		System.out.println("加值 300 元  " + (Card.add(300) ? "成功" : "失敗"));
		Card.show();
		System.out.println("扣款 109 元  " + (Card.substract(109) ? "成功" : "失敗"));
		Card.show();
		System.out.println("扣款 209 元  " + (Card.substract(209) ? "成功" : "失敗"));
		Card.show();
	}
}