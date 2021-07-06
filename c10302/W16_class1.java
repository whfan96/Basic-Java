/* 下面的程式碼裡存在有兩個錯誤，第一個是除數為0，第二個是陣列索引值超出範圍。
01   
02   public class hw13_6
03   {
04      public static void main(String args[])
05      { 
06         int arr[]={4,12,87,21,6,18};  
07         int den[]={2,0,7,0,61,0};     
08         double sum=0.0;
09         
10         for(int i=0;i<=6;i++)            
11            sum+=(double)arr[i]/den[i];         
12         System.out.println("sum="+sum);              
13      }
14   }

試修改上一題的程式碼，使用try-catch區塊來捕捉由錯誤而產生的例外，其中catch區塊應可同時捕捉 "除數為0" 與 "陣列索引值超出範圍" 這兩種錯誤所造成的例外。
※在此習題中，由於陣列den[1]為0，程式執行時，先遇到den[1]，即拋出ArithmeticException例外，因此會先由顯示 "除數為 0" 的catch()接收。

Output:
除數為0
 */

package c10302;

public class W16_class1 {
	public static void main(String[] args) {
		int arr[] = { 4, 12, 87, 21, 6, 18 };
		int den[] = { 2, 0, 7, 0, 61, 0 };
		double sum = 0.0;
		try {
			for (int i = 0; i <= 6; i++)
				sum += arr[i] / den[i];
		}

		/*
		 * catch(ArithmeticException e){ System.out.println("發生例外："+e);
		 * System.out.println("分母不能為零！"); } catch(ArrayIndexOutOfBoundsException e){
		 * System.out.println("發生例外："+e); System.out.println("超出陣列範圍了！"); }
		 */

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("陣列索引值超出了範圍");
		}

		catch (ArithmeticException e) {
			System.out.println("除數為0");
		}

		/*
		 * catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
		 * System.out.println("發生錯誤了！"); }
		 */
		finally {
			System.out.println("sum=" + sum);
		}
	}
}