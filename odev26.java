public class odev26 {
    public static void main(String[] args) {
        int[][] list = { { 2, 5 }, { 4, 9 } };
        int enBuyuk = buyuk(list);
        System.out.println(enBuyuk);
    }

    public static int buyuk(int[][] a) {
        int enb = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > enb) {
                    enb = a[i][j];
                }
            }
        }
        return enb;
    }
}
