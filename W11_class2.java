/* 承上題，請求出
(a) 每一個時段的銷售總金額。
(b) 每一種水果的銷售總金額。
(c) 有最好業績（銷售總金額為最多者）的時段。
(d) 銷售總金額為最多的水果。

Output:
時段1的銷售總金額為 3420元
時段2的銷售總金額為 2424元
時段3的銷售總金額為 3476元

銷售總金額最多的時段為 3

水果A總銷售金額為 940元
水果B總銷售金額為 1304元
水果C總銷售金額為 2180元
水果D總銷售金額為 2496元
水果E總銷售金額為 2400元

銷售總金額最多的水果為 D */

public class W11_class2 {
    public static void main(String[] args) {
        String[] f = { "水果A", "水果B", "水果C", "水果D", "水果E" };
        for (int k = 0; k < 5; k++) {
            System.out.print("\t" + f[k]);
        }
        System.out.println();
        int[][] a = { { 68, 45, 56, 85, 76 }, { 77, 63, 65, 45, 23 }, { 43, 55, 97, 78, 61 } };
        int n = 0, max = 0, id = 0;
        int[] p = { 5, 8, 10, 12, 15 };
        for (int i = 0; i < 3; i++) {
            System.out.print("第" + (i + 1) + "時段");
            for (int j = 0; j < 5; j++) {
                System.out.print("\t" + a[i][j] + "");
            }
            System.out.println();
        }
        System.out.println("==========================================");
        System.out.println("(a)每一個時段的銷售總金額。");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                n += a[i][j] * p[j];
            }
            System.out.println("第" + (i + 1) + "時段的銷售總金額" + n + "元");
            n = 0;
        }
        System.out.println("==========================================");
        System.out.println("(b) 每一種水果的銷售總金額。");
        n = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                n += a[j][i] * p[i];
            }
            System.out.println(f[i] + "總銷售金額為 " + n + "元");
            n = 0;
        }
        System.out.println("==========================================");
        System.out.println("(c) 有最好業績（銷售總金額為最多者）的時段。");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                n += a[i][j] * p[j];
                if (n > max) {
                    max = n;
                    id = i + 1;
                }
            }
            n = 0;
        }
        System.out.println("銷售總金額最多的時段為" + id + "時段");

        System.out.println("==========================================");
        System.out.println("(d) 銷售總金額為最多的水果。");
        n = 0;
        id = 0;
        max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                n += a[j][i] * p[i];
                if (n > max) {
                    max = n;
                    id = i;
                }
            }
            n = 0;
        }
        System.out.println("銷售總金額最多的水果為" + f[id]);
    }
}