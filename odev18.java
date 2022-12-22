public class odev18 {
    public static void main(String[] args) {
        int[] list = { 2, 5, 2, 9, 1, 11, 18 };
        int y = diziToplam(list);
        System.out.println(y);
    }

    public static int diziToplam(int[] a) {
        int toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam += a[i];
        }
        return toplam;
    }
}
