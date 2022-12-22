public class odev20 {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4 };
        yaz(list);
    }

    public static void yaz(int[] a) {
        int sayi = a[0];
        boolean status = true;
        for (int i = 1; i < a.length; i++) {
            if (sayi > a[i]) {
                status = false;
                break;
            }
            sayi = a[i];
        }
        if (status) {
            System.out.println("Girilen dizi siralidir");
        } else {
            System.out.println("Girilen dizi sirali değildir");
        }
    }
}
