public class odev34 {
    public static void main(String[] args) {
        int[] list1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double y = ort(list1);
        System.out.println(y);
    }

    public static double ort(int[] a) {
        int sayac = 0;
        double toplam = 0, ortalama;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                toplam += i;
                sayac++;
            }
        }
        ortalama = toplam / sayac;
        return ortalama;
    }
}
