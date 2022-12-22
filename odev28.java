public class odev28 {
    public static void main(String[] args) {
        int[][] list = { { 2, 5 }, { 4, 9 } };
        yaz(list);
    }

    public static void yaz(int[][] a) {
        int toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam = 0;
            for (int j = 0; j < a[i].length; j++) {
                toplam += a[i][j];
            }
            System.out.println((i + 1) + " . satir toplami = " + toplam);
        }
    }
}
